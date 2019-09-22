package com.hht.wms.core.dto;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:52
 * @Copyright © 2019-2020 ****有限公司
 */
public class ShippedFeeExportReqDto {

    private String beginDate;

    private String endDate;

    private String shptNo;

    private String clp;

    private String car;

    private String route;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
}
