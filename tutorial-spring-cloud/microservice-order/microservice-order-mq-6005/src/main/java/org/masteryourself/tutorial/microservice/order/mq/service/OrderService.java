package org.masteryourself.tutorial.microservice.order.mq.service;

import org.masteryourself.tutorial.microservice.order.mq.dao.OrderMapper;
import org.masteryourself.tutorial.microservice.order.mq.entity.OrderEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>description : OrderService
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 14:15
 */
@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Transactional
    public int create(OrderEntity order) {
        return orderMapper.insertSelective(order);
    }

}
