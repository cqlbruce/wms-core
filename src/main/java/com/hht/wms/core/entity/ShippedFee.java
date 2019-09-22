package com.hht.wms.core.entity;

import java.math.BigDecimal;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.entity
 * @date 2019/9/22 3:43
 * @Copyright © 2019-2020 ****有限公司
 */
public class ShippedFee {
    /**
     * 出仓日期
     * */
    private String shippedDate;

    /**
     * shptNo
     * */
    private String shptNo;

    /**
     * 出仓单号
     * */
    private String clp;

    /**
     * 车牌/柜号
     * */
    private String car;

    /**
     * 运输路线
     * */
    private String route;

    /**
     * 柜型
     * */
    private String cabinetType;

    /**
     * 总出仓箱数
     * */
    private BigDecimal shippedCtns;

    /**
     * 总出仓体积
     * */
    private BigDecimal shippedVolume;

    public String getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShptNo() {
        return shptNo;
    }

    public void setShptNo(String shptNo) {
        this.shptNo = shptNo;
    }

    public String getClp() {
        return clp;
    }

    public void setClp(String clp) {
        this.clp = clp;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getCabinetType() {
        return cabinetType;
    }

    public void setCabinetType(String cabinetType) {
        this.cabinetType = cabinetType;
    }

    public BigDecimal getShippedCtns() {
        return shippedCtns;
    }

    public void setShippedCtns(BigDecimal shippedCtns) {
        this.shippedCtns = shippedCtns;
    }

    public BigDecimal getShippedVolume() {
        return shippedVolume;
    }

    public void setShippedVolume(BigDecimal shippedVolume) {
        this.shippedVolume = shippedVolume;
    }
}
