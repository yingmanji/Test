package com.front.dao;

import com.front.entity.user;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface userDao {
    //查询全部
    List<user> queryAll();
    //通过userId查询某user
    List<user> queryByuserId(@Param("user_id") int user_id);
    //新增用户
    int insertUser(@Param("wxopen_id") String wxopen_id,
                   @Param("wx_name") String wx_name,
                   @Param("user_name") String user_name,
                   @Param("sex") String sex,
                   @Param("phone_num") String phone_num,
                   @Param("plate_num") String plate_num,
                   @Param("lastlogin_time") String lastlogin_time);
    //通过userId更新最后一次登录时间
    int update(@Param("lastlogin_time") String lastlogin_time,@Param("user_id") int user_id);
}