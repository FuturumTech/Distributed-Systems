package ds.service1;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.service1.Service1Grpc.Service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class Service1Server extends Service1ImplBase {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Service1Server service1 = new Service1Server();

		service1.registerService();
		
		int port = 50051;		
		
		Server server = ServerBuilder.forPort(port)
				.addService(service1)
				.build()
				.start();

		System.out.println("Service-1 started, listening on " + port);

		server.awaitTermination();
	}

	
	// *** UNARY RPC ***
	@Override
	public void squared(NumberRequest request, StreamObserver<NumberResponse> responseObserver) {
		
		// Get text field value
//		String text = request.getText();
		
		// Receiving request
		System.out.println("Request message from client: " + request.getText());
//		System.out.println("Request message from client: " + text);
		
		// Get the "number" field value
		int number = request.getNumber();
		
		// Calculate the square of that number
		number = number * number;
		
		// Build the response message
		NumberResponse response = NumberResponse.newBuilder()
				.setNumber(number)
				.setText("Square of " + request.getNumber() + " returned")
				.build();
		
		// Send the response
		responseObserver.onNext(response);
		
		// Complete the call
		responseObserver.onCompleted();
	}

	
	// *** CLIENT-STREAMING RPC ***
	@Override
	public StreamObserver<NumberRequest> sum(StreamObserver<SumResponse> responseObserver) {
		
		return new StreamObserver<NumberRequest>() {

			ArrayList <Integer> list = new ArrayList<>();
			
			@Override
			public void onNext(NumberRequest value) {

				// Receiving number
				int number = value.getNumber();
				
				// Display number
				System.out.println("Number is: " + number);
				
				// Add the number to the list
				list.add(number);
				
			}

			@Override
			public void onError(Throwable t) {
				
			}

			@Override
			public void onCompleted() {
				
				System.out.println("Done!");
				
				int total = 0;
				
				for (int number : list) {
					total = total + number;
				}
				
				// Build the response message
				SumResponse response = SumResponse.newBuilder()
						.setNumber(total)
						.setText("Sum value returned")
						.build();
				
				responseObserver.onNext(response);
				responseObserver.onCompleted();
			}
			
		};
	}

	
	// *** SERVER-STREAMING RPC ***
	@Override
	public void fibonacci(NumberRequest request, StreamObserver<NumberResponse> responseObserver) {

		// Receiving request
		System.out.println("Request message from client: " + request.getText());
		
		// Get request number
		int number = request.getNumber();
		
		// Create number variables
		int a = 0;
		int b = 1;
		
		for (int i = 1; i <= number; i++) {
			int num = a + b;
			a = b;
			b = num;
			
			NumberResponse response = NumberResponse.newBuilder()
					.setNumber(num)
					.build();
			
			responseObserver.onNext(response);
			
			try {
				//wait for one second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		responseObserver.onCompleted();
		
	}

	
	// *** BIDIRECTIONAL RPC ***
	@Override
	public StreamObserver<NumberRequest> total(StreamObserver<NumberResponse> responseObserver) {

		return new StreamObserver<NumberRequest>() {

			int total = 0;
			
			@Override
			public void onNext(NumberRequest value) {
				
				// Get the request number
				int number = value.getNumber();
				
				// Add the number to the total
				total = total + number;
				
				// Build the response message
				NumberResponse response = NumberResponse.newBuilder()
						.setNumber(total)
						.build();
				
				// Send the message
				responseObserver.onNext(response);
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();	
			}

			@Override
			public void onCompleted() {

				// Message call completed
				System.out.println("Done!");
				
				// End the message call
				responseObserver.onCompleted();		
			}
			
		};
	}
	
	
	private void registerService() {
		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = "_service1._tcp.local.";
	            String service_name = "Service 1 Server";
	            int service_port = 50051;
	            String service_description = "Perform maths operations";
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description);
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

}
