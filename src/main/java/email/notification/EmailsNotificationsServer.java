package email.notification;

import java.io.IOException;

import email.notification.NotificationGrpc.NotificationImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class EmailsNotificationsServer {

	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		EmailsNotificationsServer ourServer = new EmailsNotificationsServer();
		ourServer.start();

	}

	
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50053;
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
			responseBuilder.setMessage("Your registration has completed successfully.");
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}

	}
}