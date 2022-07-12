package org.masteryourself.tutorial.microservice.order.seata.at.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <p>description : Order
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 14:08
 */
@Data
@Table(name = "`order`")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "goods_id")
    private Long goodsId;

    private Integer number;

}
