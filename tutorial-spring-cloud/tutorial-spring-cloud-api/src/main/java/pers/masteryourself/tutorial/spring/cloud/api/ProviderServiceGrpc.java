package pers.masteryourself.tutorial.spring.cloud.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: provider_service.proto")
public final class ProviderServiceGrpc {

  private ProviderServiceGrpc() {}

  public static final String SERVICE_NAME = "ProviderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest,
      pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "info",
      requestType = pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest.class,
      responseType = pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest,
      pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse> getInfoMethod() {
    io.grpc.MethodDescriptor<pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest, pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse> getInfoMethod;
    if ((getInfoMethod = ProviderServiceGrpc.getInfoMethod) == null) {
      synchronized (ProviderServiceGrpc.class) {
        if ((getInfoMethod = ProviderServiceGrpc.getInfoMethod) == null) {
          ProviderServiceGrpc.getInfoMethod = getInfoMethod =
              io.grpc.MethodDescriptor.<pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest, pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderServiceMethodDescriptorSupplier("info"))
              .build();
        }
      }
    }
    return getInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProviderServiceStub newStub(io.grpc.Channel channel) {
    return new ProviderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProviderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProviderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProviderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProviderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProviderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void info(pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest request,
        io.grpc.stub.StreamObserver<pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest,
                pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse>(
                  this, METHODID_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class ProviderServiceStub extends io.grpc.stub.AbstractStub<ProviderServiceStub> {
    private ProviderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderServiceStub(channel, callOptions);
    }

    /**
     */
    public void info(pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest request,
        io.grpc.stub.StreamObserver<pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProviderServiceBlockingStub extends io.grpc.stub.AbstractStub<ProviderServiceBlockingStub> {
    private ProviderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse info(pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProviderServiceFutureStub extends io.grpc.stub.AbstractStub<ProviderServiceFutureStub> {
    private ProviderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProviderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProviderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse> info(
        pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProviderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProviderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INFO:
          serviceImpl.info((pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest) request,
              (io.grpc.stub.StreamObserver<pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse>) responseObserver);
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

  private static abstract class ProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProviderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProviderService");
    }
  }

  private static final class ProviderServiceFileDescriptorSupplier
      extends ProviderServiceBaseDescriptorSupplier {
    ProviderServiceFileDescriptorSupplier() {}
  }

  private static final class ProviderServiceMethodDescriptorSupplier
      extends ProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProviderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProviderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProviderServiceFileDescriptorSupplier())
              .addMethod(getInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
