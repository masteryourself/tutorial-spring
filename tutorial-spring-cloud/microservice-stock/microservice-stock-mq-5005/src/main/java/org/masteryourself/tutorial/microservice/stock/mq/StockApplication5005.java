package org.masteryourself.tutorial.microservice.stock.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>description : StockApplication5005
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 22:23
 */
@MapperScan(basePackages = "org.masteryourself.tutorial.microservice.stock.mq.dao")
@SpringBootApplication
public class StockApplication5005 {

    public static void main(String[] args) {
        SpringApplication.run(StockApplication5005.class, args);
    }

}