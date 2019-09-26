package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * shipped_info
 *
 * @author chenqiliang
 *
 * @mbg.generated
 */
public class ShippedInfo {
    /**
     * 主键 id
     * 表字段 : shipped_info.id
     */
    private String id;

    /**
     * 入仓落货纸号
     * 表字段 : shipped_info.so
     */
    private String so;

    /**
     * 客户采购订单号
     * 表字段 : shipped_info.po
     */
    private String po;

    /**
     * 货物款号 asn-item
     * 表字段 : shipped_info.sku
     */
    private String sku;

    /**
     * 入仓编号
     * 表字段 : shipped_info.inbound_no
     */
    private String inboundNo;

    /**
     * 海关系统物料号
     * 表字段 : shipped_info.customs_meterial_no
     */
    private String customsMeterialNo;

    /**
     * 出仓订单日期
     * 表字段 : shipped_info.shipped_order_date
     */
    private String shippedOrderDate;

    /**
     * 实际离仓日期
     * 表字段 : shipped_info.shipped_date
     */
    private String shippedDate;

    /**
     * 出仓单号clp
     * 表字段 : shipped_info.shipped_no
     */
    private String shippedNo;

    /**
     * 仓库位置
     * 表字段 : shipped_info.warehouse_position
     */
    private String warehousePosition;

    /**
     * 总出仓箱数
     * 表字段 : shipped_info.shipped_ctns
     */
    private BigDecimal shippedCtns;

    /**
     * 总出仓件数
     * 表字段 : shipped_info.shipped_pcs
     */
    private Integer shippedPcs;

    /**
     * 出仓毛重
     * 表字段 : shipped_info.shipped_gw
     */
    private BigDecimal shippedGw;

    /**
     * 出仓体积
     * 表字段 : shipped_info.shipped_volume
     */
    private BigDecimal shippedVolume;

    /**
     * 海关商品编码
     * 表字段 : shipped_info.customs_merch_no
     */
    private String customsMerchNo;

    /**
     * 报关单号
     * 表字段 : shipped_info.merch_name
     */
    private String merchName;

    /**
     * 申报数量/成交数量
     * 表字段 : shipped_info.decla_count
     */
    private Integer declaCount;

    /**
     * 申报单位/成交单位
     * 表字段 : shipped_info.decla_unit
     */
    private String declaUnit;

    /**
     * 申报单位/成交单位
     * 表字段 : shipped_info.decla_unit_price
     */
    private BigDecimal declaUnitPrice;

    /**
     * 申报总价/成交总价
     * 表字段 : shipped_info.decla_total_price
     */
    private BigDecimal declaTotalPrice;

    /**
     * 成交币种/申报币种
     * 表字段 : shipped_info.decla_currency
     */
    private String declaCurrency;

    /**
     * 原产国
     * 表字段 : shipped_info.origin_country
     */
    private String originCountry;

    /**
     * 目的国
     * 表字段 : shipped_info.dest_country
     */
    private String destCountry;

    /**
     * 单件净重
     * 表字段 : shipped_info.piece_weigh
     */
    private BigDecimal pieceWeigh;

    /**
     * 出仓总净重
     * 表字段 : shipped_info.shipped_all_weigh
     */
    private BigDecimal shippedAllWeigh;

    /**
     * 海关监管条件
     * 表字段 : shipped_info.supervision_conditions
     */
    private String supervisionConditions;

    /**
     * 创建时间
     * 表字段 : shipped_info.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : shipped_info.update_time
     */
    private Date updateTime;

    /**
     * 获取 主键 id 字段:shipped_info.id
     *
     * @return shipped_info.id, 主键 id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 主键 id 字段:shipped_info.id
     *
     * @param id the value for shipped_info.id, 主键 id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 入仓落货纸号 字段:shipped_info.so
     *
     * @return shipped_info.so, 入仓落货纸号
     */
    public String getSo() {
        return so;
    }

    /**
     * 设置 入仓落货纸号 字段:shipped_info.so
     *
     * @param so the value for shipped_info.so, 入仓落货纸号
     */
    public void setSo(String so) {
        this.so = so;
    }

    /**
     * 获取 客户采购订单号 字段:shipped_info.po
     *
     * @return shipped_info.po, 客户采购订单号
     */
    public String getPo() {
        return po;
    }

    /**
     * 设置 客户采购订单号 字段:shipped_info.po
     *
     * @param po the value for shipped_info.po, 客户采购订单号
     */
    public void setPo(String po) {
        this.po = po;
    }

    /**
     * 获取 货物款号 asn-item 字段:shipped_info.sku
     *
     * @return shipped_info.sku, 货物款号 asn-item
     */
    public String getSku() {
        return sku;
    }

    /**
     * 设置 货物款号 asn-item 字段:shipped_info.sku
     *
     * @param sku the value for shipped_info.sku, 货物款号 asn-item
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 获取 入仓编号 字段:shipped_info.inbound_no
     *
     * @return shipped_info.inbound_no, 入仓编号
     */
    public String getInboundNo() {
        return inboundNo;
    }

    /**
     * 设置 入仓编号 字段:shipped_info.inbound_no
     *
     * @param inboundNo the value for shipped_info.inbound_no, 入仓编号
     */
    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    /**
     * 获取 海关系统物料号 字段:shipped_info.customs_meterial_no
     *
     * @return shipped_info.customs_meterial_no, 海关系统物料号
     */
    public String getCustomsMeterialNo() {
        return customsMeterialNo;
    }

    /**
     * 设置 海关系统物料号 字段:shipped_info.customs_meterial_no
     *
     * @param customsMeterialNo the value for shipped_info.customs_meterial_no, 海关系统物料号
     */
    public void setCustomsMeterialNo(String customsMeterialNo) {
        this.customsMeterialNo = customsMeterialNo;
    }

    /**
     * 获取 出仓订单日期 字段:shipped_info.shipped_order_date
     *
     * @return shipped_info.shipped_order_date, 出仓订单日期
     */
    public String getShippedOrderDate() {
        return shippedOrderDate;
    }

    /**
     * 设置 出仓订单日期 字段:shipped_info.shipped_order_date
     *
     * @param shippedOrderDate the value for shipped_info.shipped_order_date, 出仓订单日期
     */
    public void setShippedOrderDate(String shippedOrderDate) {
        this.shippedOrderDate = shippedOrderDate;
    }

    /**
     * 获取 实际离仓日期 字段:shipped_info.shipped_date
     *
     * @return shipped_info.shipped_date, 实际离仓日期
     */
    public String getShippedDate() {
        return shippedDate;
    }

    /**
     * 设置 实际离仓日期 字段:shipped_info.shipped_date
     *
     * @param shippedDate the value for shipped_info.shipped_date, 实际离仓日期
     */
    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    /**
     * 获取 出仓单号clp 字段:shipped_info.shipped_no
     *
     * @return shipped_info.shipped_no, 出仓单号clp
     */
    public String getShippedNo() {
        return shippedNo;
    }

    /**
     * 设置 出仓单号clp 字段:shipped_info.shipped_no
     *
     * @param shippedNo the value for shipped_info.shipped_no, 出仓单号clp
     */
    public void setShippedNo(String shippedNo) {
        this.shippedNo = shippedNo;
    }

    /**
     * 获取 仓库位置 字段:shipped_info.warehouse_position
     *
     * @return shipped_info.warehouse_position, 仓库位置
     */
    public String getWarehousePosition() {
        return warehousePosition;
    }

    /**
     * 设置 仓库位置 字段:shipped_info.warehouse_position
     *
     * @param warehousePosition the value for shipped_info.warehouse_position, 仓库位置
     */
    public void setWarehousePosition(String warehousePosition) {
        this.warehousePosition = warehousePosition;
    }

    /**
     * 获取 总出仓箱数 字段:shipped_info.shipped_ctns
     *
     * @return shipped_info.shipped_ctns, 总出仓箱数
     */
    public BigDecimal getShippedCtns() {
        return shippedCtns;
    }

    /**
     * 设置 总出仓箱数 字段:shipped_info.shipped_ctns
     *
     * @param shippedCtns the value for shipped_info.shipped_ctns, 总出仓箱数
     */
    public void setShippedCtns(BigDecimal shippedCtns) {
        this.shippedCtns = shippedCtns;
    }

    /**
     * 获取 总出仓件数 字段:shipped_info.shipped_pcs
     *
     * @return shipped_info.shipped_pcs, 总出仓件数
     */
    public Integer getShippedPcs() {
        return shippedPcs;
    }

    /**
     * 设置 总出仓件数 字段:shipped_info.shipped_pcs
     *
     * @param shippedPcs the value for shipped_info.shipped_pcs, 总出仓件数
     */
    public void setShippedPcs(Integer shippedPcs) {
        this.shippedPcs = shippedPcs;
    }

    /**
     * 获取 出仓毛重 字段:shipped_info.shipped_gw
     *
     * @return shipped_info.shipped_gw, 出仓毛重
     */
    public BigDecimal getShippedGw() {
        return shippedGw;
    }

    /**
     * 设置 出仓毛重 字段:shipped_info.shipped_gw
     *
     * @param shippedGw the value for shipped_info.shipped_gw, 出仓毛重
     */
    public void setShippedGw(BigDecimal shippedGw) {
        this.shippedGw = shippedGw;
    }

    /**
     * 获取 出仓体积 字段:shipped_info.shipped_volume
     *
     * @return shipped_info.shipped_volume, 出仓体积
     */
    public BigDecimal getShippedVolume() {
        return shippedVolume;
    }

    /**
     * 设置 出仓体积 字段:shipped_info.shipped_volume
     *
     * @param shippedVolume the value for shipped_info.shipped_volume, 出仓体积
     */
    public void setShippedVolume(BigDecimal shippedVolume) {
        this.shippedVolume = shippedVolume;
    }

    /**
     * 获取 海关商品编码 字段:shipped_info.customs_merch_no
     *
     * @return shipped_info.customs_merch_no, 海关商品编码
     */
    public String getCustomsMerchNo() {
        return customsMerchNo;
    }

    /**
     * 设置 海关商品编码 字段:shipped_info.customs_merch_no
     *
     * @param customsMerchNo the value for shipped_info.customs_merch_no, 海关商品编码
     */
    public void setCustomsMerchNo(String customsMerchNo) {
        this.customsMerchNo = customsMerchNo;
    }

    /**
     * 获取 报关单号 字段:shipped_info.merch_name
     *
     * @return shipped_info.merch_name, 报关单号
     */
    public String getMerchName() {
        return merchName;
    }

    /**
     * 设置 报关单号 字段:shipped_info.merch_name
     *
     * @param merchName the value for shipped_info.merch_name, 报关单号
     */
    public void setMerchName(String merchName) {
        this.merchName = merchName;
    }

    /**
     * 获取 申报数量/成交数量 字段:shipped_info.decla_count
     *
     * @return shipped_info.decla_count, 申报数量/成交数量
     */
    public Integer getDeclaCount() {
        return declaCount;
    }

    /**
     * 设置 申报数量/成交数量 字段:shipped_info.decla_count
     *
     * @param declaCount the value for shipped_info.decla_count, 申报数量/成交数量
     */
    public void setDeclaCount(Integer declaCount) {
        this.declaCount = declaCount;
    }

    /**
     * 获取 申报单位/成交单位 字段:shipped_info.decla_unit
     *
     * @return shipped_info.decla_unit, 申报单位/成交单位
     */
    public String getDeclaUnit() {
        return declaUnit;
    }

    /**
     * 设置 申报单位/成交单位 字段:shipped_info.decla_unit
     *
     * @param declaUnit the value for shipped_info.decla_unit, 申报单位/成交单位
     */
    public void setDeclaUnit(String declaUnit) {
        this.declaUnit = declaUnit;
    }

    /**
     * 获取 申报单位/成交单位 字段:shipped_info.decla_unit_price
     *
     * @return shipped_info.decla_unit_price, 申报单位/成交单位
     */
    public BigDecimal getDeclaUnitPrice() {
        return declaUnitPrice;
    }

    /**
     * 设置 申报单位/成交单位 字段:shipped_info.decla_unit_price
     *
     * @param declaUnitPrice the value for shipped_info.decla_unit_price, 申报单位/成交单位
     */
    public void setDeclaUnitPrice(BigDecimal declaUnitPrice) {
        this.declaUnitPrice = declaUnitPrice;
    }

    /**
     * 获取 申报总价/成交总价 字段:shipped_info.decla_total_price
     *
     * @return shipped_info.decla_total_price, 申报总价/成交总价
     */
    public BigDecimal getDeclaTotalPrice() {
        return declaTotalPrice;
    }

    /**
     * 设置 申报总价/成交总价 字段:shipped_info.decla_total_price
     *
     * @param declaTotalPrice the value for shipped_info.decla_total_price, 申报总价/成交总价
     */
    public void setDeclaTotalPrice(BigDecimal declaTotalPrice) {
        this.declaTotalPrice = declaTotalPrice;
    }

    /**
     * 获取 成交币种/申报币种 字段:shipped_info.decla_currency
     *
     * @return shipped_info.decla_currency, 成交币种/申报币种
     */
    public String getDeclaCurrency() {
        return declaCurrency;
    }

    /**
     * 设置 成交币种/申报币种 字段:shipped_info.decla_currency
     *
     * @param declaCurrency the value for shipped_info.decla_currency, 成交币种/申报币种
     */
    public void setDeclaCurrency(String declaCurrency) {
        this.declaCurrency = declaCurrency;
    }

    /**
     * 获取 原产国 字段:shipped_info.origin_country
     *
     * @return shipped_info.origin_country, 原产国
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * 设置 原产国 字段:shipped_info.origin_country
     *
     * @param originCountry the value for shipped_info.origin_country, 原产国
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * 获取 目的国 字段:shipped_info.dest_country
     *
     * @return shipped_info.dest_country, 目的国
     */
    public String getDestCountry() {
        return destCountry;
    }

    /**
     * 设置 目的国 字段:shipped_info.dest_country
     *
     * @param destCountry the value for shipped_info.dest_country, 目的国
     */
    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    /**
     * 获取 单件净重 字段:shipped_info.piece_weigh
     *
     * @return shipped_info.piece_weigh, 单件净重
     */
    public BigDecimal getPieceWeigh() {
        return pieceWeigh;
    }

    /**
     * 设置 单件净重 字段:shipped_info.piece_weigh
     *
     * @param pieceWeigh the value for shipped_info.piece_weigh, 单件净重
     */
    public void setPieceWeigh(BigDecimal pieceWeigh) {
        this.pieceWeigh = pieceWeigh;
    }

    /**
     * 获取 出仓总净重 字段:shipped_info.shipped_all_weigh
     *
     * @return shipped_info.shipped_all_weigh, 出仓总净重
     */
    public BigDecimal getShippedAllWeigh() {
        return shippedAllWeigh;
    }

    /**
     * 设置 出仓总净重 字段:shipped_info.shipped_all_weigh
     *
     * @param shippedAllWeigh the value for shipped_info.shipped_all_weigh, 出仓总净重
     */
    public void setShippedAllWeigh(BigDecimal shippedAllWeigh) {
        this.shippedAllWeigh = shippedAllWeigh;
    }

    /**
     * 获取 海关监管条件 字段:shipped_info.supervision_conditions
     *
     * @return shipped_info.supervision_conditions, 海关监管条件
     */
    public String getSupervisionConditions() {
        return supervisionConditions;
    }

    /**
     * 设置 海关监管条件 字段:shipped_info.supervision_conditions
     *
     * @param supervisionConditions the value for shipped_info.supervision_conditions, 海关监管条件
     */
    public void setSupervisionConditions(String supervisionConditions) {
        this.supervisionConditions = supervisionConditions;
    }

    /**
     * 获取 创建时间 字段:shipped_info.create_time
     *
     * @return shipped_info.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:shipped_info.create_time
     *
     * @param createTime the value for shipped_info.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:shipped_info.update_time
     *
     * @return shipped_info.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:shipped_info.update_time
     *
     * @param updateTime the value for shipped_info.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}