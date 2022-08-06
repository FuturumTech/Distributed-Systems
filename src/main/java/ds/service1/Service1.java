package ds.service1;

import java.io.IOException;
import java.util.logging.Logger;

import ds.service1.Service1Grpc.Service1ImplBase;
import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class Service1  extends Service1ImplBase{

	private static final Logger logger = Logger.getLogger(Service1.class.getName());
	
	//1. Create and start the server
	public static void main(String[] args) throws InterruptedException, IOException {
		 //Create and Instance of the Class to five access to the RPC methods/services
		Service1 service1 = new Service1();
	   //Port where the serves is located
	    int port = 50051;
	    //Adding the servie via the class instance and starting the server here.
	    Server server = ServerBuilder.forPort(port)
	        .addService(service1)
	        .build()
	        .start();
	    
	    logger.info("Server started, listening on " + port);
	    		    //Server is watiting until expvility terminated
	    server.awaitTermination();
	}

	@Override
	public void desiredSettingHVAC(DesiredRoomConditions request, StreamObserver<Confirmation> responseObserver) {
		//Find out what sent by the client
		String roomName = request.getRoomName();
		float desiredHumidity = request.getDesiredHumidity();
		float desiredTempInCelcius = request.getDesiredTempInCelcius();
		System.out.println("Request received from client is: " + roomName + " "+ desiredHumidity + " " + desiredTempInCelcius);
		
		//Our response:
		//Firstly, we must create a builder
		Confirmation.Builder responseBuilder = Confirmation.newBuilder().setConfirmation(roomName); //PLACEHOLDER FOR VALUE RETURN
		
		//Send it back:
		responseObserver.onNext(responseBuilder.build());
		
		responseObserver.onCompleted();

	}
//	//Extend abstract base class for our implementation
//	static class NewServerImpl extends Service1ImplBase{
//		@Override
//		public void desiredSettingHVAC(DesiredRoomConditions request, StreamObserver<Confirmation> responseObserver) {
//			//Find out what sent by the client
//			String roomName = request.getRoomName();
//			float desiredHumidity = request.getDesiredHumidity();
//			float desiredTempInCelcius = request.getDesiredTempInCelcius();
//			System.out.println("Request received from client is: " + roomName + " "+ desiredHumidity + " " + desiredTempInCelcius);
//			
//			//Our response:
//			//Firstly, we must create a builder
//			Confirmation.Builder responseBuilder = Confirmation.newBuilder().setConfirmation(roomName); //PLACEHOLDER FOR VALUE RETURN
//			
//			//Send it back:
//			responseObserver.onNext(responseBuilder.build());
//			
//			//responseObserver.onCompleted();
//		}
//	}
}
	
	

