package service.manager;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class ServiceRegistration {

	public void run(int port, String service_type, String service_name) {

		//get a jMDNS instance
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			//the assumption is that we are registering a grpc server
			//service_type = "_grpc._tcp.local.";				//service-type.domain
			// service_name + service_type => simple_http._tcp.local
			//String service_name = "GrpcServer";							
			int service_port = port;
			String service_desc = "test integration of jmDNS with gRPC";
				
			
			//Create ServiceInfo - 
			//use the factory method to create the object			
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_desc);
			
			jmdns.registerService(serviceInfo);
			
			System.out.printf("jmDNS: registering service with type: %s and name: %s on port %d ", service_type, service_name, service_port);
			
			//sleep for 10 seconds
			Thread.sleep(10000);
			System.out.println("\njmDNS: Service Registered");
			//unregister the services
			//jmdns.unregisterAllServices();   //you could also unregister a single service
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

