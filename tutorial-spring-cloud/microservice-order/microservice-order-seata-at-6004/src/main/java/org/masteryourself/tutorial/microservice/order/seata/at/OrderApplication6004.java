package org.masteryourself.tutorial.microservice.order.seata.at;

import org.masteryourself.tutorial.microservice.api.feign.StockSeataAtFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>description : OrderApplication6004
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 11:45
 */
@MapperScan(basePackages = "org.masteryourself.tutorial.microservice.order.seata.at.dao")
@EnableFeignClients(clients = {StockSeataAtFeign.class})
@EnableEurekaClient
@SpringBootApplication
public class OrderApplication6004 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication6004.class, args);
    }

}