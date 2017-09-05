package com.front.entity;

import java.math.BigDecimal;

public class parking {
    private long parkingId;
    private String parkingName;
    private String parkingLocation;
    private BigDecimal  longitude;
    private BigDecimal latitude;
    private String remaker;

    public long getParkingId() {
        return parkingId;
    }

    public void setParkingId(long parkingId) {
        this.parkingId = parkingId;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getRemaker() {
        return remaker;
    }

    public void setRemaker(String remaker) {
        this.remaker = remaker;
    }

    @Override
    public String toString() {
        return "parking{" +
                "parkingId=" + parkingId +
                ", parkingName='" + parkingName + '\'' +
                ", parkingLocation='" + parkingLocation + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", remaker='" + remaker + '\'' +
                '}';
    }
}