package warehouse_CA.warehouseControl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import warehouse_CA.warehouseControl.LightResponse;
import warehouse_CA.automateOrders.OrderDetailsRequest;
import warehouse_CA.automateOrders.OrderDetailsResponse;
import warehouse_CA.warehouseControl.LightRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import warehouse_CA.warehouseControl.WarehouseControlServer;
import warehouse_CA.warehouseControl.warehouseControlGrpc.warehouseControlImplBase;

public class WarehouseControlServer extends warehouseControlImplBase {
	
	// First we create a logger to show server side logs in the console. logger instance will be used to log different events at the server console.
			private static final Logger logger = Logger.getLogger(WarehouseControlServer.class.getName());

			// Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
			// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
			 public static void main(String[] args) throws IOException, InterruptedException {
				
				 // The StringServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
				 WarehouseControlServer warehousecontrolserver = new WarehouseControlServer();
				 
				 Properties prop = warehousecontrolserver.getProperties();
					
				 warehousecontrolserver.registerService(prop);
					
					int port = Integer.valueOf( prop.getProperty("service_port") );
				   
				 // This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking)	
				    //int port = 50057;
				    
				 // Here, we create a server on the port defined in in variable "port" and attach a service "stringserver" (instance of the class) defined above.
				    Server server = ServerBuilder.forPort(port) // Port is defined in line 34
				        .addService(warehousecontrolserver) // Service is defined in line 31
				        .build() // Build the server
				        .start(); // Start the server and keep it running for clients to contact.
				    
				    // Giving a logging information on the server console that server has started
				    logger.info("Server started, listening on stock record " + port);
				    		    
				    // Server will be running until externally terminated.
				    server.awaitTermination();
			 }
			 
			 
			//jmDNS 
			 private Properties getProperties() {
					
					Properties prop = null;		
					
					 try (InputStream input = new FileInputStream("src/main/resources/warehouseControl.properties")) {

				            prop = new Properties();

				            // load a properties file
				            prop.load(input);

				            // get the property value and print it out
				            System.out.println("Warehouse Control Service properties ...");
				            System.out.println("\t service_type: " + prop.getProperty("service_type"));
				            System.out.println("\t service_name: " +prop.getProperty("service_name"));
				            System.out.println("\t service_description: " +prop.getProperty("service_description"));
					        System.out.println("\t service_port: " +prop.getProperty("service_port"));

				        } catch (IOException ex) {
				            ex.printStackTrace();
				        }
				
					 return prop;
				}
				
				
				private  void registerService(Properties prop) {
					
					 try {
				            // Create a JmDNS instance
				            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
				            
				            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
				            String service_name = prop.getProperty("service_name")  ;// "example";
				           // int service_port = 1234;
				            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

				            
				            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
				            
				            // Register a service
				            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
				            jmdns.registerService(serviceInfo);
				            
				            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
				            
				            // Wait a bit
				            Thread.sleep(1000);

				            // Unregister all services
				            //jmdns.unregisterAllServices();

				        } catch (IOException e) {
				            System.out.println(e.getMessage());
				        } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    
				}
			 
			 
	
	//Override methods
		
		//CLIENT STREAMING-----
			 
			 @Override
		        public StreamObserver<TempRequest> changeTemp(StreamObserver<TempResponse> responseObserver) {
		            // TODO Auto-generated method stub
		            return new StreamObserver<TempRequest>() {
		            
		            String degreeTemp = "20 degree";
		            
		            // For each message in the stream, get one stream at a time.
		            // NOTE: YOU MAY MODIFY THE LOGIC OF onNext, onError, onCompleted BASED ON YOUR PROJECT.
		            @Override
		            public void onNext(TempRequest value){
		                // Here, in this example we compute the value of string length for each message in the stream.
		                System.out.println("receiving temperature request: " + value.getCurrentTemperature() + " for room ID: " + value.getRoomId());
		               
		                
		            }


		           @Override
		            public void onError(Throwable t) {
		                // TODO Auto-generated method stub
		            }



		           // Once the complete stream is received this logic will be executed.
		            @Override
		            public void onCompleted() {
		                // Preparing and sending the reply for the client. Here, response is build and with the value (length) computed by above logic.
		                 // Here, response is sent once the client is done with sending the stream.
		                  TempResponse res = TempResponse.newBuilder().setCorrectTemperature(degreeTemp).build();
		                  responseObserver.onNext(res);
		                  responseObserver.onCompleted();
		                  
		            }
		            
		            
		        };
		}
			 

			 
			 //BI-DIRECTIONAL STREAMING----
			 
			 @Override
		        public StreamObserver<LightRequest> turnOnOffLights(StreamObserver<LightResponse> responseObserver) {
		            // TODO Auto-generated method stub
		            return new StreamObserver<LightRequest>() {
		                
		                	            
		            @Override
		            public void onNext(LightRequest request){
		                // In bidirectional stream, both server and  client would be sending the stream of messages.
		                // Here, for each message in stream from client, server is sending back one response.
		                String funcRequest = request.getRoomId();
		               
		                System.out.println("\nGET LIGHT ON/OFF REQUEST:");
		                     System.out.println("Room Id for which request is done: " + request.getRoomId());    
		                    
		                     		                     		                    		                    
		                 // Preparing and sending the reply for the client. Here, response is build and with the value (input1.toString()) computed by above logic.
		                     LightResponse reply = LightResponse.newBuilder().setLightOnOff("Light control request granted! \nLight turned off.").build();
		              
		                    responseObserver.onNext(reply);
		                
		            }

		           @Override
		            public void onError(Throwable t) {
		                // TODO Auto-generated method stubal
		                
		            }

		           @Override
		            public void onCompleted() {
		                 responseObserver.onCompleted();
		                 
		         System.out.println("***************************************************");            
		            }
		            
		            
		        };
		        }
			  		 

}
