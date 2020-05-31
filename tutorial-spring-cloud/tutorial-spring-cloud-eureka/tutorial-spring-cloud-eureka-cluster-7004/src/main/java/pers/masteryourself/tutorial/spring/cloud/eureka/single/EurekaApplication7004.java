package pers.masteryourself.tutorial.spring.cloud.eureka.single;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>description : EurekaApplication7004
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/5/30 22:09
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7004 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7004.class, args);
    }

}
