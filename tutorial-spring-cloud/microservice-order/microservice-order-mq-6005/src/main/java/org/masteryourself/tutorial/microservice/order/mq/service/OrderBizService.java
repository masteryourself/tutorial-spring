package org.masteryourself.tutorial.microservice.order.mq.service;

import ma.glasnost.orika.MapperFacade;
import org.apache.rocketmq.client.producer.TransactionSendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.masteryourself.tutorial.microservice.api.Result;
import org.masteryourself.tutorial.microservice.api.request.OrderMqRequest;
import org.masteryourself.tutorial.microservice.order.mq.entity.OrderEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * <p>description : OrderBizService
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 11:24
 */
@Service
public class OrderBizService {

    @Resource
    private OrderService orderService;

    @Resource
    private TxLogService txLogService;

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Resource
    private MapperFacade mapperFacade;

    public Result sendCreateOrderMq(OrderEntity order) {
        OrderMqRequest orderMqRequest = mapperFacade.map(order, OrderMqRequest.class);
        orderMqRequest.setTxId(UUID.randomUUID().toString().replaceAll("-", ""));
        TransactionSendResult result = rocketMQTemplate.sendMessageInTransaction(
                "user_create_order",
                MessageBuilder.withPayload(orderMqRequest)
                        .setHeader("source", "user_create_order")
                        .build(),
                null);
        return Result.ok("订单创建:" + result.getSendStatus());
    }

    @Transactional
    public Result create(OrderMqRequest request) {
        // 先判断是否有事务日志
        String txId = request.getTxId();
        if (txLogService.txIdExist(txId) > 0) {
            return Result.fail("事务日志已存在, 禁止重复创单");
        }
        OrderEntity orderEntity = mapperFacade.map(request, OrderEntity.class);
        if (orderService.create(orderEntity) <= 0) {
            return Result.fail("订单创建失败");
        }
        if (txLogService.create(txId) <= 0) {
            return Result.fail("事务日志创建失败");
        }
        // 模拟抛出异常
        if (request.getNumber() == 2) {
            throw new RuntimeException("你不能一次性购买两个商品");
        }
        return Result.ok("订单创建成功");
    }

}
