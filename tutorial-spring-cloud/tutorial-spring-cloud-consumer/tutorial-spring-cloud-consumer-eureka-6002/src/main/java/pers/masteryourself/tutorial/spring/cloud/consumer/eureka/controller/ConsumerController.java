package pers.masteryourself.tutorial.spring.cloud.consumer.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>description : ConsumerController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/5/30 17:35
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final String SERVICE_PROVIDER = "http://TUTORIAL-SPRING-CLOUD-PROVIDER-EUREKA/";

    @RequestMapping("/info")
    public Map<String, String> info() {
        String url = SERVICE_PROVIDER + "provider/info";
        return restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Map<String, String>>() {
        }).getBody();
    }

    @RequestMapping("/discovery")
    public Map<String, List<String>> discoveryClient() {
        Map<String, List<String>> result = new HashMap<>(10);
        List<String> serviceIds = discoveryClient.getServices();
        serviceIds.forEach(serviceId -> {
            List<String> temp = new ArrayList<>();
            List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
            instances.forEach(serviceInstance -> temp.add(serviceInstance.getHost() + ":" + serviceInstance.getPort()));
            result.put(serviceId, temp);
        });
        return result;
    }

}
