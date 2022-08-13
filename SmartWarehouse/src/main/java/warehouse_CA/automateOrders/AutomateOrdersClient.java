package warehouse_CA.automateOrders;

import java.util.Iterator;
import java.util.Random;
import java.util.logging.Logger;

import warehouse_CA.automateOrders.OrderDetailsRequest;
import warehouse_CA.automateOrders.OrderDetailsResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import warehouse_CA.automateOrders.AutomateOrdersClient;
import warehouse_CA.automateOrders.automateOrdersGrpc;
import warehouse_CA.automateOrders.Empty;
import warehouse_CA.automateOrders.OrderStatusRequest;
import warehouse_CA.automateOrders.OrderStatusResponse;
import warehouse_CA.automateOrders.Message;
import warehouse_CA.automateOrders.Message.Enum;

public class AutomateOrdersClient {
	
	
	// First we create a logger to show client side logs in the console. logger instance will
		//be used to log different events at the client console.
				// This is optional. Could be used if needed.
			private static  Logger logger = Logger.getLogger(AutomateOrdersClient.class.getName());

			// Creating stubs for establishing the connection with server.
				// Blocking stub
			private static automateOrdersGrpc.automateOrdersBlockingStub blockingStub;
			// Asynch stub
			private static automateOrdersGrpc.automateOrdersStub asyncStub;
			
			// The main method will have the logic for client.
			public static void main(String[] args) throws Exception {
				// First a channel is being created to the server from client. Here, we provide 
				//the server name (localhost) and port (50057).
				// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).

				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50057).usePlaintext().build();

				//stubs -- generate from proto
				blockingStub = automateOrdersGrpc.newBlockingStub(channel);
				asyncStub = automateOrdersGrpc.newStub(channel);
				
				// RPC call with Asynchronous stub
				//splitAsync();
				
				//bidirectional streaming
				getOrderDetails();
				
				// Unary RPC call
				checkOrderStatus();
				
				// Closing the channel once message has been passed.		
				channel.shutdown();

			}
			
			//BI-DIRECTIONAL
			
			public static void getOrderDetails() {
		           // Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
		            StreamObserver<OrderDetailsResponse> responseObserver = new StreamObserver<OrderDetailsResponse>() {
		                		               		                
		                @Override
		                public void onNext(OrderDetailsResponse value) {
		                	System.out.println("-----Get order details method------");
		                	System.out.println("Order details: \n " + "Order Id:" + value.getOrderId() + "\n"+ "Order date: " + value.getOrderDate() + "\n" + "Delivery date: " + value.getDeliveryDate());
		                    
		                }

		               @Override
		                public void onError(Throwable t) {
		                    // TODO Auto-generated method stub
		               

		               }

		               @Override
		                public void onCompleted() {
		                    // TODO Auto-generated method stub
		                    System.out.println("Order details information..");
		                }

		           };

		           // Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
		            StreamObserver<OrderDetailsRequest> requestObserver = asyncStub.getOrderDetails(responseObserver);

		           try {
		               requestObserver.onNext(OrderDetailsRequest.newBuilder().setProductOrdered("Nike air max shoes").build());

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
			
			
			
			
			//UNARY-----
			
			public static void checkOrderStatus() {
						
				// First creating a request message. Here, the message contains a string in setProductConditionId
				OrderStatusRequest req = OrderStatusRequest.newBuilder().setOrderId("102").build();
	            //  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
				OrderStatusResponse response = blockingStub.checkOrderStatus(req);

	           //response contains the output from the server side. Here, we are printing the value contained by response.
				System.out.println("\n-----Check order status method------");
	            System.out.println(response.getOrderStatusOutput());
						
			}
			
			//unary rpc
			public static void empty() {
				// First creating a request message. Here, the message contains empty message as defined in proto enum
				Message req = Message.newBuilder().setDetail(Enum.UNKNOWN).build();
				try {
					
					// Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
					Empty response = blockingStub.empty(req);
					//response contains the output from the server side. Here, we are printing the value contained by response.
					System.out.println("one response " + response.toString());

				}catch(StatusRuntimeException ex) {
					// Print if any error/exception is generated.
					System.out.println( ex.getMessage());
					//ex.printStackTrace();
				}


			}
	

}
