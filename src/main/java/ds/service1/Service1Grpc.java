package ds.service1;

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
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "service1.Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service1.DesiredRoomConditions,
      ds.service1.Confirmation> getDesiredSettingHVACMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "desiredSettingHVAC",
      requestType = ds.service1.DesiredRoomConditions.class,
      responseType = ds.service1.Confirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service1.DesiredRoomConditions,
      ds.service1.Confirmation> getDesiredSettingHVACMethod() {
    io.grpc.MethodDescriptor<ds.service1.DesiredRoomConditions, ds.service1.Confirmation> getDesiredSettingHVACMethod;
    if ((getDesiredSettingHVACMethod = Service1Grpc.getDesiredSettingHVACMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getDesiredSettingHVACMethod = Service1Grpc.getDesiredSettingHVACMethod) == null) {
          Service1Grpc.getDesiredSettingHVACMethod = getDesiredSettingHVACMethod = 
              io.grpc.MethodDescriptor.<ds.service1.DesiredRoomConditions, ds.service1.Confirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "desiredSettingHVAC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.DesiredRoomConditions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.Confirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("desiredSettingHVAC"))
                  .build();
          }
        }
     }
     return getDesiredSettingHVACMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.CurrentRoomConditions,
      ds.service1.Acknowledged> getHVACstatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HVACstatus",
      requestType = ds.service1.CurrentRoomConditions.class,
      responseType = ds.service1.Acknowledged.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.CurrentRoomConditions,
      ds.service1.Acknowledged> getHVACstatusMethod() {
    io.grpc.MethodDescriptor<ds.service1.CurrentRoomConditions, ds.service1.Acknowledged> getHVACstatusMethod;
    if ((getHVACstatusMethod = Service1Grpc.getHVACstatusMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getHVACstatusMethod = Service1Grpc.getHVACstatusMethod) == null) {
          Service1Grpc.getHVACstatusMethod = getHVACstatusMethod = 
              io.grpc.MethodDescriptor.<ds.service1.CurrentRoomConditions, ds.service1.Acknowledged>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "HVACstatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.CurrentRoomConditions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.Acknowledged.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("HVACstatus"))
                  .build();
          }
        }
     }
     return getHVACstatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.Room,
      ds.service1.AdjustHVAC> getRoomStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoomStatus",
      requestType = ds.service1.Room.class,
      responseType = ds.service1.AdjustHVAC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.Room,
      ds.service1.AdjustHVAC> getRoomStatusMethod() {
    io.grpc.MethodDescriptor<ds.service1.Room, ds.service1.AdjustHVAC> getRoomStatusMethod;
    if ((getRoomStatusMethod = Service1Grpc.getRoomStatusMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getRoomStatusMethod = Service1Grpc.getRoomStatusMethod) == null) {
          Service1Grpc.getRoomStatusMethod = getRoomStatusMethod = 
              io.grpc.MethodDescriptor.<ds.service1.Room, ds.service1.AdjustHVAC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "RoomStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.Room.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.AdjustHVAC.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("RoomStatus"))
                  .build();
          }
        }
     }
     return getRoomStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service1Stub newStub(io.grpc.Channel channel) {
    return new Service1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service1FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void desiredSettingHVAC(ds.service1.DesiredRoomConditions request,
        io.grpc.stub.StreamObserver<ds.service1.Confirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getDesiredSettingHVACMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service1.CurrentRoomConditions> hVACstatus(
        io.grpc.stub.StreamObserver<ds.service1.Acknowledged> responseObserver) {
      return asyncUnimplementedStreamingCall(getHVACstatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *Server stream:
     * </pre>
     */
    public void roomStatus(ds.service1.Room request,
        io.grpc.stub.StreamObserver<ds.service1.AdjustHVAC> responseObserver) {
      asyncUnimplementedUnaryCall(getRoomStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDesiredSettingHVACMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service1.DesiredRoomConditions,
                ds.service1.Confirmation>(
                  this, METHODID_DESIRED_SETTING_HVAC)))
          .addMethod(
            getHVACstatusMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.service1.CurrentRoomConditions,
                ds.service1.Acknowledged>(
                  this, METHODID_HVACSTATUS)))
          .addMethod(
            getRoomStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service1.Room,
                ds.service1.AdjustHVAC>(
                  this, METHODID_ROOM_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1Stub extends io.grpc.stub.AbstractStub<Service1Stub> {
    private Service1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1Stub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void desiredSettingHVAC(ds.service1.DesiredRoomConditions request,
        io.grpc.stub.StreamObserver<ds.service1.Confirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDesiredSettingHVACMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service1.CurrentRoomConditions> hVACstatus(
        io.grpc.stub.StreamObserver<ds.service1.Acknowledged> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHVACstatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Server stream:
     * </pre>
     */
    public void roomStatus(ds.service1.Room request,
        io.grpc.stub.StreamObserver<ds.service1.AdjustHVAC> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRoomStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1BlockingStub extends io.grpc.stub.AbstractStub<Service1BlockingStub> {
    private Service1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public ds.service1.Confirmation desiredSettingHVAC(ds.service1.DesiredRoomConditions request) {
      return blockingUnaryCall(
          getChannel(), getDesiredSettingHVACMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server stream:
     * </pre>
     */
    public java.util.Iterator<ds.service1.AdjustHVAC> roomStatus(
        ds.service1.Room request) {
      return blockingServerStreamingCall(
          getChannel(), getRoomStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1FutureStub extends io.grpc.stub.AbstractStub<Service1FutureStub> {
    private Service1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service1.Confirmation> desiredSettingHVAC(
        ds.service1.DesiredRoomConditions request) {
      return futureUnaryCall(
          getChannel().newCall(getDesiredSettingHVACMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DESIRED_SETTING_HVAC = 0;
  private static final int METHODID_ROOM_STATUS = 1;
  private static final int METHODID_HVACSTATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESIRED_SETTING_HVAC:
          serviceImpl.desiredSettingHVAC((ds.service1.DesiredRoomConditions) request,
              (io.grpc.stub.StreamObserver<ds.service1.Confirmation>) responseObserver);
          break;
        case METHODID_ROOM_STATUS:
          serviceImpl.roomStatus((ds.service1.Room) request,
              (io.grpc.stub.StreamObserver<ds.service1.AdjustHVAC>) responseObserver);
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
        case METHODID_HVACSTATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.hVACstatus(
              (io.grpc.stub.StreamObserver<ds.service1.Acknowledged>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service1.Service1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service1");
    }
  }

  private static final class Service1FileDescriptorSupplier
      extends Service1BaseDescriptorSupplier {
    Service1FileDescriptorSupplier() {}
  }

  private static final class Service1MethodDescriptorSupplier
      extends Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service1FileDescriptorSupplier())
              .addMethod(getDesiredSettingHVACMethod())
              .addMethod(getHVACstatusMethod())
              .addMethod(getRoomStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
