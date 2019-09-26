/**
 * Copyright (C), 2018-2019, 深圳惠金卓信科技有限公司
 * FileName: ShippedGoods
 * Author:   MG01873
 * Date:     2019/9/24 18:38
 * Description:
 * History:
 */
package com.hht.wms.core.entity;

import java.math.BigDecimal;

/**
 * 〈出仓货物〉<br>
 *
 * @author MG01873
 * @create 2019/9/24
 * @since 1.0.0
 */
public class ShippedGoods {

    private String rcvdDate;

    private String inboundNo;

    private String so;

    private String po;

    private String sku;

    private BigDecimal stockPcs;

    private BigDecimal stockVolume;

    private String shippedNo;

    private String shippedOrderDate;

    /**
     * 超仓期起算时间
     * */
    private String overStockDate;

    /**
     * 超仓租天数
     * */
    private Integer overStockDays;

    /**
     * 超仓租总费用
     * */
    private BigDecimal overStockFee;

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

    public String getRcvdDate() {
        return rcvdDate;
    }

    public void setRcvdDate(String rcvdDate) {
        this.rcvdDate = rcvdDate;
    }

    public String getInboundNo() {
        return inboundNo;
    }

    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getStockPcs() {
        return stockPcs;
    }

    public void setStockPcs(BigDecimal stockPcs) {
        this.stockPcs = stockPcs;
    }

    public BigDecimal getStockVolume() {
        return stockVolume;
    }

    public void setStockVolume(BigDecimal stockVolume) {
        this.stockVolume = stockVolume;
    }

    public String getShippedNo() {
        return shippedNo;
    }

    public void setShippedNo(String shippedNo) {
        this.shippedNo = shippedNo;
    }

    public String getShippedOrderDate() {
        return shippedOrderDate;
    }

    public void setShippedOrderDate(String shippedOrderDate) {
        this.shippedOrderDate = shippedOrderDate;
    }

    public String getOverStockDate() {
        return overStockDate;
    }

    public void setOverStockDate(String overStockDate) {
        this.overStockDate = overStockDate;
    }

    public Integer getOverStockDays() {
        return overStockDays;
    }

    public void setOverStockDays(Integer overStockDays) {
        this.overStockDays = overStockDays;
    }

    public BigDecimal getOverStockFee() {
        return overStockFee;
    }

    public void setOverStockFee(BigDecimal overStockFee) {
        this.overStockFee = overStockFee;
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