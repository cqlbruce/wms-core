package com.hht.wms.core.dto;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:00
 * @Copyright © 2019-2020 ****有限公司
 */
public class StockFeeQueryReqDto {
    private String beginDate;

    private String endDate;

    private String so ;

    private int page ;

    private int limit ;

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

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
