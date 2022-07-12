package org.masteryourself.tutorial.microservice.order.mq.processor;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionState;
import org.masteryourself.tutorial.microservice.api.Result;
import org.masteryourself.tutorial.microservice.api.request.OrderMqRequest;
import org.masteryourself.tutorial.microservice.order.mq.service.OrderBizService;
import org.masteryourself.tutorial.microservice.order.mq.service.TxLogService;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>description : OrderMqTxListener
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 21:26
 */
@Slf4j
@Component
@RocketMQTransactionListener
public class OrderMqTxListener implements RocketMQLocalTransactionListener {

    @Resource
    private OrderBizService orderBizService;

    @Resource
    private TxLogService txLogService;

    /**
     * rocketmq 接收到消息后回调这个方法, 用来处理本地事务
     */
    @Override
    public RocketMQLocalTransactionState executeLocalTransaction(Message message, Object o) {
        try {
            Object source = message.getHeaders().get("source");
            if (source == null) {
                return RocketMQLocalTransactionState.UNKNOWN;
            }
            String sourceType = source.toString();
            switch (sourceType) {
                case "user_create_order":
                    return this.dealCreateOrderMsg(message);
                default:
                    log.info("未识别的消息来源 {}", sourceType);
                    break;
            }
        } catch (Exception e) {
            log.error("rocketmq 监听处理异常", e);
            return RocketMQLocalTransactionState.UNKNOWN;
        }
        return RocketMQLocalTransactionState.UNKNOWN;
    }

    private RocketMQLocalTransactionState dealCreateOrderMsg(Message message) {
        OrderMqRequest request = JSONObject.parseObject(
                new String((byte[]) message.getPayload()), OrderMqRequest.class);
        try {
            Result result = orderBizService.create(request);
            if (result.getSuccess()) {
                return RocketMQLocalTransactionState.COMMIT;
            } else {
                // 如果创单失败, 执行回滚操作
                return RocketMQLocalTransactionState.ROLLBACK;
            }
        } catch (Exception e) {
            log.error("订单创建失败, 事务消息回滚", e);
            return RocketMQLocalTransactionState.ROLLBACK;
        }
    }

    /**
     * 事务状态回查
     * 如果 rocketmq 未收到二次确认结果, 经过一段时间后会调用这个方法回查事务状态
     */
    @Override
    public RocketMQLocalTransactionState checkLocalTransaction(Message message) {
        try {
            Object source = message.getHeaders().get("source");
            if (source == null) {
                return RocketMQLocalTransactionState.UNKNOWN;
            }
            String sourceType = source.toString();
            switch (sourceType) {
                case "user_create_order":
                    OrderMqRequest request = JSONObject.parseObject(
                            new String((byte[]) message.getPayload()), OrderMqRequest.class);
                    String txId = request.getTxId();
                    // 如果事务日志已经存在, 说明创单成功, 需要把事务状态改为 commit
                    if (txLogService.txIdExist(txId) > 0) {
                        return RocketMQLocalTransactionState.COMMIT;
                    } else {
                        return RocketMQLocalTransactionState.UNKNOWN;
                    }
                default:
                    log.info("未识别的消息来源 {}", sourceType);
                    break;
            }
        } catch (Exception e) {
            log.error("rocketmq 监听处理异常", e);
            return RocketMQLocalTransactionState.UNKNOWN;
        }
        return RocketMQLocalTransactionState.UNKNOWN;
    }
}
