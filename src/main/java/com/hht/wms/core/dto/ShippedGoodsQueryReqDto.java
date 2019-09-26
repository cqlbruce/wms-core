/**
 * Copyright (C), 2018-2019, 深圳惠金卓信科技有限公司
 * FileName: ShippedGoodsQueryReqDto
 * Author:   MG01873
 * Date:     2019/9/24 18:43
 * Description:
 * History:
 */
package com.hht.wms.core.dto;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author MG01873
 * @create 2019/9/24
 * @since 1.0.0
 */
public class ShippedGoodsQueryReqDto {

    private int page;

    private int limit;

    private String beginDate;

    private String endDate;

    private String so;

    private String po;

    /**
     * 账单起算日
     * */
    private String billsBeginDate;

    /**
     * 账单截止日
     * */
    private String billsEndDate;

    /**
     * 超仓租单价
     * */
    private BigDecimal overStockUnitPrice;

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

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getBillsBeginDate() {
        return billsBeginDate;
    }

    public void setBillsBeginDate(String billsBeginDate) {
        this.billsBeginDate = billsBeginDate;
    }

    public String getBillsEndDate() {
        return billsEndDate;
    }

    public void setBillsEndDate(String billsEndDate) {
        this.billsEndDate = billsEndDate;
    }

    public BigDecimal getOverStockUnitPrice() {
        return overStockUnitPrice;
    }

    public void setOverStockUnitPrice(BigDecimal overStockUnitPrice) {
        this.overStockUnitPrice = overStockUnitPrice;
    }
}