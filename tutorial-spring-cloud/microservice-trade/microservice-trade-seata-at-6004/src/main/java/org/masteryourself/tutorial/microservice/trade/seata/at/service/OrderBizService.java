package org.masteryourself.tutorial.microservice.trade.seata.at.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.masteryourself.tutorial.microservice.api.Result;
import org.masteryourself.tutorial.microservice.api.feign.StockSeataAtFeign;
import org.masteryourself.tutorial.microservice.trade.seata.at.entity.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    private StockSeataAtFeign stockSeataAtFeign;

    @GlobalTransactional
    public Result create(Order order) {
        if (orderService.create(order) <= 0) {
            throw new RuntimeException("订单创建失败");
        }
        if (!stockSeataAtFeign.reduce(order.getGoodsId(), order.getNumber()).getSuccess()) {
            throw new RuntimeException("库存扣减失败");
        }
        // 模拟抛出异常
        if (order.getNumber() == 2) {
            throw new RuntimeException("你不能一次性购买两个商品");
        }
        return Result.ok("订单创建成功");
    }

}
