package warehouse_CA.manageStock;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import warehouse_CA.manageStock.Empty;
import warehouse_CA.manageStock.Message;
import warehouse_CA.manageStock.ListRequest;
import warehouse_CA.manageStock.ListResponse;
import warehouse_CA.manageStock.WarehouseStockRequest;
import warehouse_CA.manageStock.WarehouseStockResponse;
import warehouse_CA.manageStock.ManageStockServer;
import warehouse_CA.manageStock.manageStockGrpc.manageStockImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ManageStockServer extends manageStockImplBase {
	
	// First we create a logger to show server side logs in the console. logger instance will be used to log different events at the server console.
		private static final Logger logger = Logger.getLogger(ManageStockServer.class.getName());

		// Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
		// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
		 public static void main(String[] args) throws IOException, InterruptedException {
			
			 // The StringServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
			 ManageStockServer managestockserver = new ManageStockServer();
			 
			 Properties prop = managestockserver.getProperties();
				
			 managestockserver.registerService(prop);
				
				int port = Integer.valueOf( prop.getProperty("service_port") );
			   
			 // This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking)	
			   // int port = 50057;
			    
			 // Here, we create a server on the port defined in in variable "port" and attach a service "stringserver" (instance of the class) defined above.
			    Server server = ServerBuilder.forPort(port) // Port is defined in line 34
			        .addService(managestockserver) // Service is defined in line 31
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
				
				 try (InputStream input = new FileInputStream("src/main/resources/manageStock.properties")) {

			            prop = new Properties();

			            // load a properties file
			            prop.load(input);

			            // get the property value and print it out
			            System.out.println("Manage Stock Service properties ...");
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
		 
		 
		// These RPC methods have been defined in the proto files. The interface is already present in the ImplBase File.
//			NOTE - YOU MAY NEED TO MODIFY THIS LOGIC FOR YOUR PROJECTS BASED ON TYPE OF THE RPC METHODS 
		// For override Refer - https://docs.oracle.com/javase/8/docs/api/java/lang/Override.html	
		 
//FOR - SERVER STREAMING
		 
		 @Override
	        public void stockCheck(WarehouseStockRequest request, StreamObserver<WarehouseStockResponse> responseObserver) {
	            // TODO Auto-generated method stub

	            System.out.println("***************************************************");
	             System.out.println("Receiving Information about product count:");
	             
	                //Retrieve the value from the request of the client and convert it to array
	                String products  = request.getProductId();
	                String product1 = "999";
	                int bought1 = 1000;
	                int sold1 = 318;
	                int count1 = (bought1 - sold1);
	                String product2 = "995"; 
	                int bought2 = 1500;
	                int sold2 = 582;
	                int count2 = (bought2 - sold2);
	                String product3 = "991";
	                int bought3 = 600;
	                int sold3 = 392;
	                int count3 = (bought3 - sold3);
	                
	                if (products.equals(product1)) {
	                	System.out.println("Total count of this product bought: " + bought1);
	                	System.out.println("Total count of this product sold until now: " + sold1);
	                    System.out.println("Total  current count of the product for requested product Id is: " + count1 );
	                }else if
	                    (products.equals(product2)){
	                	System.out.println("Total count of this product bought: " + bought2);
	                	System.out.println("Total count of this product sold until now: " + sold2);
	                    System.out.println("Total count of product for requested product Id is: " + count2);
	                }else if
	                    (products.equals(product3)) {
	                	System.out.println("Total count of this product bought: " + bought3);
	                	System.out.println("Total count of this product sold until now: " + sold3);
	                    System.out.println("Total count of product for requested product Id is: " + count3);    
	                }
	        
	                    // Preparing and sending the reply for the client. Here, response is build and with the value (c) computed by above logic.     // Here, a stream of response is sent using the for loop.
	                responseObserver.onNext(WarehouseStockResponse.newBuilder().setProductCount(products).build());
	                 
	                responseObserver.onCompleted();
	}
	 
		 
		 
		 //FOR UNARY
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
			public void productConditionChecker(ListRequest request, StreamObserver<ListResponse> responseObserver) {
				
				System.out.print("\nReceiving product condition.....\n");
				
				
				 String productID = request.getProductConditionId();
		            String product1 = "Item1";
		            String product2 = "Item2";
		            String product3 = "Item3";
		            String condition1 = "Excellent condition!";
		            String condition2 = "Expiring soon!";
		            String condition3 = "Expired!";
		             if(productID.equals(product1)) {
		                 System.out.println("This product is in: " + condition1);
		             }else if(productID.equals(product2)){
		                 System.out.println("This product is: " + condition2 + " Use this product first!");
		             }else if(productID.equals(product3)) {
		            	 System.out.println("This product is: " + condition3 + " Don't use it!");
		             }else {
		            	 System.out.println("Incorrect product ID entered!");
		             }
				
				// LOGIC of THE METHOD 
				// NOTE: YOU MAY NEED TO MODIFY THIS LOGIC HERE.
				
				// Preparing the reply for the client. Here, response is build and with the value (output) computed by above logic.  
				ListResponse reply = ListResponse.newBuilder().setProductConditionOutput(product1).build();
				
				// Sending the reply for each request.
				responseObserver.onNext(reply);
				
				responseObserver.onCompleted();
			}

}
