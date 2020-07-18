package pers.masteryourself.tutorial.spring.cloud.consumer.feign.fallbackfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>description : ConsumerApplication6007
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 14:40
 */
@SpringCloudApplication
@EnableFeignClients
public class ConsumerApplication6007 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication6007.class, args);
    }

}
