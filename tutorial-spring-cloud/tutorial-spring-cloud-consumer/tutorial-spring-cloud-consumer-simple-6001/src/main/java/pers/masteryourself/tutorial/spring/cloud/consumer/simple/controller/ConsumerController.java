package pers.masteryourself.tutorial.spring.cloud.consumer.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * <p>description : ConsumerController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/5/30 14:01
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String SERVICE_PROVIDER = "http://localhost:5001/";

    @RequestMapping("/info")
    public Map<String, String> info() {
        String url = SERVICE_PROVIDER + "provider/info";
        return restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Map<String, String>>() {
        }).getBody();
    }

}

