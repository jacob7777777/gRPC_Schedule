package email.notification;

import java.io.IOException;

import email.notification.NotificationGrpc.NotificationImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class EmailsNotificationsServer {

	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		EmailsNotificationsServer ourServer = new EmailsNotificationsServer();
		ourServer.start();

	}



//clase 7 minuto 30. Ya hemos dado unary, Server Streaming y ahora salta a client streaming
//puedo cambiar el primero a client streaming o empezar ya con el 2 proto.
	
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
			responseBuilder.setMessage("Your registration has completed successfully.");//esto tengo que arreglarlo porque aunque no se grabe sale que esta registrarlo
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}

	}
}