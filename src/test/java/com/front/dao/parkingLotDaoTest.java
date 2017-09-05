package com.front.dao;

import com.front.entity.parkinglot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class parkingLotDaoTest {
    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private parkingLotDao parkingLotDao;
    @Test
    public void queryAllParkingLot() throws Exception{
        List<parkinglot> all=parkingLotDao.queryAllParkingLot();
        logger.info(all.toString());

    }
    @Test
    public void queryByUser_Id() throws Exception{
        List<parkinglot> all=parkingLotDao.queryByUser_Id(4);
        logger.info(all.toString());
    }
    @Test
    public void insertParkingLot() throws Exception{
        int insertParkingLot=parkingLotDao.insertParkingLot(1,"梅园新村",3);
        System.out.println(insertParkingLot);
    }
    @Test
    public void deleteParkingLotByParkingLotId() throws Exception{
        int delete=parkingLotDao.deleteParkingLotByParkingLotId(1);
        System.out.println(delete);
    }
}