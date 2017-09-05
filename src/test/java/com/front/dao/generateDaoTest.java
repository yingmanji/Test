package com.front.dao;

import com.front.entity.generate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class generateDaoTest {
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private generateDao generatedao;
    @Test
    public void generateList(){
        List<generate> generateList=generatedao.queryAll();
        logger.info(generateList.toString());
    }
    @Test
    public void insertGenerate(){
        BigDecimal price=new BigDecimal("20");
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=simpleDateFormat.format(date);
        int insert=generatedao.insertGenerate(2,time,time,price);
    }
    @Test
    public void deleteGenerate(){
        int delete=generatedao.deleteGenerate(6);
    }
}