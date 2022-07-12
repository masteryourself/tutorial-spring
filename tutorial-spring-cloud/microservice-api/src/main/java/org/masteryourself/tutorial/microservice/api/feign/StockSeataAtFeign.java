package org.masteryourself.tutorial.microservice.api.feign;

import org.masteryourself.tutorial.microservice.api.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * <p>description : StockSeataAtFeign
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 14:24
 */
@FeignClient(name = "microservice-stock-seata-at")
public interface StockSeataAtFeign {

    @GetMapping("/stock/reduce")
    Result reduce(@RequestParam(name = "goodsId") Long goodsId,
                  @RequestParam(name = "number") Integer number);

}
