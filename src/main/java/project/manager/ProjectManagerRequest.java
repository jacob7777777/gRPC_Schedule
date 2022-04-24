package project.manager;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import project.manager.FindingWorkersGrpc.FindingWorkersBlockingStub;
import project.manager.FindingWorkersGrpc.FindingWorkersStub;

public class ProjectManagerRequest {

	public static void main(String[] args) throws InterruptedException {

		int port = 50051;
		String host = "localhost";
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		
		
		// Build message
		taskSpecifications projectNumber = taskSpecifications.newBuilder().setProjectNumber("test").build();
		taskSpecifications task = taskSpecifications.newBuilder().setTask("test").build();
		taskSpecifications numberHours = taskSpecifications.newBuilder().setNumberHours(1).build();
		taskSpecifications startDay = taskSpecifications.newBuilder().setStartDay(2).build();
		taskSpecifications startMonth = taskSpecifications.newBuilder().setStartMonth(3).build();
		taskSpecifications startYear = taskSpecifications.newBuilder().setStartYear(4).build();
		taskSpecifications milestoneDay = taskSpecifications.newBuilder().setMilestoneDay(5).build();
		taskSpecifications milestoneMonth = taskSpecifications.newBuilder().setMilestoneMonth(5).build();
		taskSpecifications milestoneYear = taskSpecifications.newBuilder().setMilestoneYear(5).build();
		

		taskMatch workingDay = taskMatch.newBuilder().setWorkingDay(23).build();
		taskMatch workingMonth = taskMatch.newBuilder().setWorkingMonth(4).build();
		taskMatch workingYear = taskMatch.newBuilder().setWorkingYear(2022).build();
		taskMatch numberOfHours = taskMatch.newBuilder().setNumberOfHours(4).build();
		taskMatch cardNumber = taskMatch.newBuilder().setCardNumber("test").build();
		
		
		
		
		// Create a stub, pass the channel to the stub
		FindingWorkersBlockingStub bstub = FindingWorkersGrpc.newBlockingStub(newChannel); //blocking stub for server stream
		FindingWorkersStub asyncStub = FindingWorkersGrpc.newStub(newChannel); //asynchronous stub for client streaming 
		// Calling the methods or rpcs from the service
		Iterator<taskMatch> responses = bstub.taskFinding(null);
		while (responses.hasNext()) {
			taskMatch iteratedResponse = responses.next();
			System.out.println(iteratedResponse.getCardNumber());
		}
		//newResponse responseInt = bstub.getFirstInt(cString);
		//System.out.println("Now print our response from the getFirstInt rpc" + responseInt.getFirstInt());
		// Shutdown the channel
		
		
		//Client streaming
		StreamObserver<success> responseObserver = new StreamObserver<success>() {

			@Override
			public void onNext(success value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				


				
			}};
			
		//StreamObserver so requestObserver from grpc library
			StreamObserver<taskMatch> requestObserver = asyncStub.taskRequest(responseObserver);
			requestObserver.onNext(workingDay);
			//requestObserver.onNext(workingMonth);
			//requestObserver.onNext(workingYear);
			//requestObserver.onNext(numberOfHours);
			//requestObserver.onNext(cardNumber);
			System.out.println("Client has finished sending messages");
			requestObserver.onCompleted();
			Thread.sleep(5000);
			
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

}

