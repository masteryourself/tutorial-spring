package org.masteryourself.tutorial.microservice.order.mq.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <p>description : TxLogEntity
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 21:55
 */
@Data
@Table(name = "`tx_log`")
public class TxLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tx_id")
    private String txId;

}
