package email.notification;

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
    comments = "Source: EmailNotification.proto")
public final class NotificationGrpc {

  private NotificationGrpc() {}

  public static final String SERVICE_NAME = "Notification";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<email.notification.answer,
      email.notification.thanks> getJobConfirmationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JobConfirmation",
      requestType = email.notification.answer.class,
      responseType = email.notification.thanks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<email.notification.answer,
      email.notification.thanks> getJobConfirmationMethod() {
    io.grpc.MethodDescriptor<email.notification.answer, email.notification.thanks> getJobConfirmationMethod;
    if ((getJobConfirmationMethod = NotificationGrpc.getJobConfirmationMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getJobConfirmationMethod = NotificationGrpc.getJobConfirmationMethod) == null) {
          NotificationGrpc.getJobConfirmationMethod = getJobConfirmationMethod = 
              io.grpc.MethodDescriptor.<email.notification.answer, email.notification.thanks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Notification", "JobConfirmation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  email.notification.answer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  email.notification.thanks.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("JobConfirmation"))
                  .build();
          }
        }
     }
     return getJobConfirmationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<email.notification.answer,
      email.notification.thanks> getTaskChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TaskChange",
      requestType = email.notification.answer.class,
      responseType = email.notification.thanks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<email.notification.answer,
      email.notification.thanks> getTaskChangeMethod() {
    io.grpc.MethodDescriptor<email.notification.answer, email.notification.thanks> getTaskChangeMethod;
    if ((getTaskChangeMethod = NotificationGrpc.getTaskChangeMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getTaskChangeMethod = NotificationGrpc.getTaskChangeMethod) == null) {
          NotificationGrpc.getTaskChangeMethod = getTaskChangeMethod = 
              io.grpc.MethodDescriptor.<email.notification.answer, email.notification.thanks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Notification", "TaskChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  email.notification.answer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  email.notification.thanks.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("TaskChange"))
                  .build();
          }
        }
     }
     return getTaskChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<email.notification.answer,
      email.notification.thanks> getAbsenceConfirmationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbsenceConfirmation",
      requestType = email.notification.answer.class,
      responseType = email.notification.thanks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<email.notification.answer,
      email.notification.thanks> getAbsenceConfirmationMethod() {
    io.grpc.MethodDescriptor<email.notification.answer, email.notification.thanks> getAbsenceConfirmationMethod;
    if ((getAbsenceConfirmationMethod = NotificationGrpc.getAbsenceConfirmationMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getAbsenceConfirmationMethod = NotificationGrpc.getAbsenceConfirmationMethod) == null) {
          NotificationGrpc.getAbsenceConfirmationMethod = getAbsenceConfirmationMethod = 
              io.grpc.MethodDescriptor.<email.notification.answer, email.notification.thanks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Notification", "AbsenceConfirmation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  email.notification.answer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  email.notification.thanks.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("AbsenceConfirmation"))
                  .build();
          }
        }
     }
     return getAbsenceConfirmationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationStub newStub(io.grpc.Channel channel) {
    return new NotificationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotificationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotificationFutureStub(channel);
  }

  /**
   */
  public static abstract class NotificationImplBase implements io.grpc.BindableService {

    /**
     */
    public void jobConfirmation(email.notification.answer request,
        io.grpc.stub.StreamObserver<email.notification.thanks> responseObserver) {
      asyncUnimplementedUnaryCall(getJobConfirmationMethod(), responseObserver);
    }

    /**
     */
    public void taskChange(email.notification.answer request,
        io.grpc.stub.StreamObserver<email.notification.thanks> responseObserver) {
      asyncUnimplementedUnaryCall(getTaskChangeMethod(), responseObserver);
    }

    /**
     */
    public void absenceConfirmation(email.notification.answer request,
        io.grpc.stub.StreamObserver<email.notification.thanks> responseObserver) {
      asyncUnimplementedUnaryCall(getAbsenceConfirmationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getJobConfirmationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                email.notification.answer,
                email.notification.thanks>(
                  this, METHODID_JOB_CONFIRMATION)))
          .addMethod(
            getTaskChangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                email.notification.answer,
                email.notification.thanks>(
                  this, METHODID_TASK_CHANGE)))
          .addMethod(
            getAbsenceConfirmationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                email.notification.answer,
                email.notification.thanks>(
                  this, METHODID_ABSENCE_CONFIRMATION)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationStub extends io.grpc.stub.AbstractStub<NotificationStub> {
    private NotificationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationStub(channel, callOptions);
    }

    /**
     */
    public void jobConfirmation(email.notification.answer request,
        io.grpc.stub.StreamObserver<email.notification.thanks> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJobConfirmationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void taskChange(email.notification.answer request,
        io.grpc.stub.StreamObserver<email.notification.thanks> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTaskChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void absenceConfirmation(email.notification.answer request,
        io.grpc.stub.StreamObserver<email.notification.thanks> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAbsenceConfirmationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotificationBlockingStub extends io.grpc.stub.AbstractStub<NotificationBlockingStub> {
    private NotificationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationBlockingStub(channel, callOptions);
    }

    /**
     */
    public email.notification.thanks jobConfirmation(email.notification.answer request) {
      return blockingUnaryCall(
          getChannel(), getJobConfirmationMethod(), getCallOptions(), request);
    }

    /**
     */
    public email.notification.thanks taskChange(email.notification.answer request) {
      return blockingUnaryCall(
          getChannel(), getTaskChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public email.notification.thanks absenceConfirmation(email.notification.answer request) {
      return blockingUnaryCall(
          getChannel(), getAbsenceConfirmationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationFutureStub extends io.grpc.stub.AbstractStub<NotificationFutureStub> {
    private NotificationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<email.notification.thanks> jobConfirmation(
        email.notification.answer request) {
      return futureUnaryCall(
          getChannel().newCall(getJobConfirmationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<email.notification.thanks> taskChange(
        email.notification.answer request) {
      return futureUnaryCall(
          getChannel().newCall(getTaskChangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<email.notification.thanks> absenceConfirmation(
        email.notification.answer request) {
      return futureUnaryCall(
          getChannel().newCall(getAbsenceConfirmationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOB_CONFIRMATION = 0;
  private static final int METHODID_TASK_CHANGE = 1;
  private static final int METHODID_ABSENCE_CONFIRMATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOB_CONFIRMATION:
          serviceImpl.jobConfirmation((email.notification.answer) request,
              (io.grpc.stub.StreamObserver<email.notification.thanks>) responseObserver);
          break;
        case METHODID_TASK_CHANGE:
          serviceImpl.taskChange((email.notification.answer) request,
              (io.grpc.stub.StreamObserver<email.notification.thanks>) responseObserver);
          break;
        case METHODID_ABSENCE_CONFIRMATION:
          serviceImpl.absenceConfirmation((email.notification.answer) request,
              (io.grpc.stub.StreamObserver<email.notification.thanks>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return email.notification.Notifications.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Notification");
    }
  }

  private static final class NotificationFileDescriptorSupplier
      extends NotificationBaseDescriptorSupplier {
    NotificationFileDescriptorSupplier() {}
  }

  private static final class NotificationMethodDescriptorSupplier
      extends NotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotificationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationFileDescriptorSupplier())
              .addMethod(getJobConfirmationMethod())
              .addMethod(getTaskChangeMethod())
              .addMethod(getAbsenceConfirmationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
