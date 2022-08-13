package warehouse_CA.warehouseControl;

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
    comments = "Source: warehouseControl.proto")
public final class warehouseControlGrpc {

  private warehouseControlGrpc() {}

  public static final String SERVICE_NAME = "service1.warehouseControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<warehouse_CA.warehouseControl.TempRequest,
      warehouse_CA.warehouseControl.TempResponse> getChangeTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeTemp",
      requestType = warehouse_CA.warehouseControl.TempRequest.class,
      responseType = warehouse_CA.warehouseControl.TempResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<warehouse_CA.warehouseControl.TempRequest,
      warehouse_CA.warehouseControl.TempResponse> getChangeTempMethod() {
    io.grpc.MethodDescriptor<warehouse_CA.warehouseControl.TempRequest, warehouse_CA.warehouseControl.TempResponse> getChangeTempMethod;
    if ((getChangeTempMethod = warehouseControlGrpc.getChangeTempMethod) == null) {
      synchronized (warehouseControlGrpc.class) {
        if ((getChangeTempMethod = warehouseControlGrpc.getChangeTempMethod) == null) {
          warehouseControlGrpc.getChangeTempMethod = getChangeTempMethod = 
              io.grpc.MethodDescriptor.<warehouse_CA.warehouseControl.TempRequest, warehouse_CA.warehouseControl.TempResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.warehouseControl", "changeTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.warehouseControl.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.warehouseControl.TempResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new warehouseControlMethodDescriptorSupplier("changeTemp"))
                  .build();
          }
        }
     }
     return getChangeTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<warehouse_CA.warehouseControl.LightRequest,
      warehouse_CA.warehouseControl.LightResponse> getTurnOnOffLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnOffLights",
      requestType = warehouse_CA.warehouseControl.LightRequest.class,
      responseType = warehouse_CA.warehouseControl.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<warehouse_CA.warehouseControl.LightRequest,
      warehouse_CA.warehouseControl.LightResponse> getTurnOnOffLightsMethod() {
    io.grpc.MethodDescriptor<warehouse_CA.warehouseControl.LightRequest, warehouse_CA.warehouseControl.LightResponse> getTurnOnOffLightsMethod;
    if ((getTurnOnOffLightsMethod = warehouseControlGrpc.getTurnOnOffLightsMethod) == null) {
      synchronized (warehouseControlGrpc.class) {
        if ((getTurnOnOffLightsMethod = warehouseControlGrpc.getTurnOnOffLightsMethod) == null) {
          warehouseControlGrpc.getTurnOnOffLightsMethod = getTurnOnOffLightsMethod = 
              io.grpc.MethodDescriptor.<warehouse_CA.warehouseControl.LightRequest, warehouse_CA.warehouseControl.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.warehouseControl", "turnOnOffLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.warehouseControl.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.warehouseControl.LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new warehouseControlMethodDescriptorSupplier("turnOnOffLights"))
                  .build();
          }
        }
     }
     return getTurnOnOffLightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static warehouseControlStub newStub(io.grpc.Channel channel) {
    return new warehouseControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static warehouseControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new warehouseControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static warehouseControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new warehouseControlFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class warehouseControlImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for client streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.TempRequest> changeTemp(
        io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.TempResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChangeTempMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc method for bidirectional streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.LightRequest> turnOnOffLights(
        io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.LightResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTurnOnOffLightsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getChangeTempMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                warehouse_CA.warehouseControl.TempRequest,
                warehouse_CA.warehouseControl.TempResponse>(
                  this, METHODID_CHANGE_TEMP)))
          .addMethod(
            getTurnOnOffLightsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                warehouse_CA.warehouseControl.LightRequest,
                warehouse_CA.warehouseControl.LightResponse>(
                  this, METHODID_TURN_ON_OFF_LIGHTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class warehouseControlStub extends io.grpc.stub.AbstractStub<warehouseControlStub> {
    private warehouseControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private warehouseControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected warehouseControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new warehouseControlStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for client streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.TempRequest> changeTemp(
        io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.TempResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getChangeTempMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * rpc method for bidirectional streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.LightRequest> turnOnOffLights(
        io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.LightResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getTurnOnOffLightsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class warehouseControlBlockingStub extends io.grpc.stub.AbstractStub<warehouseControlBlockingStub> {
    private warehouseControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private warehouseControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected warehouseControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new warehouseControlBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class warehouseControlFutureStub extends io.grpc.stub.AbstractStub<warehouseControlFutureStub> {
    private warehouseControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private warehouseControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected warehouseControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new warehouseControlFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHANGE_TEMP = 0;
  private static final int METHODID_TURN_ON_OFF_LIGHTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final warehouseControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(warehouseControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHANGE_TEMP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.changeTemp(
              (io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.TempResponse>) responseObserver);
        case METHODID_TURN_ON_OFF_LIGHTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.turnOnOffLights(
              (io.grpc.stub.StreamObserver<warehouse_CA.warehouseControl.LightResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class warehouseControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    warehouseControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return warehouse_CA.warehouseControl.warehouseControlImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("warehouseControl");
    }
  }

  private static final class warehouseControlFileDescriptorSupplier
      extends warehouseControlBaseDescriptorSupplier {
    warehouseControlFileDescriptorSupplier() {}
  }

  private static final class warehouseControlMethodDescriptorSupplier
      extends warehouseControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    warehouseControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (warehouseControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new warehouseControlFileDescriptorSupplier())
              .addMethod(getChangeTempMethod())
              .addMethod(getTurnOnOffLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
