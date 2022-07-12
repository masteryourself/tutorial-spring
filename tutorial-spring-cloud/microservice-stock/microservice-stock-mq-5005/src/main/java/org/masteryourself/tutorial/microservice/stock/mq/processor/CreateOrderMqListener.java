package org.masteryourself.tutorial.microservice.stock.mq.processor;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.masteryourself.tutorial.microservice.api.request.OrderMqRequest;
import org.masteryourself.tutorial.microservice.stock.mq.service.StockBizService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>description : CreateOrderMqListener
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 22:26
 */
@Component
@RocketMQMessageListener(
        consumerGroup = "microservice-order-mq",
        topic = "user_create_order")
public class CreateOrderMqListener implements RocketMQListener<OrderMqRequest> {

    @Resource
    private StockBizService stockBizService;

    /**
     * 监听创建订单消息, 扣减库存
     */
    @Override
    public void onMessage(OrderMqRequest request) {
        stockBizService.reduce(request);
    }

}
