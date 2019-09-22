package com.hht.wms.core.entity;

import java.math.BigDecimal;

/**
 * 进仓费用
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.entity
 * @date 2019/9/22 2:50
 * @Copyright © 2019-2020 ****有限公司
 */
public class StockFee {
    /**
     * 进仓日期
     * */
    private String stockDate;

    /**
     * 入仓落货纸号
     */
    private String so;

    /**
     * 车牌号
     * */
    private String car;

    /**
     * 总库存箱数
     */
    private BigDecimal stockCtns;

    /**
     * 总库存体积
     */
    private BigDecimal stockVolume;

    public String getStockDate() {
        return stockDate;
    }

    public void setStockDate(String stockDate) {
        this.stockDate = stockDate;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public BigDecimal getStockCtns() {
        return stockCtns;
    }

    public void setStockCtns(BigDecimal stockCtns) {
        this.stockCtns = stockCtns;
    }

    public BigDecimal getStockVolume() {
        return stockVolume;
    }

    public void setStockVolume(BigDecimal stockVolume) {
        this.stockVolume = stockVolume;
    }
}
