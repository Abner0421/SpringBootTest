package com.example.demo1.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Market {
    private Integer id;

    private String marketName;

    private Integer status;

    private BigDecimal marketCoordinateX;

    private BigDecimal marketCoordinateY;

    private Integer marketScope;

    private String addressDetail;

    private Date createDate;

    private Date modifyDate;

    private Integer adminId;

    private String adminName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName == null ? null : marketName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getMarketCoordinateX() {
        return marketCoordinateX;
    }

    public void setMarketCoordinateX(BigDecimal marketCoordinateX) {
        this.marketCoordinateX = marketCoordinateX;
    }

    public BigDecimal getMarketCoordinateY() {
        return marketCoordinateY;
    }

    public void setMarketCoordinateY(BigDecimal marketCoordinateY) {
        this.marketCoordinateY = marketCoordinateY;
    }

    public Integer getMarketScope() {
        return marketScope;
    }

    public void setMarketScope(Integer marketScope) {
        this.marketScope = marketScope;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }
}