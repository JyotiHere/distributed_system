package warehouse_CA.warehouseControl;

import java.util.Random;
import java.util.logging.Logger;

import warehouse_CA.warehouseControl.TempResponse;
import warehouse_CA.warehouseControl.TempRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import warehouse_CA.automateOrders.OrderDetailsRequest;
import warehouse_CA.automateOrders.OrderDetailsResponse;
import warehouse_CA.warehouseControl.LightRequest;
import warehouse_CA.warehouseControl.LightResponse;
import warehouse_CA.warehouseControl.WarehouseControlClient;
import warehouse_CA.warehouseControl.warehouseControlGrpc;

public class WarehouseControlClient {
	
	// First we create a logger to show client side logs in the console. logger instance will
			//be used to log different events at the client console.
					// This is optional. Could be used if needed.
				private static  Logger logger = Logger.getLogger(WarehouseControlClient.class.getName());

				// Creating stubs for establishing the connection with server.
					// Blocking stub
				private static warehouseControlGrpc.warehouseControlBlockingStub blockingStub;
				// Asynch stub
				private static warehouseControlGrpc.warehouseControlStub asyncStub;
				
				// The main method will have the logic for client.
				public static void main(String[] args) throws Exception {
					// First a channel is being created to the server from client. Here, we provide 
					//the server name (localhost) and port (50057).
					// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).

					ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50057).usePlaintext().build();

					//stubs -- generate from proto
					blockingStub = warehouseControlGrpc.newBlockingStub(channel);
					asyncStub = warehouseControlGrpc.newStub(channel);
					
					// RPC call with Asynchronous stub
					//splitAsync();
					
					//Client streaming
					changeTemp();
					
					//bidirectional streaming
					turnOnOffLights();
					
					// Closing the channel once message has been passed.		
					channel.shutdown();

				}
				
				
				
				//Client Streaming

			       public static void changeTemp() {

			           // Handling the stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
			            StreamObserver<TempResponse> responseObserver = new StreamObserver<TempResponse>() {

			               @Override
			                public void onNext(TempResponse value) {
			                    System.out.println("Requested Tempreature: " + value.getCorrectTemperature());
			                }

			               @Override
			                public void onError(Throwable t) {
			                    // TODO Auto-generated method stub

			               }

			               @Override
			                public void onCompleted() {
			                    System.out.println("The tempreature has been changed ");
			               }

			           };

			           // Here, we are calling the Remote TempRegulator method. Using onNext, client sends a stream of messages.
			            StreamObserver<TempRequest> requestObserver = asyncStub.changeTemp(responseObserver);

			           try {

			               requestObserver.onNext(TempRequest.newBuilder().setCurrentTemperature("28 degree").setRoomId("999").build());
			                requestObserver.onNext(TempRequest.newBuilder().setCurrentTemperature("20 degree").setRoomId("100").build());
			                requestObserver.onNext(TempRequest.newBuilder().setCurrentTemperature("22 degree").setRoomId("200").build());
			                requestObserver.onNext(TempRequest.newBuilder().setCurrentTemperature("19 degree").setRoomId("300").build());

			               System.out.println("SENDING INFORMATION");

			               // Mark the end of requests
			                requestObserver.onCompleted();
			                
			                System.out.println("Temperature has been received");

			               // Sleep for a bit before sending the next one.
			                Thread.sleep(new Random().nextInt(1000) + 500);


			            } catch (RuntimeException e) {
			                e.printStackTrace();
			            } catch (InterruptedException e) {            
			                e.printStackTrace();
			            }


			        }
				
				
				
		//BI-DIRECTIONAL---
				
				public static void turnOnOffLights() {
			           // Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
			            StreamObserver<LightResponse> responseObserver = new StreamObserver<LightResponse>() {
			                		               		                
			                @Override
			                public void onNext(LightResponse value) {
			                	System.out.println("\n-----Turn on off lights method------");
			                	System.out.println("Light control request:\n " + value.getLightOnOff());
			                    
			                }

			               @Override
			                public void onError(Throwable t) {
			                    // TODO Auto-generated method stub
			               

			               }

			               @Override
			                public void onCompleted() {
			                    // TODO Auto-generated method stub
			                    System.out.println("Light control request information..");
			                }

			           };

			           // Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
			            StreamObserver<LightRequest> requestObserver = asyncStub.turnOnOffLights(responseObserver);

			           try {
			               requestObserver.onNext(LightRequest.newBuilder().setRoomId("505").build());

			               System.out.println("SENDING MESSAGES");

			               // Mark the end of requests
			                requestObserver.onCompleted();

			                // Sleep for a bit before sending the next one.
			                Thread.sleep(new Random().nextInt(1000) + 500);

			            } catch (RuntimeException e) {
			                e.printStackTrace();
			            } catch (InterruptedException e) {            
			                e.printStackTrace();
			            }
			        }
				
				

}
