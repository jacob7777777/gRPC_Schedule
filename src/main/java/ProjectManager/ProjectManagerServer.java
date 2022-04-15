package ProjectManager;


import java.io.IOException;
import java.time.LocalDate;

import Proffesional.ProffessionalRequestServer;
import ProjectManager.FindingWorkersGrpc.FindingWorkersImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;



public class ProjectManagerServer {
	
	private Server server;
	
	public static void main (String[] args) throws IOException, InterruptedException {
		ProjectManagerServer ourServer = new ProjectManagerServer();
		ourServer.start();
	}
	
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		server = ServerBuilder.forPort(port).addService(new projectManagerSchedule()).build().start();
		System.out.println("Server running on port: " + port);
		server.awaitTermination();
	}
	

	private static int calendar(int year, int month, int day) {
	        //LocalDate localDate = LocalDate.of(2022, 4, 10);
	        LocalDate localDate = LocalDate.of(year, month, day);
	        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	        //System.out.println("Day of week in number:"+dayOfWeek.getValue());
	        //System.out.println("Day of week in text:"+dayOfWeek.toString()); 
	        return dayOfWeek.getValue();
	}
	
	//esto esta copiado del otro lado, tengo que adaptarlo
	
	static class projectManagerSchedule extends FindingWorkersImplBase{
		@Override
		public void taskFinding(TaskSpecifications request, StreamObserver<TaskMatch> responseObserver){
			
			//client message
			String projectNumber = request.getProjectNumber();
			System.out.println("Project Number is: " + projectNumber);
			String task = request.getTask();
			System.out.println("Task is: " + task);
			float numberHours = request.getNumberHours();
			System.out.println("Number of hours required are: " + numberHours);
			int dayMilestone = (int) request.getDayMilestone();
			int monthMilestone = (int) request.getMonthMilestone();
			int yearMilestone = (int) request.getYearMilestone();
			System.out.println("The milestone date is: " + dayMilestone + "-" + monthMilestone + "-" + yearMilestone);
			int weekDay = calendar(yearMilestone, monthMilestone, dayMilestone);
			//dbConnect dataTransfer = new dbConnect();
			//dataTransfer.dbProfileIntegration(cardNumber, task, cap_prof_mon, cap_prof_tue, cap_prof_wed, cap_prof_thu, cap_prof_fri);
			
			//server response
			TaskMatch.Builder responseBuilder = TaskMatch.newBuilder();
			if (weekDay == 7 | weekDay == 6) {
				responseBuilder.setCardNumber("Sorry set a deadline in a working day");
			} else {
				responseBuilder.setCardNumber("Day is: "+ weekDay);
			}
			//esto tengo que arreglarlo porque aunque no se grabe sale que esta registrarlo
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
		
	}
}
