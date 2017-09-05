package com.front.dao;

import com.front.entity.parkinglot;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface parkingLotDao {
    //查询所有车位
    List<parkinglot> queryAllParkingLot();
    //通过用户ID查询车位状况
    List<parkinglot> queryByUser_Id(@Param("user_id") int user_id);
    //新增车位
    int insertParkingLot(@Param("parking_id")long parking_id,
                         @Param("park_location")String park_location,
                         @Param("user_id") int user_id);
    //删除车位
    int deleteParkingLotByParkingLotId(@Param("parkinglot_id") long parkinglot_id);
}