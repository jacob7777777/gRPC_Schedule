package professional;

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
    comments = "Source: ProffessionaSchedule.proto")
public final class TimesheetsGrpc {

  private TimesheetsGrpc() {}

  public static final String SERVICE_NAME = "Timesheets";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<professional.profile,
      professional.success> getIntroduceProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntroduceProfile",
      requestType = professional.profile.class,
      responseType = professional.success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<professional.profile,
      professional.success> getIntroduceProfileMethod() {
    io.grpc.MethodDescriptor<professional.profile, professional.success> getIntroduceProfileMethod;
    if ((getIntroduceProfileMethod = TimesheetsGrpc.getIntroduceProfileMethod) == null) {
      synchronized (TimesheetsGrpc.class) {
        if ((getIntroduceProfileMethod = TimesheetsGrpc.getIntroduceProfileMethod) == null) {
          TimesheetsGrpc.getIntroduceProfileMethod = getIntroduceProfileMethod = 
              io.grpc.MethodDescriptor.<professional.profile, professional.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Timesheets", "IntroduceProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  professional.profile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  professional.success.getDefaultInstance()))
                  .setSchemaDescriptor(new TimesheetsMethodDescriptorSupplier("IntroduceProfile"))
                  .build();
          }
        }
     }
     return getIntroduceProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<professional.absenceRequest,
      professional.success> getAbsenceEmptyAgendaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbsenceEmptyAgenda",
      requestType = professional.absenceRequest.class,
      responseType = professional.success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<professional.absenceRequest,
      professional.success> getAbsenceEmptyAgendaMethod() {
    io.grpc.MethodDescriptor<professional.absenceRequest, professional.success> getAbsenceEmptyAgendaMethod;
    if ((getAbsenceEmptyAgendaMethod = TimesheetsGrpc.getAbsenceEmptyAgendaMethod) == null) {
      synchronized (TimesheetsGrpc.class) {
        if ((getAbsenceEmptyAgendaMethod = TimesheetsGrpc.getAbsenceEmptyAgendaMethod) == null) {
          TimesheetsGrpc.getAbsenceEmptyAgendaMethod = getAbsenceEmptyAgendaMethod = 
              io.grpc.MethodDescriptor.<professional.absenceRequest, professional.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Timesheets", "AbsenceEmptyAgenda"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  professional.absenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  professional.success.getDefaultInstance()))
                  .setSchemaDescriptor(new TimesheetsMethodDescriptorSupplier("AbsenceEmptyAgenda"))
                  .build();
          }
        }
     }
     return getAbsenceEmptyAgendaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<professional.absenceRequest,
      professional.success> getAbsenceFullAgendaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbsenceFullAgenda",
      requestType = professional.absenceRequest.class,
      responseType = professional.success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<professional.absenceRequest,
      professional.success> getAbsenceFullAgendaMethod() {
    io.grpc.MethodDescriptor<professional.absenceRequest, professional.success> getAbsenceFullAgendaMethod;
    if ((getAbsenceFullAgendaMethod = TimesheetsGrpc.getAbsenceFullAgendaMethod) == null) {
      synchronized (TimesheetsGrpc.class) {
        if ((getAbsenceFullAgendaMethod = TimesheetsGrpc.getAbsenceFullAgendaMethod) == null) {
          TimesheetsGrpc.getAbsenceFullAgendaMethod = getAbsenceFullAgendaMethod = 
              io.grpc.MethodDescriptor.<professional.absenceRequest, professional.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Timesheets", "AbsenceFullAgenda"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  professional.absenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  professional.success.getDefaultInstance()))
                  .setSchemaDescriptor(new TimesheetsMethodDescriptorSupplier("AbsenceFullAgenda"))
                  .build();
          }
        }
     }
     return getAbsenceFullAgendaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimesheetsStub newStub(io.grpc.Channel channel) {
    return new TimesheetsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimesheetsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TimesheetsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TimesheetsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TimesheetsFutureStub(channel);
  }

  /**
   */
  public static abstract class TimesheetsImplBase implements io.grpc.BindableService {

    /**
     */
    public void introduceProfile(professional.profile request,
        io.grpc.stub.StreamObserver<professional.success> responseObserver) {
      asyncUnimplementedUnaryCall(getIntroduceProfileMethod(), responseObserver);
    }

    /**
     */
    public void absenceEmptyAgenda(professional.absenceRequest request,
        io.grpc.stub.StreamObserver<professional.success> responseObserver) {
      asyncUnimplementedUnaryCall(getAbsenceEmptyAgendaMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc AbsenceEmptyAgenda (stream absenceRequest) returns (success){}//lecture 7 min 19
     * </pre>
     */
    public io.grpc.stub.StreamObserver<professional.absenceRequest> absenceFullAgenda(
        io.grpc.stub.StreamObserver<professional.success> responseObserver) {
      return asyncUnimplementedStreamingCall(getAbsenceFullAgendaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIntroduceProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                professional.profile,
                professional.success>(
                  this, METHODID_INTRODUCE_PROFILE)))
          .addMethod(
            getAbsenceEmptyAgendaMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                professional.absenceRequest,
                professional.success>(
                  this, METHODID_ABSENCE_EMPTY_AGENDA)))
          .addMethod(
            getAbsenceFullAgendaMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                professional.absenceRequest,
                professional.success>(
                  this, METHODID_ABSENCE_FULL_AGENDA)))
          .build();
    }
  }

  /**
   */
  public static final class TimesheetsStub extends io.grpc.stub.AbstractStub<TimesheetsStub> {
    private TimesheetsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimesheetsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimesheetsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimesheetsStub(channel, callOptions);
    }

    /**
     */
    public void introduceProfile(professional.profile request,
        io.grpc.stub.StreamObserver<professional.success> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntroduceProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void absenceEmptyAgenda(professional.absenceRequest request,
        io.grpc.stub.StreamObserver<professional.success> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAbsenceEmptyAgendaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *rpc AbsenceEmptyAgenda (stream absenceRequest) returns (success){}//lecture 7 min 19
     * </pre>
     */
    public io.grpc.stub.StreamObserver<professional.absenceRequest> absenceFullAgenda(
        io.grpc.stub.StreamObserver<professional.success> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAbsenceFullAgendaMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TimesheetsBlockingStub extends io.grpc.stub.AbstractStub<TimesheetsBlockingStub> {
    private TimesheetsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimesheetsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimesheetsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimesheetsBlockingStub(channel, callOptions);
    }

    /**
     */
    public professional.success introduceProfile(professional.profile request) {
      return blockingUnaryCall(
          getChannel(), getIntroduceProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<professional.success> absenceEmptyAgenda(
        professional.absenceRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAbsenceEmptyAgendaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TimesheetsFutureStub extends io.grpc.stub.AbstractStub<TimesheetsFutureStub> {
    private TimesheetsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimesheetsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimesheetsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimesheetsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<professional.success> introduceProfile(
        professional.profile request) {
      return futureUnaryCall(
          getChannel().newCall(getIntroduceProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INTRODUCE_PROFILE = 0;
  private static final int METHODID_ABSENCE_EMPTY_AGENDA = 1;
  private static final int METHODID_ABSENCE_FULL_AGENDA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TimesheetsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TimesheetsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INTRODUCE_PROFILE:
          serviceImpl.introduceProfile((professional.profile) request,
              (io.grpc.stub.StreamObserver<professional.success>) responseObserver);
          break;
        case METHODID_ABSENCE_EMPTY_AGENDA:
          serviceImpl.absenceEmptyAgenda((professional.absenceRequest) request,
              (io.grpc.stub.StreamObserver<professional.success>) responseObserver);
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
        case METHODID_ABSENCE_FULL_AGENDA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.absenceFullAgenda(
              (io.grpc.stub.StreamObserver<professional.success>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TimesheetsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TimesheetsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return professional.ProfessionalSchedule.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Timesheets");
    }
  }

  private static final class TimesheetsFileDescriptorSupplier
      extends TimesheetsBaseDescriptorSupplier {
    TimesheetsFileDescriptorSupplier() {}
  }

  private static final class TimesheetsMethodDescriptorSupplier
      extends TimesheetsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TimesheetsMethodDescriptorSupplier(String methodName) {
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
      synchronized (TimesheetsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TimesheetsFileDescriptorSupplier())
              .addMethod(getIntroduceProfileMethod())
              .addMethod(getAbsenceEmptyAgendaMethod())
              .addMethod(getAbsenceFullAgendaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
