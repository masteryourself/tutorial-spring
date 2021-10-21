package pers.masteryourself.tutorial.spring.cloud.consumer.eureka.grpc.client;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceGrpc;
import pers.masteryourself.tutorial.spring.cloud.api.ProviderServiceRequest;

/**
 * <p>description : ProviderClient
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/10/21 14:27
 */
@Service
public class ConsumerService {

    @GrpcClient("TUTORIAL-SPRING-CLOUD-PROVIDER-EUREKA-GRPC")
    private ProviderServiceGrpc.ProviderServiceBlockingStub providerServiceBlockingStub;

    public String info() {
        ProviderServiceRequest request = ProviderServiceRequest.newBuilder().setRequest("grpc request").build();
        return providerServiceBlockingStub.info(request).getResponse();
    }

}
