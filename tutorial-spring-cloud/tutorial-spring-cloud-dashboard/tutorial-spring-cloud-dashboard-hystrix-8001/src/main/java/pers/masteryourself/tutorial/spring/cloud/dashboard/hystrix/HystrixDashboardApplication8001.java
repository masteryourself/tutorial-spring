package pers.masteryourself.tutorial.spring.cloud.dashboard.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>description : HystrixDashboardApplication8001
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 17:21
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication8001 {

    public static void main(String [] args){
        SpringApplication.run(HystrixDashboardApplication8001.class, args);
    }

}