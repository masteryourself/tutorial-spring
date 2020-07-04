package pers.masteryourself.tutorial.spring.cloud.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>description : ConsumerApplication6003
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/4 14:18
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerApplication6003 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication6003.class, args);
    }

}
