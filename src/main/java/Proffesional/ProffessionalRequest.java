package Proffesional;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import ProjectManager.taskMatch;
import grpc.CA1.AutomatedSchedulingApp.TimesheetsGrpc;
import grpc.CA1.AutomatedSchedulingApp.profile;
import grpc.CA1.AutomatedSchedulingApp.success;
import grpc.CA1.AutomatedSchedulingApp.successOrBuilder;
import grpc.CA1.AutomatedSchedulingApp.TimesheetsGrpc.TimesheetsBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ProffessionalRequest {

	public static void main(String[] args) throws InterruptedException {
		// Build a channel
		int port = 50051;
		String host = "localhost";
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		// Build message
		profile cardNumber = profile.newBuilder().setCardNumber(12).build();
		profile task = profile.newBuilder().setTask("test").build();
		profile capProfMon = profile.newBuilder().setCapProfMon(1).build();
		profile capProfTue = profile.newBuilder().setCapProfTue(2).build();
		profile capProfWed = profile.newBuilder().setCapProfWed(3).build();
		profile capProfThu = profile.newBuilder().setCapProfThu(4).build();
		profile capProfFri = profile.newBuilder().setCapProfFri(5).build();
		
	
		absenceRequest cardNumber1 = absenceRequest.newBuilder().setCardNumber(7).build();
		absenceRequest jobNumber = absenceRequest.newBuilder().setJobNumber(8).build();
		absenceRequest hoursBooked = absenceRequest.newBuilder().setHoursBooked(1).build();
		absenceRequest dayBooked = absenceRequest.newBuilder().setDayBooked(1).build();
		absenceRequest monthBooked = absenceRequest.newBuilder().setMonthBooked(1).build();
		absenceRequest yearBooked = absenceRequest.newBuilder().setYearBooked(1).build();
		
		//success message = success.newBuilder().setMessage("success").build();
		//absenceRequest message1 = absenceRequest.newBuilder().setMessage("Registered").build();
		
		// Create a stub, pass the channel to the stub
		TimesheetsBlockingStub bstub = TimesheetsGrpc.newBlockingStub(newChannel);
		// Calling the methods or rpcs from the service
		success response = bstub.introduceProfile(cardNumber);
		System.out.println(response.getMessage());
		Iterator<success> responses = bstub.absenceEmptyAgenda(null);
		while (responses.hasNext()) {
			success iteratedResponse = responses.next();
			System.out.println(iteratedResponse.getMessage());
		}
		//newResponse responseInt = bstub.getFirstInt(cString);
		//System.out.println("Now print our response from the getFirstInt rpc" + responseInt.getFirstInt());
		
		// Shutdown the channel
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

}
