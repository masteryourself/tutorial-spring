package pers.masteryourself.tutorial.spring.cloud.consumer.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>description : ConsumerApplication6001
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/5/30 14:00
 */
@SpringBootApplication
public class ConsumerApplication6001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication6001.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
