package org.masteryourself.tutorial.microservice.api.request;

import lombok.Builder;
import lombok.Data;

/**
 * <p>description : OrderMqRequest
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 21:47
 */
@Data
public class OrderMqRequest {

    private Long id;

    private Long goodsId;

    private Integer number;

    /**
     * 事务 id
     */
    private String txId;

}
