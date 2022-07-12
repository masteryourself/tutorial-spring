package org.masteryourself.tutorial.microservice.stock.mq.service;

import lombok.extern.slf4j.Slf4j;
import org.masteryourself.tutorial.microservice.api.request.OrderMqRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>description : StockBizService
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 11:26
 */
@Slf4j
@Service
public class StockBizService {

    @Resource
    private StockService stockService;

    @Resource
    private TxLogService txLogService;

    @Transactional
    public void reduce(OrderMqRequest request) {
        // 先判断是否有事务日志
        String txId = request.getTxId();
        if (txLogService.txIdExist(txId) > 0) {
            log.warn("事务日志已存在, 禁止重复扣减库存 {}", request);
            return;
        }
        int stockRes = stockService.reduce(request.getGoodsId(), request.getNumber());
        if (stockRes <= 0) {
            log.warn("库存扣减失败 {}", request);
            return;
        }
        int txLogRes = txLogService.create(txId);
        if (txLogRes <= 0) {
            log.warn("事务日志创建失败 {}", request);
            return;
        }
        log.info("库存扣减成功 {}", request);
    }
}
