package email.notification;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.ServiceInfo;

import email.notification.NotificationGrpc.NotificationBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import service.manager.ServiceDiscovery;

public class EmailsNotificationClient {

	private static final Logger logger = Logger.getLogger(EmailsNotificationClient.class.getName());

		  
	public static void main(String[] args) throws Exception {
		
		ServiceInfo serviceInfo;
		String service_type = "_grpc._tcp.local.";
		//Now retrieve the service info - all we are supplying is the service type
		serviceInfo = ServiceDiscovery.runjmDNS(service_type);
		//Use the serviceInfo to retrieve the port
		int port = serviceInfo.getPort();
		String host = "localhost";
		//int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		NotificationBlockingStub  blockingStub = NotificationGrpc.newBlockingStub(channel);
	    
	    try {
	    	 Boolean confirmationRefusal = false;
	    	 answer request = answer.newBuilder().setConfirmationRefusal(confirmationRefusal).build();
	    	 
	    	 thanks response = blockingStub.jobConfirmation(request);
	    	 
	    	 logger.info("Confirmation/Refusal: " + response.getMessage());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	
	
}
