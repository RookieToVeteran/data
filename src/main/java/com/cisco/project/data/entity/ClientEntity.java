package com.cisco.project.data.entity;

import java.math.BigDecimal;

/**
 * @description
 * @Author 狂风飞我
 * @Date 2020/8/15 18:12
 */

public class ClientEntity {

    private Long id;

    private String mac;

    private String seenString;

    private Long seenEpoch;

    private BigDecimal lat;

    private BigDecimal lng;

    private Double unc;

    private String manufacturer;

    private String os;

    private String ssid;

    private String floors;

    private String eventType;

    private String tags;

    private String ap;

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getSeenString() {
        return seenString;
    }

    public void setSeenString(String seenString) {
        this.seenString = seenString;
    }

    public Long getSeenEpoch() {
        return seenEpoch;
    }

    public void setSeenEpoch(Long seenEpoch) {
        this.seenEpoch = seenEpoch;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public Double getUnc() {
        return unc;
    }

    public void setUnc(Double unc) {
        this.unc = unc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
