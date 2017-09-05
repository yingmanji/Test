package com.front.entity;

import java.math.BigDecimal;
import java.util.Date;

public class generate {
    private long generateId;
    private long parkingLotId;
    private Date shareBegin;
    private Date shareEnd;
    private BigDecimal price;

    public long getGenerateId() {
        return generateId;
    }

    public void setGenerateId(long generateId) {
        this.generateId = generateId;
    }

    public long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Date getShareBegin() {
        return shareBegin;
    }

    public void setShareBegin(Date shareBegin) {
        this.shareBegin = shareBegin;
    }

    public Date getShareEnd() {
        return shareEnd;
    }

    public void setShareEnd(Date shareEnd) {
        this.shareEnd = shareEnd;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "generate{" +
                "generateId=" + generateId +
                ", parkingLotId=" + parkingLotId +
                ", shareBegin=" + shareBegin +
                ", shareEnd=" + shareEnd +
                ", price=" + price +
                '}';
    }
}