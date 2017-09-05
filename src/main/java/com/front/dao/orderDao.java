package com.front.dao;

import com.front.entity.order;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface orderDao {
    //查询全部交易记录
    List<order> queryAll();
    //插入新的交易记录
    int insertOrder(@Param("user_id") int user_id,
                    @Param("parkinglot_id") long parkinglot_id,
                    @Param("parking_begin") String parking_begin,
                    @Param("parking_end") String parking_end,
                    @Param("parking_totaltime") String parking_totaltime,
                    @Param("price")BigDecimal price
                    );
}