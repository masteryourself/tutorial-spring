package pers.masteryourself.tutorial.spring.cloud.consumer.eureka.grpc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.masteryourself.tutorial.spring.cloud.consumer.eureka.grpc.client.ConsumerService;

import javax.annotation.Resource;

/**
 * <p>description : ConsumerController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/5/30 17:35
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @RequestMapping("/info")
    public String info() {
        return consumerService.info();
    }

}
