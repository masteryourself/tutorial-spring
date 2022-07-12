package org.masteryourself.tutorial.microservice.stock.seata.at.controller;

import org.masteryourself.tutorial.microservice.api.Result;
import org.masteryourself.tutorial.microservice.api.feign.StockSeataAtFeign;
import org.masteryourself.tutorial.microservice.stock.seata.at.service.StockBizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>description : StockController
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 21:17
 */
@RestController
@RequestMapping(value = "/stock")
public class StockController implements StockSeataAtFeign {

    @Resource
    private StockBizService stockBizService;

    @Override
    @GetMapping("/reduce")
    public Result reduce(Long goodsId, Integer number) {
        return stockBizService.reduce(goodsId, number);
    }
}
