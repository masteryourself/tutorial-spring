package org.masteryourself.tutorial.microservice.stock.mq.service;

import org.masteryourself.tutorial.microservice.stock.mq.dao.TxLogMapper;
import org.masteryourself.tutorial.microservice.stock.mq.entity.TxLogEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * <p>description : TxLogService
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 21:56
 */
@Service
public class TxLogService {

    @Resource
    private TxLogMapper txLogMapper;

    @Transactional
    public int create(String txId) {
        TxLogEntity txLog = new TxLogEntity();
        txLog.setTxId(txId);
        return txLogMapper.insertSelective(txLog);
    }

    public int txIdExist(String txId) {
        Example example = new Example(TxLogEntity.class);
        example.createCriteria().andEqualTo("txId", txId);
        return txLogMapper.selectCountByExample(example);
    }

}
