package org.masteryourself.tutorial.microservice.stock.seata.at.service;

import org.masteryourself.tutorial.microservice.api.Result;
import org.springframework.stereotype.Service;

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
@Service
public class StockBizService {

    @Resource
    private StockService stockService;

    public Result reduce(Long goodsId, Integer number) {
        if (stockService.reduce(goodsId, number) <= 0) {
            return Result.fail("扣减库存失败");
        }
        return Result.ok("扣减库存成功");
    }

}
