package ds.service3;

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
    comments = "Source: service3.proto")
public final class Service3Grpc {

  private Service3Grpc() {}

  public static final String SERVICE_NAME = "service3.Service3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service3.ToiletVisitsRequest,
      ds.service3.ToiletVisitsResponse> getEntersToToiletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EntersToToilet",
      requestType = ds.service3.ToiletVisitsRequest.class,
      responseType = ds.service3.ToiletVisitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service3.ToiletVisitsRequest,
      ds.service3.ToiletVisitsResponse> getEntersToToiletMethod() {
    io.grpc.MethodDescriptor<ds.service3.ToiletVisitsRequest, ds.service3.ToiletVisitsResponse> getEntersToToiletMethod;
    if ((getEntersToToiletMethod = Service3Grpc.getEntersToToiletMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getEntersToToiletMethod = Service3Grpc.getEntersToToiletMethod) == null) {
          Service3Grpc.getEntersToToiletMethod = getEntersToToiletMethod = 
              io.grpc.MethodDescriptor.<ds.service3.ToiletVisitsRequest, ds.service3.ToiletVisitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service3.Service3", "EntersToToilet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.ToiletVisitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.ToiletVisitsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("EntersToToilet"))
                  .build();
          }
        }
     }
     return getEntersToToiletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service3.UpdateToiletStatusRequest,
      ds.service3.UpdateToiletStatusResponse> getUpdateToiletStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateToiletStatus",
      requestType = ds.service3.UpdateToiletStatusRequest.class,
      responseType = ds.service3.UpdateToiletStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.UpdateToiletStatusRequest,
      ds.service3.UpdateToiletStatusResponse> getUpdateToiletStatusMethod() {
    io.grpc.MethodDescriptor<ds.service3.UpdateToiletStatusRequest, ds.service3.UpdateToiletStatusResponse> getUpdateToiletStatusMethod;
    if ((getUpdateToiletStatusMethod = Service3Grpc.getUpdateToiletStatusMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getUpdateToiletStatusMethod = Service3Grpc.getUpdateToiletStatusMethod) == null) {
          Service3Grpc.getUpdateToiletStatusMethod = getUpdateToiletStatusMethod = 
              io.grpc.MethodDescriptor.<ds.service3.UpdateToiletStatusRequest, ds.service3.UpdateToiletStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3.Service3", "UpdateToiletStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.UpdateToiletStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.UpdateToiletStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("UpdateToiletStatus"))
                  .build();
          }
        }
     }
     return getUpdateToiletStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service3Stub newStub(io.grpc.Channel channel) {
    return new Service3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service3FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void entersToToilet(ds.service3.ToiletVisitsRequest request,
        io.grpc.stub.StreamObserver<ds.service3.ToiletVisitsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEntersToToiletMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.UpdateToiletStatusRequest> updateToiletStatus(
        io.grpc.stub.StreamObserver<ds.service3.UpdateToiletStatusResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getUpdateToiletStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEntersToToiletMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service3.ToiletVisitsRequest,
                ds.service3.ToiletVisitsResponse>(
                  this, METHODID_ENTERS_TO_TOILET)))
          .addMethod(
            getUpdateToiletStatusMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service3.UpdateToiletStatusRequest,
                ds.service3.UpdateToiletStatusResponse>(
                  this, METHODID_UPDATE_TOILET_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service3Stub extends io.grpc.stub.AbstractStub<Service3Stub> {
    private Service3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3Stub(channel, callOptions);
    }

    /**
     */
    public void entersToToilet(ds.service3.ToiletVisitsRequest request,
        io.grpc.stub.StreamObserver<ds.service3.ToiletVisitsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEntersToToiletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.UpdateToiletStatusRequest> updateToiletStatus(
        io.grpc.stub.StreamObserver<ds.service3.UpdateToiletStatusResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getUpdateToiletStatusMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service3BlockingStub extends io.grpc.stub.AbstractStub<Service3BlockingStub> {
    private Service3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3BlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.service3.ToiletVisitsResponse entersToToilet(ds.service3.ToiletVisitsRequest request) {
      return blockingUnaryCall(
          getChannel(), getEntersToToiletMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service3FutureStub extends io.grpc.stub.AbstractStub<Service3FutureStub> {
    private Service3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service3.ToiletVisitsResponse> entersToToilet(
        ds.service3.ToiletVisitsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEntersToToiletMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTERS_TO_TOILET = 0;
  private static final int METHODID_UPDATE_TOILET_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTERS_TO_TOILET:
          serviceImpl.entersToToilet((ds.service3.ToiletVisitsRequest) request,
              (io.grpc.stub.StreamObserver<ds.service3.ToiletVisitsResponse>) responseObserver);
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
        case METHODID_UPDATE_TOILET_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateToiletStatus(
              (io.grpc.stub.StreamObserver<ds.service3.UpdateToiletStatusResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service3.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service3");
    }
  }

  private static final class Service3FileDescriptorSupplier
      extends Service3BaseDescriptorSupplier {
    Service3FileDescriptorSupplier() {}
  }

  private static final class Service3MethodDescriptorSupplier
      extends Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service3MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service3FileDescriptorSupplier())
              .addMethod(getEntersToToiletMethod())
              .addMethod(getUpdateToiletStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
