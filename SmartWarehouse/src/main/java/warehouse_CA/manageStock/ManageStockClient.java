package warehouse_CA.manageStock;

import java.util.Iterator;
import java.util.logging.Logger;

import warehouse_CA.manageStock.Empty;
import warehouse_CA.manageStock.Message;
import warehouse_CA.manageStock.ListRequest;
import warehouse_CA.manageStock.ListResponse;
import warehouse_CA.manageStock.Message.Enum;

import warehouse_CA.manageStock.ManageStockClient;
import warehouse_CA.manageStock.WarehouseStockRequest;
import warehouse_CA.manageStock.WarehouseStockResponse;
import warehouse_CA.manageStock.manageStockGrpc;

//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.grpc.Status;

public class ManageStockClient {
	
	// First we create a logger to show client side logs in the console. logger instance will
	//be used to log different events at the client console.
			// This is optional. Could be used if needed.
		private static  Logger logger = Logger.getLogger(ManageStockClient.class.getName());

		// Creating stubs for establishing the connection with server.
			// Blocking stub
		private static manageStockGrpc.manageStockBlockingStub blockingStub;
		// Asynch stub
		private static manageStockGrpc.manageStockStub asyncStub;
		
		// The main method will have the logic for client.
		public static void main(String[] args) throws Exception {
			// First a channel is being created to the server from client. Here, we provide 
			//the server name (localhost) and port (50057).
			// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50057).usePlaintext().build();

			//stubs -- generate from proto
			blockingStub = manageStockGrpc.newBlockingStub(channel);
			asyncStub = manageStockGrpc.newStub(channel);
			
			// RPC call with Asynchronous stub
			//splitAsync();
			
			// RPC call with Blocking stub
			stockCheck();
			
			// Unary RPC call
			productConditionChecker();
			
			// Closing the channel once message has been passed.		
			channel.shutdown();

		}
		
		
		 // Server Streaming

        public static void stockCheck() {
             
             // First creating a request message. Here, the message contains a string in setVal
             System.out.println("Request to get product count for product ID:");
             WarehouseStockRequest request = WarehouseStockRequest.newBuilder().setProductId("999").build();



            // as this call is blocking. The client will not proceed until all the messages in stream has been received.
             try {
                 // Iterating each message in response when calling remote split RPC method.
                 Iterator<WarehouseStockResponse> responces = blockingStub.stockCheck(request);
                 
                 // Client keeps a check on the next message in stream.
                 while(responces.hasNext()) {
                	 WarehouseStockResponse temp = responces.next();
                     System.out.println(temp.getProductCount());                
                 }


            } catch (StatusRuntimeException e) {
                 e.printStackTrace();
             }
             
         }

		
		//UNARY
		
		//unary rpc
		public static void productConditionChecker() {
					
			// First creating a request message. Here, the message contains a string in setProductConditionId
			System.out.println("\nRequest to check product condition for product:");
			ListRequest req = ListRequest.newBuilder().setProductConditionId("Item1").build();
            //  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
            ListResponse response = blockingStub.productConditionChecker(req);

           //response contains the output from the server side. Here, we are printing the value contained by response.
            System.out.println(response.getProductConditionOutput());
					
		}
		
		//unary rpc
		public static void empty() {
			// First creating a request message. Here, the message contains emply message as defined in proto enum
			Message req = Message.newBuilder().setDetail(Enum.UNKNOWN).build();
			try {
				
				// Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
				Empty response = blockingStub.empty(req);
				//response contains the output from the server side. Here, we are printing the value contained by response.
				System.out.println("one response " + response.toString());

			}catch(StatusRuntimeException ex) {
				// Print if any error/exception is generated.
				System.out.println( ex.getMessage());
				
			}


		}
	

}
