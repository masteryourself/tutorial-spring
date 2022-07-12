package org.masteryourself.tutorial.microservice.stock.mq.service;

import org.masteryourself.tutorial.microservice.stock.mq.dao.StockMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>description : StockService
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 14:15
 */
@Service
public class StockService {

    @Resource
    private StockMapper stockMapper;

    @Transactional
    public int reduce(Long goodsId, Integer number) {
        return stockMapper.reduce(goodsId, number);
    }
}
