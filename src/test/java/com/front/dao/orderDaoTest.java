package com.front.dao;

import com.front.entity.order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class orderDaoTest {
    @Autowired
    private  orderDao orderdao;

    @Test
    public void queryAll(){
        List<order> orders=orderdao.queryAll();
        System.out.println(orders);
    }
    @Test
    public void insertOrder(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=simpleDateFormat.format(new Date().getTime());
        int insert =orderdao.insertOrder(3,323232,time,time,time,new BigDecimal("23"));
    }

}