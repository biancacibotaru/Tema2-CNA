package proto;

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
    comments = "Source: zodiac.proto")
public final class ZodiacGrpc {

  private ZodiacGrpc() {}

  public static final String SERVICE_NAME = "Zodiac";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ZodiacOuterClass.DateRequest,
      proto.ZodiacOuterClass.ZodiacReply> getGetZodiacMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZodiac",
      requestType = proto.ZodiacOuterClass.DateRequest.class,
      responseType = proto.ZodiacOuterClass.ZodiacReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ZodiacOuterClass.DateRequest,
      proto.ZodiacOuterClass.ZodiacReply> getGetZodiacMethod() {
    io.grpc.MethodDescriptor<proto.ZodiacOuterClass.DateRequest, proto.ZodiacOuterClass.ZodiacReply> getGetZodiacMethod;
    if ((getGetZodiacMethod = ZodiacGrpc.getGetZodiacMethod) == null) {
      synchronized (ZodiacGrpc.class) {
        if ((getGetZodiacMethod = ZodiacGrpc.getGetZodiacMethod) == null) {
          ZodiacGrpc.getGetZodiacMethod = getGetZodiacMethod = 
              io.grpc.MethodDescriptor.<proto.ZodiacOuterClass.DateRequest, proto.ZodiacOuterClass.ZodiacReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Zodiac", "GetZodiac"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ZodiacOuterClass.DateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ZodiacOuterClass.ZodiacReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ZodiacMethodDescriptorSupplier("GetZodiac"))
                  .build();
          }
        }
     }
     return getGetZodiacMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZodiacStub newStub(io.grpc.Channel channel) {
    return new ZodiacStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZodiacBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ZodiacBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ZodiacFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ZodiacFutureStub(channel);
  }

  /**
   */
  public static abstract class ZodiacImplBase implements io.grpc.BindableService {

    /**
     */
    public void getZodiac(proto.ZodiacOuterClass.DateRequest request,
        io.grpc.stub.StreamObserver<proto.ZodiacOuterClass.ZodiacReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZodiacMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetZodiacMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ZodiacOuterClass.DateRequest,
                proto.ZodiacOuterClass.ZodiacReply>(
                  this, METHODID_GET_ZODIAC)))
          .build();
    }
  }

  /**
   */
  public static final class ZodiacStub extends io.grpc.stub.AbstractStub<ZodiacStub> {
    private ZodiacStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZodiacStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZodiacStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZodiacStub(channel, callOptions);
    }

    /**
     */
    public void getZodiac(proto.ZodiacOuterClass.DateRequest request,
        io.grpc.stub.StreamObserver<proto.ZodiacOuterClass.ZodiacReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZodiacMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ZodiacBlockingStub extends io.grpc.stub.AbstractStub<ZodiacBlockingStub> {
    private ZodiacBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZodiacBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZodiacBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZodiacBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ZodiacOuterClass.ZodiacReply getZodiac(proto.ZodiacOuterClass.DateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetZodiacMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ZodiacFutureStub extends io.grpc.stub.AbstractStub<ZodiacFutureStub> {
    private ZodiacFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZodiacFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZodiacFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZodiacFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ZodiacOuterClass.ZodiacReply> getZodiac(
        proto.ZodiacOuterClass.DateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetZodiacMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ZODIAC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ZodiacImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ZodiacImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ZODIAC:
          serviceImpl.getZodiac((proto.ZodiacOuterClass.DateRequest) request,
              (io.grpc.stub.StreamObserver<proto.ZodiacOuterClass.ZodiacReply>) responseObserver);
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

  private static abstract class ZodiacBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ZodiacBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ZodiacOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Zodiac");
    }
  }

  private static final class ZodiacFileDescriptorSupplier
      extends ZodiacBaseDescriptorSupplier {
    ZodiacFileDescriptorSupplier() {}
  }

  private static final class ZodiacMethodDescriptorSupplier
      extends ZodiacBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ZodiacMethodDescriptorSupplier(String methodName) {
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
      synchronized (ZodiacGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ZodiacFileDescriptorSupplier())
              .addMethod(getGetZodiacMethod())
              .build();
        }
      }
    }
    return result;
  }
}
