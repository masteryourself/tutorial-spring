package org.masteryourself.tutorial.microservice.trade.seata.at;

import org.masteryourself.tutorial.microservice.api.feign.StockSeataAtFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>description : TradeApplication6004
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 11:45
 */
@MapperScan(basePackages = "org.masteryourself.tutorial.microservice.trade.seata.at.dao")
@EnableFeignClients(clients = {StockSeataAtFeign.class})
@EnableEurekaClient
@SpringBootApplication
public class TradeApplication6004 {

    public static void main(String[] args) {
        SpringApplication.run(TradeApplication6004.class, args);
    }

}