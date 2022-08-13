package warehouse_CA.automateOrders;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import warehouse_CA.automateOrders.OrderDetailsRequest;
import warehouse_CA.automateOrders.OrderDetailsResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import warehouse_CA.automateOrders.AutomateOrdersServer;
import warehouse_CA.automateOrders.automateOrdersGrpc.automateOrdersImplBase;

import warehouse_CA.automateOrders.Empty;
import warehouse_CA.automateOrders.OrderStatusRequest;
import warehouse_CA.automateOrders.OrderStatusResponse;
import warehouse_CA.automateOrders.Message;

public class AutomateOrdersServer extends automateOrdersImplBase {
	
	// First we create a logger to show server side logs in the console. logger instance will be used to log different events at the server console.
			private static final Logger logger = Logger.getLogger(AutomateOrdersServer.class.getName());

			// Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
			// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
			 public static void main(String[] args) throws IOException, InterruptedException {
				
				 // The StringServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
				 AutomateOrdersServer automateorderserver = new AutomateOrdersServer();
				 
				 Properties prop = automateorderserver.getProperties();
					
				 automateorderserver.registerService(prop);
					
					int port = Integer.valueOf( prop.getProperty("service_port") );
				   
				 // This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking)	
				   // int port = 50057;
				    
				 // Here, we create a server on the port defined in in variable "port" and attach a service "stringserver" (instance of the class) defined above.
				    Server server = ServerBuilder.forPort(port) // Port is defined in line 34
				        .addService(automateorderserver) // Service is defined in line 31
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
					
					 try (InputStream input = new FileInputStream("src/main/resources/automateOrders.properties")) {

				            prop = new Properties();

				            // load a properties file
				            prop.load(input);

				            // get the property value and print it out
				            System.out.println("Automate Orders Service properties ...");
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
			 
			 
	//FOR BI-DIRECTIONAL STREAMING
			 
			 @Override
		        public StreamObserver<OrderDetailsRequest> getOrderDetails(StreamObserver<OrderDetailsResponse> responseObserver) {
		            // TODO Auto-generated method stub
		            return new StreamObserver<OrderDetailsRequest>() {
		                
		                	            
		            @Override
		            public void onNext(OrderDetailsRequest request){
		                // In bidirectional stream, both server and  client would be sending the stream of messages.
		                // Here, for each message in stream from client, server is sending back one response.
		                String product = request.getProductOrdered();
		               // int Temp = request.getTemp1();
		               // String Persons =request.getOccupant1();
		                System.out.println("GET ORDER DETAILS:");
		                     System.out.println("Product Ordered: " + request.getProductOrdered());    
		                    // System.out.println("Tempreature status: " + request.getTemp1());
		                    // System.out.println("Occupants status: " + request.getOccupant1());
		                     		                     		                    		                    
		                 // Preparing and sending the reply for the client. Here, response is build and with the value (input1.toString()) computed by above logic.
		                   OrderDetailsResponse reply = OrderDetailsResponse.newBuilder().setOrderId("201").setOrderDate("10/08/2022").setDeliveryDate("15/08/2022").build();
		              
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
			 
			 
			 
			 
			 
	//FOR UNARY -----
			 @Override  
				public void empty(Message request, StreamObserver<Empty> responseObserver) {
					System.out.println("empty message "+ request.getDetail());
						
					//will generate an error CANCELLED: HTTP/2 error code: CANCEL
					Empty reply = Empty.newBuilder().build();
					
					// sending an empty response. No value is there.
					responseObserver.onNext(reply); 
					
				//	StatusRuntimeException er = new StatusRuntimeException(Status.ABORTED);
				//	responseObserver.onError(er);
				  
					responseObserver.onCompleted();
				}


				// This is the second RPC method defined in proto file. It accepts an argument and return one.
				@Override
				public void checkOrderStatus(OrderStatusRequest request, StreamObserver<OrderStatusResponse> responseObserver) {
					
					System.out.print("receiving order status.....\n ");
					
					
					 String orderId = request.getOrderId();
			            String orderId1 = "101";
			            String orderId2 = "102";
			            String orderId3 = "103";
			            String status1 = "Out for delivery!";
			            String status2 = "Packed, ready to move from warehouse!";
			            String status3 = "at transit!";
			            String status4 = "Delivered!";
			             if(orderId.equals(orderId1)) {
			                 System.out.println("The order with order ID " + orderId1 + " is "  + status1);
			             }else if(orderId.equals(orderId2)){
			                 System.out.println("The order with order ID " + orderId2 + " is "  + status2);
			             }else if(orderId.equals(orderId3)) {
			            	 System.out.println("The order with order ID " + orderId3 + " is "  + status3);
			             }else {
			            	 System.out.println("Incorrect order ID entered!");
			             }
			
					
					// Preparing the reply for the client. Here, response is build and with the value (output) computed by above logic.  
			             OrderStatusResponse reply = OrderStatusResponse.newBuilder().setOrderStatusOutput(orderId1).build();
					
					// Sending the reply for each request.
					responseObserver.onNext(reply);
					
					responseObserver.onCompleted();
				}
			 
			 
}


