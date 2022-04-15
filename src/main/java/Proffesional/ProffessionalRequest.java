package Proffesional;

import java.util.concurrent.TimeUnit;

import grpc.CA1.AutomatedSchedulingApp.TimesheetsGrpc;
import grpc.CA1.AutomatedSchedulingApp.profile;
import grpc.CA1.AutomatedSchedulingApp.success;
import grpc.CA1.AutomatedSchedulingApp.TimesheetsGrpc.TimesheetsBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ProffessionalRequest {

	public static void main(String[] args) throws InterruptedException {
		// Build a channel
		int port = 50051;
		String host = "localhost";
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		// Build message
		profile cardNumber = profile.newBuilder().setCardNumber(9).build();
		profile task = profile.newBuilder().setTask("test").build();
		profile capProfMon = profile.newBuilder().setCapProfMon(1).build();
		profile capProfTue = profile.newBuilder().setCapProfTue(2).build();
		profile capProfWed = profile.newBuilder().setCapProfWed(3).build();
		profile capProfThu = profile.newBuilder().setCapProfThu(4).build();
		profile capProfFri = profile.newBuilder().setCapProfFri(5).build();
		// Create a stub, pass the channel to the stub
		TimesheetsBlockingStub bstub = TimesheetsGrpc.newBlockingStub(newChannel);
		// Calling the methods or rpcs from the service
		success response = bstub.introduceProfile(cardNumber);
		System.out.println(response.getMessage());
		//newResponse responseInt = bstub.getFirstInt(cString);
		//System.out.println("Now print our response from the getFirstInt rpc" + responseInt.getFirstInt());
		// Shutdown the channel
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

}
