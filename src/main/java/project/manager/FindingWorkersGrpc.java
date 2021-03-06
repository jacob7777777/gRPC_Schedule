package project.manager;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ProjectManagerSchedule.proto")
public final class FindingWorkersGrpc {

  private FindingWorkersGrpc() {}

  public static final String SERVICE_NAME = "FindingWorkers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<project.manager.taskSpecifications,
      project.manager.success> getTaskFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TaskFinding",
      requestType = project.manager.taskSpecifications.class,
      responseType = project.manager.success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<project.manager.taskSpecifications,
      project.manager.success> getTaskFindingMethod() {
    io.grpc.MethodDescriptor<project.manager.taskSpecifications, project.manager.success> getTaskFindingMethod;
    if ((getTaskFindingMethod = FindingWorkersGrpc.getTaskFindingMethod) == null) {
      synchronized (FindingWorkersGrpc.class) {
        if ((getTaskFindingMethod = FindingWorkersGrpc.getTaskFindingMethod) == null) {
          FindingWorkersGrpc.getTaskFindingMethod = getTaskFindingMethod = 
              io.grpc.MethodDescriptor.<project.manager.taskSpecifications, project.manager.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "FindingWorkers", "TaskFinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  project.manager.taskSpecifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  project.manager.success.getDefaultInstance()))
                  .setSchemaDescriptor(new FindingWorkersMethodDescriptorSupplier("TaskFinding"))
                  .build();
          }
        }
     }
     return getTaskFindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<project.manager.taskMatch,
      project.manager.success> getTaskRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TaskRequest",
      requestType = project.manager.taskMatch.class,
      responseType = project.manager.success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<project.manager.taskMatch,
      project.manager.success> getTaskRequestMethod() {
    io.grpc.MethodDescriptor<project.manager.taskMatch, project.manager.success> getTaskRequestMethod;
    if ((getTaskRequestMethod = FindingWorkersGrpc.getTaskRequestMethod) == null) {
      synchronized (FindingWorkersGrpc.class) {
        if ((getTaskRequestMethod = FindingWorkersGrpc.getTaskRequestMethod) == null) {
          FindingWorkersGrpc.getTaskRequestMethod = getTaskRequestMethod = 
              io.grpc.MethodDescriptor.<project.manager.taskMatch, project.manager.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "FindingWorkers", "TaskRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  project.manager.taskMatch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  project.manager.success.getDefaultInstance()))
                  .setSchemaDescriptor(new FindingWorkersMethodDescriptorSupplier("TaskRequest"))
                  .build();
          }
        }
     }
     return getTaskRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FindingWorkersStub newStub(io.grpc.Channel channel) {
    return new FindingWorkersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FindingWorkersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FindingWorkersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FindingWorkersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FindingWorkersFutureStub(channel);
  }

  /**
   */
  public static abstract class FindingWorkersImplBase implements io.grpc.BindableService {

    /**
     */
    public void taskFinding(project.manager.taskSpecifications request,
        io.grpc.stub.StreamObserver<project.manager.success> responseObserver) {
      asyncUnimplementedUnaryCall(getTaskFindingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<project.manager.taskMatch> taskRequest(
        io.grpc.stub.StreamObserver<project.manager.success> responseObserver) {
      return asyncUnimplementedStreamingCall(getTaskRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTaskFindingMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                project.manager.taskSpecifications,
                project.manager.success>(
                  this, METHODID_TASK_FINDING)))
          .addMethod(
            getTaskRequestMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                project.manager.taskMatch,
                project.manager.success>(
                  this, METHODID_TASK_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class FindingWorkersStub extends io.grpc.stub.AbstractStub<FindingWorkersStub> {
    private FindingWorkersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FindingWorkersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindingWorkersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FindingWorkersStub(channel, callOptions);
    }

    /**
     */
    public void taskFinding(project.manager.taskSpecifications request,
        io.grpc.stub.StreamObserver<project.manager.success> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTaskFindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<project.manager.taskMatch> taskRequest(
        io.grpc.stub.StreamObserver<project.manager.success> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTaskRequestMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class FindingWorkersBlockingStub extends io.grpc.stub.AbstractStub<FindingWorkersBlockingStub> {
    private FindingWorkersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FindingWorkersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindingWorkersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FindingWorkersBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<project.manager.success> taskFinding(
        project.manager.taskSpecifications request) {
      return blockingServerStreamingCall(
          getChannel(), getTaskFindingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FindingWorkersFutureStub extends io.grpc.stub.AbstractStub<FindingWorkersFutureStub> {
    private FindingWorkersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FindingWorkersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindingWorkersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FindingWorkersFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TASK_FINDING = 0;
  private static final int METHODID_TASK_REQUEST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FindingWorkersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FindingWorkersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TASK_FINDING:
          serviceImpl.taskFinding((project.manager.taskSpecifications) request,
              (io.grpc.stub.StreamObserver<project.manager.success>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TASK_REQUEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.taskRequest(
              (io.grpc.stub.StreamObserver<project.manager.success>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FindingWorkersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FindingWorkersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return project.manager.ProjectManagerSchedule.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FindingWorkers");
    }
  }

  private static final class FindingWorkersFileDescriptorSupplier
      extends FindingWorkersBaseDescriptorSupplier {
    FindingWorkersFileDescriptorSupplier() {}
  }

  private static final class FindingWorkersMethodDescriptorSupplier
      extends FindingWorkersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FindingWorkersMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FindingWorkersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FindingWorkersFileDescriptorSupplier())
              .addMethod(getTaskFindingMethod())
              .addMethod(getTaskRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
