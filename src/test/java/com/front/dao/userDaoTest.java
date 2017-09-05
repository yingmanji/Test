package com.front.dao;

import com.front.entity.user;
import javafx.scene.input.DataFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@ContextConfiguration({"classpath:spring/spring-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class userDaoTest {

    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private userDao userdao;
    @Test
    public void queryAll(){
        List<user> userList=userdao.queryAll();
        logger.info(userList.toString());
    }
    @Test
    public void queryByuserId(){
        List<user> userList=userdao.queryByuserId(1);
        logger.info(userList.toString());
    }
    @Test
    public void insertUser(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=simpleDateFormat.format(new Date().getTime());
        System.out.println(time);
        int insert=userdao.insertUser("8888","qqqq","格","男","1345555","粤A-M",time);
    }
    @Test
    public void updateTime(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=simpleDateFormat.format(new Date().getTime());
        int update=userdao.update(time,2);
    }
}