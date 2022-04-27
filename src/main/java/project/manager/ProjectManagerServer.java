package project.manager;


import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.stream.Stream;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import professional.ProffessionalRequestServer;
import project.manager.FindingWorkersGrpc.FindingWorkersImplBase;



public class ProjectManagerServer {
	
	private Server server;
	
	public static void main (String[] args) throws IOException, InterruptedException {
		ProjectManagerServer ourServer = new ProjectManagerServer();
		ourServer.start();
	}
	
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50052;
		server = ServerBuilder.forPort(port).addService(new projectManagerSchedule()).build().start();
		System.out.println("Server running on port: " + port);
		server.awaitTermination();
	}
	

	private static int calendar(int year, int month, int day) {
	        LocalDate localDate = LocalDate.of(year, month, day);
	        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	        return dayOfWeek.getValue();
	}

	static class projectManagerSchedule extends FindingWorkersImplBase{
		@Override
		public void taskFinding(taskSpecifications request, StreamObserver<success> responseObserver){
			
			//client message
			try {
			String task = request.getTask();
			float numberHours = request.getNumberHours();
			int startDay = (int) request.getStartDay();
			int startMonth = (int) request.getStartMonth();
			int startYear = (int) request.getStartYear();
			int milestoneDay = (int) request.getMilestoneDay();
			int milestoneMonth = (int) request.getMilestoneMonth();
			int milestoneYear = (int) request.getMilestoneYear();
			LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
			LocalDate deadline = LocalDate.of(milestoneYear, milestoneMonth, milestoneDay);
			LocalDate today = LocalDate.now();
			
			//server response
			success.Builder responseBuilder = success.newBuilder();
				if (startDate.isAfter(deadline)){
					responseBuilder.setTask("Please enter valid period.");
				} else if (today.isAfter(startDate)){
					responseBuilder.setTask("Today is " + today + " but start date is " + startDate + ".");
				} else {
					Stream<LocalDate> projectPeriod = startDate.datesUntil(deadline);//I receive a Stream of all the dates between today and the deadline
					Object[] projectPeriodDates = projectPeriod.toArray();
					float numberHoursCounter = numberHours;
					for (int i = 0; i < projectPeriodDates.length; i++) {
						LocalDate projectPeriodDate = (LocalDate) projectPeriodDates[i];
						System.out.print("For " + projectPeriodDate);
						int day = projectPeriodDate.getDayOfMonth();//to change from LocalDate data type to int values and know what day of the week it is.
						int month = projectPeriodDate.getMonthValue();
						int year = projectPeriodDate.getYear();
						int weekDay = calendar(year, month, day);
						System.out.println(" week day is " + weekDay);
						if(weekDay == 1 || weekDay == 2 || weekDay == 3 || weekDay == 4 || weekDay == 5) {
							
								service.manager.dbConnect dataTransfer = new service.manager.dbConnect();
								dataTransfer.dbTaskCheck(task);
								if(dataTransfer.getCardNumberTaskCheck() == 0) {
									numberHoursCounter = 0;
									responseBuilder.setTask("Sorry no professional for this task");
									System.out.println("Task not found");
									responseObserver.onNext(responseBuilder.build());
									i = projectPeriodDates.length-1;
								} else {
									dataTransfer.dbHoursCheck(task, String.valueOf(projectPeriodDate), weekDay);
									responseBuilder.setTask("Employee with card number " + dataTransfer.getCardNumberTaskCheck() + " has " + dataTransfer.getNumberOfHoursTaskCheck() + " hours availables. ");
									System.out.println("Employee with card number " + dataTransfer.getCardNumberTaskCheck() + " has " + dataTransfer.getNumberOfHoursTaskCheck() + " hours availables on the " + projectPeriodDate);
									responseObserver.onNext(responseBuilder.build());
									numberHoursCounter = numberHoursCounter - dataTransfer.getNumberOfHoursTaskCheck();
									boolean taskCovered = numberHoursCounter < 0; 
									System.out.println("So far enough capacity to cover the task: " + taskCovered);
								}		
						} 

						responseBuilder.setTask("Have a good day");
					}

				}
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onCompleted();
				
			} catch (Exception e) {
				success.Builder responseBuilder = success.newBuilder();
				responseBuilder.setTask("Please enter valid values.");
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onCompleted();
			}		
		}
		
		
		
		@Override
		public StreamObserver<taskMatch> taskRequest(StreamObserver<success> responseObserver){
			System.out.println("On server inside streamline");
			return new StreamObserver<taskMatch>() {
				int count;

				@Override
				public void onNext(taskMatch value) {
					System.out.println("Message streamed number " + count);
					System.out.println("On server message received from client " + value.getCardNumber() + value.getNumberOfHours());
					count++;
				}

				@Override
				public void onError(Throwable t) {
					System.out.println("Error in the Server");
					
				}

				@Override
				public void onCompleted() {
					success.Builder responseBuilder = success.newBuilder();
					System.out.println(count + " client server streaming messages received");
					responseBuilder.setTask("We have received your " + count + " messages.");
					responseObserver.onNext(responseBuilder.build());
					responseObserver.onCompleted();
					
				}};
		}}}
		
		
		
		
		
		
	

