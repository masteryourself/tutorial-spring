package org.masteryourself.tutorial.microservice.order.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>description : OrderApplication6005
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 11:45
 */
@MapperScan(basePackages = "org.masteryourself.tutorial.microservice.order.mq.dao")
@SpringBootApplication
public class OrderApplication6005 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication6005.class, args);
    }

}