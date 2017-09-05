package com.front.entity;

import java.math.BigDecimal;
import java.util.Date;

public class order {
    private long orderId;
    private int userId;
    private long parkingLotId;
    private Date parkingBegin;
    private Date parkingEnd;
    private int parkingTotalTime;
    private BigDecimal price;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Date getParkingBegin() {
        return parkingBegin;
    }

    public void setParkingBegin(Date parkingBegin) {
        this.parkingBegin = parkingBegin;
    }

    public Date getParkingEnd() {
        return parkingEnd;
    }

    public void setParkingEnd(Date parkingEnd) {
        this.parkingEnd = parkingEnd;
    }

    public int getParkingTotalTime() {
        return parkingTotalTime;
    }

    public void setParkingTotalTime(int parkingTotalTime) {
        this.parkingTotalTime = parkingTotalTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", parkingLotId=" + parkingLotId +
                ", parkingBegin=" + parkingBegin +
                ", parkingEnd=" + parkingEnd +
                ", parkingTotalTime=" + parkingTotalTime +
                ", price=" + price +
                '}';
    }
}