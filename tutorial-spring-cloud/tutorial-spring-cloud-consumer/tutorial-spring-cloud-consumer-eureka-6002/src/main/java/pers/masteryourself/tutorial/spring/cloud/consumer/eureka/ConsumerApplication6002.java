package pers.masteryourself.tutorial.spring.cloud.consumer.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>description : ConsumerApplication6002
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/5/30 17:29
 */
@SpringBootApplication
public class ConsumerApplication6002 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication6002.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
