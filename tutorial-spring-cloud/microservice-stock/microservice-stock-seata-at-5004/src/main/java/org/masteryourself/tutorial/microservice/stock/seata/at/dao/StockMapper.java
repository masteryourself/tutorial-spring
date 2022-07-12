package org.masteryourself.tutorial.microservice.stock.seata.at.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.masteryourself.tutorial.microservice.stock.seata.at.entity.StockEntity;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p>description : StockMapper
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/11 14:13
 */
public interface StockMapper extends Mapper<StockEntity> {

    @Update("update stock set stock = stock - #{number} where id = #{goodsId}")
    int reduce(@Param("goodsId") Long goodsId, @Param("number") Integer number);

}
