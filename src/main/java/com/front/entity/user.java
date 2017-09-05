package com.front.entity;

import java.util.Date;
import java.util.List;

public class user {
    private int userId;
    private String wxopenId;
    private String wxName;
    private String userName;
    private String sex;
    private String phoneNum;
    private String plateNum;
    private Date registTime;
    private Date lastloginTime;
//    private List<parkinglot> parkinglotList;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getWxopenId() {
        return wxopenId;
    }

    public void setWxopenId(String wxopenId) {
        this.wxopenId = wxopenId;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }

    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", wxopenId='" + wxopenId + '\'' +
                ", wxName='" + wxName + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", plateNum='" + plateNum + '\'' +
                ", registTime=" + registTime +
                ", lastloginTime=" + lastloginTime +
                '}';
    }
}