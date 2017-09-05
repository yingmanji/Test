package com.front.dao;

import com.front.entity.parking;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface parkingDao {
    //根据停车场Id查询某停车场具体信息
    parking queryById(@Param("parkingId") long parkingId);
    //返回6公里内停车场列表
    List<parking> queryBycondition(@Param("nowlongitude")BigDecimal nowlongitude,
                           @Param("nowlatitude") BigDecimal nowlatitude
                           );
}