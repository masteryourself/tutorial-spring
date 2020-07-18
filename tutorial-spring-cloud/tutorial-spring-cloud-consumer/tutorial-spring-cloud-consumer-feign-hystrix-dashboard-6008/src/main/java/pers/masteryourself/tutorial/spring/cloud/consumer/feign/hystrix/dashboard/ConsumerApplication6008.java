package pers.masteryourself.tutorial.spring.cloud.consumer.feign.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>description : ConsumerApplication6008
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 17:42
 */
@SpringCloudApplication
@EnableFeignClients
public class ConsumerApplication6008 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication6008.class, args);
    }

}
