/**
 * Copyright (C), 2018-2019, 深圳惠金卓信科技有限公司
 * FileName: StockGoods
 * Author:   MG01873
 * Date:     2019/9/24 17:31
 * Description: 入仓货物表
 * History:
 */
package com.hht.wms.core.dto.vo;

import java.math.BigDecimal;

/**
 * 〈入仓货物表〉
 *
 * @author MG01873
 * @create 2019/9/24
 * @since 1.0.0
 */
public class StockGoods {

    /**
     * 收货日期
     * */
    private String rcvdDate;

    /**
     * 入仓编号
     * */
    private String inboundNo;

    /**
     * 入仓落货纸号
     * */
    private String so;

    /**
     * 客户采购订单号
     * */
    private String po;

    /**
     * 货物款号
     * */
    private String sku;

    /**
     * 总库存件数
     * */
    private BigDecimal stockPcs;

    /**
     * 总库存体积
     * */
    private BigDecimal stockVolume;

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