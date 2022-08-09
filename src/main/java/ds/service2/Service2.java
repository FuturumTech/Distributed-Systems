package ds.service2;

import java.io.IOException;

import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class Service2 extends Service2ImplBase{



	public static void main(String[] args) throws InterruptedException, IOException {
		Service2 service1 = new Service2();

		int port = 50052;

		Server server = ServerBuilder.forPort(port)
				.addService(service1)
				.build()
				.start();

		System.out.println("Service-2 started, listening on " + port);

		server.awaitTermination();
	}


	@Override
	public void deskStatusInquiry(DeskDetailsRequest request, StreamObserver<DeskAdjustedResponse> responseObserver) {

		//prepare the value to be set back
		
		
		//preparing the response message
			//ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();

		//responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}
}
