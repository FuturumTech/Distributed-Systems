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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "service1.Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service1.NumberRequest,
      ds.service1.NumberResponse> getSquaredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "squared",
      requestType = ds.service1.NumberRequest.class,
      responseType = ds.service1.NumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service1.NumberRequest,
      ds.service1.NumberResponse> getSquaredMethod() {
    io.grpc.MethodDescriptor<ds.service1.NumberRequest, ds.service1.NumberResponse> getSquaredMethod;
    if ((getSquaredMethod = Service1Grpc.getSquaredMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getSquaredMethod = Service1Grpc.getSquaredMethod) == null) {
          Service1Grpc.getSquaredMethod = getSquaredMethod = 
              io.grpc.MethodDescriptor.<ds.service1.NumberRequest, ds.service1.NumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "squared"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.NumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.NumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("squared"))
                  .build();
          }
        }
     }
     return getSquaredMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.NumberRequest,
      ds.service1.SumResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sum",
      requestType = ds.service1.NumberRequest.class,
      responseType = ds.service1.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.NumberRequest,
      ds.service1.SumResponse> getSumMethod() {
    io.grpc.MethodDescriptor<ds.service1.NumberRequest, ds.service1.SumResponse> getSumMethod;
    if ((getSumMethod = Service1Grpc.getSumMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getSumMethod = Service1Grpc.getSumMethod) == null) {
          Service1Grpc.getSumMethod = getSumMethod = 
              io.grpc.MethodDescriptor.<ds.service1.NumberRequest, ds.service1.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.NumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.SumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("sum"))
                  .build();
          }
        }
     }
     return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.NumberRequest,
      ds.service1.NumberResponse> getFibonacciMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fibonacci",
      requestType = ds.service1.NumberRequest.class,
      responseType = ds.service1.NumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.NumberRequest,
      ds.service1.NumberResponse> getFibonacciMethod() {
    io.grpc.MethodDescriptor<ds.service1.NumberRequest, ds.service1.NumberResponse> getFibonacciMethod;
    if ((getFibonacciMethod = Service1Grpc.getFibonacciMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getFibonacciMethod = Service1Grpc.getFibonacciMethod) == null) {
          Service1Grpc.getFibonacciMethod = getFibonacciMethod = 
              io.grpc.MethodDescriptor.<ds.service1.NumberRequest, ds.service1.NumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "fibonacci"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.NumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.NumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("fibonacci"))
                  .build();
          }
        }
     }
     return getFibonacciMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.NumberRequest,
      ds.service1.NumberResponse> getTotalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "total",
      requestType = ds.service1.NumberRequest.class,
      responseType = ds.service1.NumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.NumberRequest,
      ds.service1.NumberResponse> getTotalMethod() {
    io.grpc.MethodDescriptor<ds.service1.NumberRequest, ds.service1.NumberResponse> getTotalMethod;
    if ((getTotalMethod = Service1Grpc.getTotalMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getTotalMethod = Service1Grpc.getTotalMethod) == null) {
          Service1Grpc.getTotalMethod = getTotalMethod = 
              io.grpc.MethodDescriptor.<ds.service1.NumberRequest, ds.service1.NumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "total"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.NumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.NumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("total"))
                  .build();
          }
        }
     }
     return getTotalMethod;
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
   */
  public static abstract class Service1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void squared(ds.service1.NumberRequest request,
        io.grpc.stub.StreamObserver<ds.service1.NumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSquaredMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service1.NumberRequest> sum(
        io.grpc.stub.StreamObserver<ds.service1.SumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void fibonacci(ds.service1.NumberRequest request,
        io.grpc.stub.StreamObserver<ds.service1.NumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFibonacciMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service1.NumberRequest> total(
        io.grpc.stub.StreamObserver<ds.service1.NumberResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTotalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSquaredMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service1.NumberRequest,
                ds.service1.NumberResponse>(
                  this, METHODID_SQUARED)))
          .addMethod(
            getSumMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.service1.NumberRequest,
                ds.service1.SumResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getFibonacciMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service1.NumberRequest,
                ds.service1.NumberResponse>(
                  this, METHODID_FIBONACCI)))
          .addMethod(
            getTotalMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service1.NumberRequest,
                ds.service1.NumberResponse>(
                  this, METHODID_TOTAL)))
          .build();
    }
  }

  /**
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
     */
    public void squared(ds.service1.NumberRequest request,
        io.grpc.stub.StreamObserver<ds.service1.NumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSquaredMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service1.NumberRequest> sum(
        io.grpc.stub.StreamObserver<ds.service1.SumResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void fibonacci(ds.service1.NumberRequest request,
        io.grpc.stub.StreamObserver<ds.service1.NumberResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFibonacciMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service1.NumberRequest> total(
        io.grpc.stub.StreamObserver<ds.service1.NumberResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getTotalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
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
     */
    public ds.service1.NumberResponse squared(ds.service1.NumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getSquaredMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.service1.NumberResponse> fibonacci(
        ds.service1.NumberRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFibonacciMethod(), getCallOptions(), request);
    }
  }

  /**
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
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service1.NumberResponse> squared(
        ds.service1.NumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSquaredMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SQUARED = 0;
  private static final int METHODID_FIBONACCI = 1;
  private static final int METHODID_SUM = 2;
  private static final int METHODID_TOTAL = 3;

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
        case METHODID_SQUARED:
          serviceImpl.squared((ds.service1.NumberRequest) request,
              (io.grpc.stub.StreamObserver<ds.service1.NumberResponse>) responseObserver);
          break;
        case METHODID_FIBONACCI:
          serviceImpl.fibonacci((ds.service1.NumberRequest) request,
              (io.grpc.stub.StreamObserver<ds.service1.NumberResponse>) responseObserver);
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
        case METHODID_SUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sum(
              (io.grpc.stub.StreamObserver<ds.service1.SumResponse>) responseObserver);
        case METHODID_TOTAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.total(
              (io.grpc.stub.StreamObserver<ds.service1.NumberResponse>) responseObserver);
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
              .addMethod(getSquaredMethod())
              .addMethod(getSumMethod())
              .addMethod(getFibonacciMethod())
              .addMethod(getTotalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
