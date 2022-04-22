package EmailsNotifications;

import java.io.IOException;

import EmailsNotifications.NotificationGrpc.NotificationImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class EmailNotificationsServer {

	private Server server;
	
	public static void main (String[] args) throws IOException, InterruptedException {
		EmailNotificationsServer ourServer = new EmailNotificationsServer();
		ourServer.start();
	}
	
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		server = ServerBuilder.forPort(port).addService(new Notifications()).build().start();
		System.out.println("Server running on port: " + port);
		server.awaitTermination();
	}
	
	static class Notifications extends NotificationImplBase{
		@Override
		public void jobConfirmation(answer request, StreamObserver<thanks> responseObserver){
			
			//client message
			boolean confirmationRefusal = request.getConfirmationRefusal();
			System.out.println("Confirmation is: " + confirmationRefusal);
			
			//server response
			thanks.Builder responseBuilder = thanks.newBuilder();
			responseBuilder.setMessage("Thank you for your answer.");//esto tengo que arreglarlo porque aunque no se grabe sale que esta registrarlo
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
		
	}
}