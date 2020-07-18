package pers.masteryourself.tutorial.spring.cloud.consumer.feign.hystrix.fallback;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>description : ConsumerApplication6006
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 13:35
 */
@SpringCloudApplication
@EnableFeignClients
public class ConsumerApplication6006 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication6006.class, args);
    }

}
