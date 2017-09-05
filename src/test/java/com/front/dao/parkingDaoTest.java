package com.front.dao;

import com.front.entity.parking;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class parkingDaoTest {

    @Autowired
    parkingDao parkingdao;
    @Test
    public void queryById() throws Exception{
        parking parkings=parkingdao.queryById(1);
        System.out.println(parkings.toString());
    }
    @Test
    public void queryBycondition() throws Exception{
        BigDecimal longs=new BigDecimal("113.2675194740");
        BigDecimal lat=new BigDecimal("23.1295665362");

        List<parking> parkingList=parkingdao.queryBycondition(longs,lat);
        System.out.println(parkingList);
    }
}