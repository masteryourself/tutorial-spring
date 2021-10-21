package pers.masteryourself.tutorial.spring.cloud.provider.eureka.grpc.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceGrpc;
import pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest;
import pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceResponse;

/**
 * <p>description : ProviderService
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/10/21 14:18
 */
@GrpcService
public class ProviderService extends ProviderServiceGrpc.ProviderServiceImplBase {

    @Override
    public void info(ProviderServiceRequest request, StreamObserver<ProviderServiceResponse> responseObserver) {
        ProviderServiceResponse response = ProviderServiceResponse.newBuilder().setResponse("grpc response").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
