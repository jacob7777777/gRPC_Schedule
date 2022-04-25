package email.notification;

import java.io.IOException;
import java.util.logging.Logger;

import email.notification.NotificationGrpc.NotificationImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import service.manager.ServiceRegistration;


public class EmailNotificationsServer extends NotificationImplBase{

private static final Logger logger = Logger.getLogger(EmailNotificationsServer.class.getName());
	
public static void main(String[] args) {
		
		EmailNotificationsServer notificationserver = new EmailNotificationsServer();
		
		int port = 50051;
		String service_type = "_grpc._tcp.local.";
		String service_name = "GrpcServer";
		ServiceRegistration ssr = new ServiceRegistration();
		ssr.run(port, service_type, service_name);
		
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(notificationserver)
			    .build()
			    .start();
			System.out.println("\nServer V1.2 Started");
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	    		    
	   
	}
	
		@Override
		public void jobConfirmation(answer request, StreamObserver<thanks> responseObserver){
			
			//client message
			boolean confirmationRefusal = request.getConfirmationRefusal();
			System.out.println("Confirmation is: " + confirmationRefusal);
			
			//server response
			thanks reply = thanks.newBuilder().setMessage("Your confirmation is " + request.getConfirmationRefusal() + " from port 51001").build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
		
}