package org.masteryourself.tutorial.microservice.stock.seata.at;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>description : StockApplication5004
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 11:43
 */
@MapperScan(basePackages = "org.masteryourself.tutorial.microservice.stock.seata.at.dao")
@EnableEurekaClient
@SpringBootApplication
public class StockApplication5004 {

    public static void main(String[] args) {
        SpringApplication.run(StockApplication5004.class, args);
    }

}
