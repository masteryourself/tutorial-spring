package org.masteryourself.tutorial.microservice.order.seata.at.controller;

import org.masteryourself.tutorial.microservice.api.Result;
import org.masteryourself.tutorial.microservice.order.seata.at.service.OrderBizService;
import org.masteryourself.tutorial.microservice.order.seata.at.entity.OrderEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>description : OrderController
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 14:14
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Resource
    private OrderBizService orderBizService;

    @GetMapping("/create")
    public Result create(Long goodsId, Integer number) {
        OrderEntity order = new OrderEntity();
        order.setGoodsId(goodsId);
        order.setNumber(number);
        return orderBizService.create(order);
    }

}
