package com.front.entity;

public class parkinglot {
    private long parkinglotId;
    private long parkingId;
    private String parkLocation;
    private int userId;

    public long getParkinglotId() {
        return parkinglotId;
    }

    public void setParkinglotId(long parkinglotId) {
        this.parkinglotId = parkinglotId;
    }

    public long getParkingId() {
        return parkingId;
    }

    public void setParkingId(long parkingId) {
        this.parkingId = parkingId;
    }

    public String getParkLocation() {
        return parkLocation;
    }

    public void setParkLocation(String parkLocation) {
        this.parkLocation = parkLocation;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "parkinglot{" +
                "parkinglotId=" + parkinglotId +
                ", parkingId=" + parkingId +
                ", parkLocation='" + parkLocation + '\'' +
                ", userId=" + userId +
                '}';
    }
}