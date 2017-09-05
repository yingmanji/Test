package com.front.dao;

import com.front.entity.generate;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface generateDao {
    //查询所有订单表
    List<generate> queryAll();
    //添加订单表（停车位ID 开始（结束）时间和价格）
    int insertGenerate(@Param("parkinglot_id") long parkinglot_id,
                       @Param("share_begin") String share_begin,
                       @Param("share_end") String share_end,
                       @Param("price") BigDecimal price
                       );
    //删除订单表（订单ID）
    int deleteGenerate(@Param("generate_id") long generate_id);
}