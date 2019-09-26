package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * stock_info
 *
 * @author chenqiliang
 *
 * @mbg.generated
 */
public class StockInfo {
    /**
     * 主键 id
     * 表字段 : stock_info.id
     */
    private String id;

    /**
     * 供应商名称
     * 表字段 : stock_info.supplier_name
     */
    private String supplierName;

    /**
     * 入仓落货纸号
     * 表字段 : stock_info.so
     */
    private String so;

    /**
     * 客户采购订单号
     * 表字段 : stock_info.po
     */
    private String po;

    /**
     * 货物款号 asn-item
     * 表字段 : stock_info.sku
     */
    private String sku;

    /**
     * 入仓编号
     * 表字段 : stock_info.inbound_no
     */
    private String inboundNo;

    /**
     * 海关系统物料号
     * 表字段 : stock_info.customs_meterial_no
     */
    private String customsMeterialNo;

    /**
     * 收货日期
     * 表字段 : stock_info.rcvd_date
     */
    private String rcvdDate;

    /**
     * 实收箱数
     * 表字段 : stock_info.rcvd_ctns
     */
    private Integer rcvdCtns;

    /**
     * 实收件数
     * 表字段 : stock_info.rcvd_pcs
     */
    private Integer rcvdPcs;

    /**
     * 一箱几件
     * 表字段 : stock_info.items_per_box
     */
    private Integer itemsPerBox;

    /**
     * 单箱毛重
     * 表字段 : stock_info.gw_per_box_actul
     */
    private BigDecimal gwPerBoxActul;

    /**
     * 实收总毛重
     * 表字段 : stock_info.gw_all_actul
     */
    private BigDecimal gwAllActul;

    /**
     * 实测外箱长L
     * 表字段 : stock_info.box_length_actul
     */
    private BigDecimal boxLengthActul;

    /**
     * 实测外箱宽W
     * 表字段 : stock_info.box_width_actul
     */
    private BigDecimal boxWidthActul;

    /**
     * 实测外箱高H
     * 表字段 : stock_info.box_high_actul
     */
    private BigDecimal boxHighActul;

    /**
     * 实测单箱体积cbm/ctn
     * 表字段 : stock_info.box_per_volume_actul
     */
    private BigDecimal boxPerVolumeActul;

    /**
     * 实收总体积
     * 表字段 : stock_info.box_all_volume_actul
     */
    private BigDecimal boxAllVolumeActul;

    /**
     * 入仓报关单件净重N.W./pcs
     * 表字段 : stock_info.custs_decla_piece_weigh
     */
    private BigDecimal custsDeclaPieceWeigh;

    /**
     * 入仓报关总净重total N.W
     * 表字段 : stock_info.custs_decla_all_weigh
     */
    private BigDecimal custsDeclaAllWeigh;

    /**
     * 仓库位置
     * 表字段 : stock_info.warehouse_position
     */
    private String warehousePosition;

    /**
     * 总出仓箱数
     * 表字段 : stock_info.shipped_ctns
     */
    private BigDecimal shippedCtns;

    /**
     * 总出仓件数
     * 表字段 : stock_info.shipped_pcs
     */
    private Integer shippedPcs;

    /**
     * 总出仓毛重
     * 表字段 : stock_info.shipped_gw
     */
    private BigDecimal shippedGw;

    /**
     * 总出仓净重
     * 表字段 : stock_info.shipped_weigh
     */
    private BigDecimal shippedWeigh;

    /**
     * 总出仓体积
     * 表字段 : stock_info.shipped_volume
     */
    private BigDecimal shippedVolume;

    /**
     * 总库存箱数
     * 表字段 : stock_info.stock_ctns
     */
    private BigDecimal stockCtns;

    /**
     * 总库存件数
     * 表字段 : stock_info.stock_pcs
     */
    private Integer stockPcs;

    /**
     * 总库存毛重
     * 表字段 : stock_info.stock_gw
     */
    private BigDecimal stockGw;

    /**
     * 总库存净重
     * 表字段 : stock_info.stock_weigh
     */
    private BigDecimal stockWeigh;

    /**
     * 总库存体积
     * 表字段 : stock_info.stock_volume
     */
    private BigDecimal stockVolume;

    /**
     * 库存case pack 检验
     * 表字段 : stock_info.stock_check
     */
    private String stockCheck;

    /**
     * 报关单号
     * 表字段 : stock_info.customs_order_no
     */
    private String customsOrderNo;

    /**
     * 海关商品编码
     * 表字段 : stock_info.customs_merch_no
     */
    private String customsMerchNo;

    /**
     * 报关单号
     * 表字段 : stock_info.merch_name
     */
    private String merchName;

    /**
     * 申报数量/成交数量
     * 表字段 : stock_info.decla_count
     */
    private Integer declaCount;

    /**
     * 申报单位/成交单位
     * 表字段 : stock_info.decla_unit
     */
    private String declaUnit;

    /**
     * 申报单位/成交单位
     * 表字段 : stock_info.decla_unit_price
     */
    private BigDecimal declaUnitPrice;

    /**
     * 申报总价/成交总价
     * 表字段 : stock_info.decla_total_price
     */
    private BigDecimal declaTotalPrice;

    /**
     * 成交币种/申报币种
     * 表字段 : stock_info.decla_currency
     */
    private String declaCurrency;

    /**
     * 原产国
     * 表字段 : stock_info.origin_country
     */
    private String originCountry;

    /**
     * 目的国
     * 表字段 : stock_info.dest_country
     */
    private String destCountry;

    /**
     * 海关监管条件
     * 表字段 : stock_info.supervision_conditions
     */
    private String supervisionConditions;

    /**
     * 创建时间
     * 表字段 : stock_info.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : stock_info.update_time
     */
    private Date updateTime;

    /**
     * 获取 主键 id 字段:stock_info.id
     *
     * @return stock_info.id, 主键 id
     */
//    public String getId() {
//        return id;
//    }

    /**
     * 设置 主键 id 字段:stock_info.id
     *
     * @param id the value for stock_info.id, 主键 id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 供应商名称 字段:stock_info.supplier_name
     *
     * @return stock_info.supplier_name, 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置 供应商名称 字段:stock_info.supplier_name
     *
     * @param supplierName the value for stock_info.supplier_name, 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 获取 入仓落货纸号 字段:stock_info.so
     *
     * @return stock_info.so, 入仓落货纸号
     */
    public String getSo() {
        return so;
    }

    /**
     * 设置 入仓落货纸号 字段:stock_info.so
     *
     * @param so the value for stock_info.so, 入仓落货纸号
     */
    public void setSo(String so) {
        this.so = so;
    }

    /**
     * 获取 客户采购订单号 字段:stock_info.po
     *
     * @return stock_info.po, 客户采购订单号
     */
    public String getPo() {
        return po;
    }

    /**
     * 设置 客户采购订单号 字段:stock_info.po
     *
     * @param po the value for stock_info.po, 客户采购订单号
     */
    public void setPo(String po) {
        this.po = po;
    }

    /**
     * 获取 货物款号 asn-item 字段:stock_info.sku
     *
     * @return stock_info.sku, 货物款号 asn-item
     */
    public String getSku() {
        return sku;
    }

    /**
     * 设置 货物款号 asn-item 字段:stock_info.sku
     *
     * @param sku the value for stock_info.sku, 货物款号 asn-item
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 获取 入仓编号 字段:stock_info.inbound_no
     *
     * @return stock_info.inbound_no, 入仓编号
     */
    public String getInboundNo() {
        return inboundNo;
    }

    /**
     * 设置 入仓编号 字段:stock_info.inbound_no
     *
     * @param inboundNo the value for stock_info.inbound_no, 入仓编号
     */
    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    /**
     * 获取 海关系统物料号 字段:stock_info.customs_meterial_no
     *
     * @return stock_info.customs_meterial_no, 海关系统物料号
     */
    public String getCustomsMeterialNo() {
        return customsMeterialNo;
    }

    /**
     * 设置 海关系统物料号 字段:stock_info.customs_meterial_no
     *
     * @param customsMeterialNo the value for stock_info.customs_meterial_no, 海关系统物料号
     */
    public void setCustomsMeterialNo(String customsMeterialNo) {
        this.customsMeterialNo = customsMeterialNo;
    }

    /**
     * 获取 收货日期 字段:stock_info.rcvd_date
     *
     * @return stock_info.rcvd_date, 收货日期
     */
    public String getRcvdDate() {
        return rcvdDate;
    }

    /**
     * 设置 收货日期 字段:stock_info.rcvd_date
     *
     * @param rcvdDate the value for stock_info.rcvd_date, 收货日期
     */
    public void setRcvdDate(String rcvdDate) {
        this.rcvdDate = rcvdDate;
    }

    /**
     * 获取 实收箱数 字段:stock_info.rcvd_ctns
     *
     * @return stock_info.rcvd_ctns, 实收箱数
     */
    public Integer getRcvdCtns() {
        return rcvdCtns;
    }

    /**
     * 设置 实收箱数 字段:stock_info.rcvd_ctns
     *
     * @param rcvdCtns the value for stock_info.rcvd_ctns, 实收箱数
     */
    public void setRcvdCtns(Integer rcvdCtns) {
        this.rcvdCtns = rcvdCtns;
    }

    /**
     * 获取 实收件数 字段:stock_info.rcvd_pcs
     *
     * @return stock_info.rcvd_pcs, 实收件数
     */
    public Integer getRcvdPcs() {
        return rcvdPcs;
    }

    /**
     * 设置 实收件数 字段:stock_info.rcvd_pcs
     *
     * @param rcvdPcs the value for stock_info.rcvd_pcs, 实收件数
     */
    public void setRcvdPcs(Integer rcvdPcs) {
        this.rcvdPcs = rcvdPcs;
    }

    /**
     * 获取 一箱几件 字段:stock_info.items_per_box
     *
     * @return stock_info.items_per_box, 一箱几件
     */
    public Integer getItemsPerBox() {
        return itemsPerBox;
    }

    /**
     * 设置 一箱几件 字段:stock_info.items_per_box
     *
     * @param itemsPerBox the value for stock_info.items_per_box, 一箱几件
     */
    public void setItemsPerBox(Integer itemsPerBox) {
        this.itemsPerBox = itemsPerBox;
    }

    /**
     * 获取 单箱毛重 字段:stock_info.gw_per_box_actul
     *
     * @return stock_info.gw_per_box_actul, 单箱毛重
     */
    public BigDecimal getGwPerBoxActul() {
        return gwPerBoxActul;
    }

    /**
     * 设置 单箱毛重 字段:stock_info.gw_per_box_actul
     *
     * @param gwPerBoxActul the value for stock_info.gw_per_box_actul, 单箱毛重
     */
    public void setGwPerBoxActul(BigDecimal gwPerBoxActul) {
        this.gwPerBoxActul = gwPerBoxActul;
    }

    /**
     * 获取 实收总毛重 字段:stock_info.gw_all_actul
     *
     * @return stock_info.gw_all_actul, 实收总毛重
     */
    public BigDecimal getGwAllActul() {
        return gwAllActul;
    }

    /**
     * 设置 实收总毛重 字段:stock_info.gw_all_actul
     *
     * @param gwAllActul the value for stock_info.gw_all_actul, 实收总毛重
     */
    public void setGwAllActul(BigDecimal gwAllActul) {
        this.gwAllActul = gwAllActul;
    }

    /**
     * 获取 实测外箱长L 字段:stock_info.box_length_actul
     *
     * @return stock_info.box_length_actul, 实测外箱长L
     */
    public BigDecimal getBoxLengthActul() {
        return boxLengthActul;
    }

    /**
     * 设置 实测外箱长L 字段:stock_info.box_length_actul
     *
     * @param boxLengthActul the value for stock_info.box_length_actul, 实测外箱长L
     */
    public void setBoxLengthActul(BigDecimal boxLengthActul) {
        this.boxLengthActul = boxLengthActul;
    }

    /**
     * 获取 实测外箱宽W 字段:stock_info.box_width_actul
     *
     * @return stock_info.box_width_actul, 实测外箱宽W
     */
    public BigDecimal getBoxWidthActul() {
        return boxWidthActul;
    }

    /**
     * 设置 实测外箱宽W 字段:stock_info.box_width_actul
     *
     * @param boxWidthActul the value for stock_info.box_width_actul, 实测外箱宽W
     */
    public void setBoxWidthActul(BigDecimal boxWidthActul) {
        this.boxWidthActul = boxWidthActul;
    }

    /**
     * 获取 实测外箱高H 字段:stock_info.box_high_actul
     *
     * @return stock_info.box_high_actul, 实测外箱高H
     */
    public BigDecimal getBoxHighActul() {
        return boxHighActul;
    }

    /**
     * 设置 实测外箱高H 字段:stock_info.box_high_actul
     *
     * @param boxHighActul the value for stock_info.box_high_actul, 实测外箱高H
     */
    public void setBoxHighActul(BigDecimal boxHighActul) {
        this.boxHighActul = boxHighActul;
    }

    /**
     * 获取 实测单箱体积cbm/ctn 字段:stock_info.box_per_volume_actul
     *
     * @return stock_info.box_per_volume_actul, 实测单箱体积cbm/ctn
     */
    public BigDecimal getBoxPerVolumeActul() {
        return boxPerVolumeActul;
    }

    /**
     * 设置 实测单箱体积cbm/ctn 字段:stock_info.box_per_volume_actul
     *
     * @param boxPerVolumeActul the value for stock_info.box_per_volume_actul, 实测单箱体积cbm/ctn
     */
    public void setBoxPerVolumeActul(BigDecimal boxPerVolumeActul) {
        this.boxPerVolumeActul = boxPerVolumeActul;
    }

    /**
     * 获取 实收总体积 字段:stock_info.box_all_volume_actul
     *
     * @return stock_info.box_all_volume_actul, 实收总体积
     */
    public BigDecimal getBoxAllVolumeActul() {
        return boxAllVolumeActul;
    }

    /**
     * 设置 实收总体积 字段:stock_info.box_all_volume_actul
     *
     * @param boxAllVolumeActul the value for stock_info.box_all_volume_actul, 实收总体积
     */
    public void setBoxAllVolumeActul(BigDecimal boxAllVolumeActul) {
        this.boxAllVolumeActul = boxAllVolumeActul;
    }

    /**
     * 获取 入仓报关单件净重N.W./pcs 字段:stock_info.custs_decla_piece_weigh
     *
     * @return stock_info.custs_decla_piece_weigh, 入仓报关单件净重N.W./pcs
     */
    public BigDecimal getCustsDeclaPieceWeigh() {
        return custsDeclaPieceWeigh;
    }

    /**
     * 设置 入仓报关单件净重N.W./pcs 字段:stock_info.custs_decla_piece_weigh
     *
     * @param custsDeclaPieceWeigh the value for stock_info.custs_decla_piece_weigh, 入仓报关单件净重N.W./pcs
     */
    public void setCustsDeclaPieceWeigh(BigDecimal custsDeclaPieceWeigh) {
        this.custsDeclaPieceWeigh = custsDeclaPieceWeigh;
    }

    /**
     * 获取 入仓报关总净重total N.W 字段:stock_info.custs_decla_all_weigh
     *
     * @return stock_info.custs_decla_all_weigh, 入仓报关总净重total N.W
     */
    public BigDecimal getCustsDeclaAllWeigh() {
        return custsDeclaAllWeigh;
    }

    /**
     * 设置 入仓报关总净重total N.W 字段:stock_info.custs_decla_all_weigh
     *
     * @param custsDeclaAllWeigh the value for stock_info.custs_decla_all_weigh, 入仓报关总净重total N.W
     */
    public void setCustsDeclaAllWeigh(BigDecimal custsDeclaAllWeigh) {
        this.custsDeclaAllWeigh = custsDeclaAllWeigh;
    }

    /**
     * 获取 仓库位置 字段:stock_info.warehouse_position
     *
     * @return stock_info.warehouse_position, 仓库位置
     */
    public String getWarehousePosition() {
        return warehousePosition;
    }

    /**
     * 设置 仓库位置 字段:stock_info.warehouse_position
     *
     * @param warehousePosition the value for stock_info.warehouse_position, 仓库位置
     */
    public void setWarehousePosition(String warehousePosition) {
        this.warehousePosition = warehousePosition;
    }

    /**
     * 获取 总出仓箱数 字段:stock_info.shipped_ctns
     *
     * @return stock_info.shipped_ctns, 总出仓箱数
     */
    public BigDecimal getShippedCtns() {
        return shippedCtns;
    }

    /**
     * 设置 总出仓箱数 字段:stock_info.shipped_ctns
     *
     * @param shippedCtns the value for stock_info.shipped_ctns, 总出仓箱数
     */
    public void setShippedCtns(BigDecimal shippedCtns) {
        this.shippedCtns = shippedCtns;
    }

    /**
     * 获取 总出仓件数 字段:stock_info.shipped_pcs
     *
     * @return stock_info.shipped_pcs, 总出仓件数
     */
    public Integer getShippedPcs() {
        return shippedPcs;
    }

    /**
     * 设置 总出仓件数 字段:stock_info.shipped_pcs
     *
     * @param shippedPcs the value for stock_info.shipped_pcs, 总出仓件数
     */
    public void setShippedPcs(Integer shippedPcs) {
        this.shippedPcs = shippedPcs;
    }

    /**
     * 获取 总出仓毛重 字段:stock_info.shipped_gw
     *
     * @return stock_info.shipped_gw, 总出仓毛重
     */
    public BigDecimal getShippedGw() {
        return shippedGw;
    }

    /**
     * 设置 总出仓毛重 字段:stock_info.shipped_gw
     *
     * @param shippedGw the value for stock_info.shipped_gw, 总出仓毛重
     */
    public void setShippedGw(BigDecimal shippedGw) {
        this.shippedGw = shippedGw;
    }

    /**
     * 获取 总出仓净重 字段:stock_info.shipped_weigh
     *
     * @return stock_info.shipped_weigh, 总出仓净重
     */
    public BigDecimal getShippedWeigh() {
        return shippedWeigh;
    }

    /**
     * 设置 总出仓净重 字段:stock_info.shipped_weigh
     *
     * @param shippedWeigh the value for stock_info.shipped_weigh, 总出仓净重
     */
    public void setShippedWeigh(BigDecimal shippedWeigh) {
        this.shippedWeigh = shippedWeigh;
    }

    /**
     * 获取 总出仓体积 字段:stock_info.shipped_volume
     *
     * @return stock_info.shipped_volume, 总出仓体积
     */
    public BigDecimal getShippedVolume() {
        return shippedVolume;
    }

    /**
     * 设置 总出仓体积 字段:stock_info.shipped_volume
     *
     * @param shippedVolume the value for stock_info.shipped_volume, 总出仓体积
     */
    public void setShippedVolume(BigDecimal shippedVolume) {
        this.shippedVolume = shippedVolume;
    }

    /**
     * 获取 总库存箱数 字段:stock_info.stock_ctns
     *
     * @return stock_info.stock_ctns, 总库存箱数
     */
    public BigDecimal getStockCtns() {
        return stockCtns;
    }

    /**
     * 设置 总库存箱数 字段:stock_info.stock_ctns
     *
     * @param stockCtns the value for stock_info.stock_ctns, 总库存箱数
     */
    public void setStockCtns(BigDecimal stockCtns) {
        this.stockCtns = stockCtns;
    }

    /**
     * 获取 总库存件数 字段:stock_info.stock_pcs
     *
     * @return stock_info.stock_pcs, 总库存件数
     */
    public Integer getStockPcs() {
        return stockPcs;
    }

    /**
     * 设置 总库存件数 字段:stock_info.stock_pcs
     *
     * @param stockPcs the value for stock_info.stock_pcs, 总库存件数
     */
    public void setStockPcs(Integer stockPcs) {
        this.stockPcs = stockPcs;
    }

    /**
     * 获取 总库存毛重 字段:stock_info.stock_gw
     *
     * @return stock_info.stock_gw, 总库存毛重
     */
    public BigDecimal getStockGw() {
        return stockGw;
    }

    /**
     * 设置 总库存毛重 字段:stock_info.stock_gw
     *
     * @param stockGw the value for stock_info.stock_gw, 总库存毛重
     */
    public void setStockGw(BigDecimal stockGw) {
        this.stockGw = stockGw;
    }

    /**
     * 获取 总库存净重 字段:stock_info.stock_weigh
     *
     * @return stock_info.stock_weigh, 总库存净重
     */
    public BigDecimal getStockWeigh() {
        return stockWeigh;
    }

    /**
     * 设置 总库存净重 字段:stock_info.stock_weigh
     *
     * @param stockWeigh the value for stock_info.stock_weigh, 总库存净重
     */
    public void setStockWeigh(BigDecimal stockWeigh) {
        this.stockWeigh = stockWeigh;
    }

    /**
     * 获取 总库存体积 字段:stock_info.stock_volume
     *
     * @return stock_info.stock_volume, 总库存体积
     */
    public BigDecimal getStockVolume() {
        return stockVolume;
    }

    /**
     * 设置 总库存体积 字段:stock_info.stock_volume
     *
     * @param stockVolume the value for stock_info.stock_volume, 总库存体积
     */
    public void setStockVolume(BigDecimal stockVolume) {
        this.stockVolume = stockVolume;
    }

    /**
     * 获取 库存case pack 检验 字段:stock_info.stock_check
     *
     * @return stock_info.stock_check, 库存case pack 检验
     */
    public String getStockCheck() {
        return stockCheck;
    }

    /**
     * 设置 库存case pack 检验 字段:stock_info.stock_check
     *
     * @param stockCheck the value for stock_info.stock_check, 库存case pack 检验
     */
    public void setStockCheck(String stockCheck) {
        this.stockCheck = stockCheck;
    }

    /**
     * 获取 报关单号 字段:stock_info.customs_order_no
     *
     * @return stock_info.customs_order_no, 报关单号
     */
    public String getCustomsOrderNo() {
        return customsOrderNo;
    }

    /**
     * 设置 报关单号 字段:stock_info.customs_order_no
     *
     * @param customsOrderNo the value for stock_info.customs_order_no, 报关单号
     */
    public void setCustomsOrderNo(String customsOrderNo) {
        this.customsOrderNo = customsOrderNo;
    }

    /**
     * 获取 海关商品编码 字段:stock_info.customs_merch_no
     *
     * @return stock_info.customs_merch_no, 海关商品编码
     */
    public String getCustomsMerchNo() {
        return customsMerchNo;
    }

    /**
     * 设置 海关商品编码 字段:stock_info.customs_merch_no
     *
     * @param customsMerchNo the value for stock_info.customs_merch_no, 海关商品编码
     */
    public void setCustomsMerchNo(String customsMerchNo) {
        this.customsMerchNo = customsMerchNo;
    }

    /**
     * 获取 报关单号 字段:stock_info.merch_name
     *
     * @return stock_info.merch_name, 报关单号
     */
    public String getMerchName() {
        return merchName;
    }

    /**
     * 设置 报关单号 字段:stock_info.merch_name
     *
     * @param merchName the value for stock_info.merch_name, 报关单号
     */
    public void setMerchName(String merchName) {
        this.merchName = merchName;
    }

    /**
     * 获取 申报数量/成交数量 字段:stock_info.decla_count
     *
     * @return stock_info.decla_count, 申报数量/成交数量
     */
    public Integer getDeclaCount() {
        return declaCount;
    }

    /**
     * 设置 申报数量/成交数量 字段:stock_info.decla_count
     *
     * @param declaCount the value for stock_info.decla_count, 申报数量/成交数量
     */
    public void setDeclaCount(Integer declaCount) {
        this.declaCount = declaCount;
    }

    /**
     * 获取 申报单位/成交单位 字段:stock_info.decla_unit
     *
     * @return stock_info.decla_unit, 申报单位/成交单位
     */
    public String getDeclaUnit() {
        return declaUnit;
    }

    /**
     * 设置 申报单位/成交单位 字段:stock_info.decla_unit
     *
     * @param declaUnit the value for stock_info.decla_unit, 申报单位/成交单位
     */
    public void setDeclaUnit(String declaUnit) {
        this.declaUnit = declaUnit;
    }

    /**
     * 获取 申报单位/成交单位 字段:stock_info.decla_unit_price
     *
     * @return stock_info.decla_unit_price, 申报单位/成交单位
     */
    public BigDecimal getDeclaUnitPrice() {
        return declaUnitPrice;
    }

    /**
     * 设置 申报单位/成交单位 字段:stock_info.decla_unit_price
     *
     * @param declaUnitPrice the value for stock_info.decla_unit_price, 申报单位/成交单位
     */
    public void setDeclaUnitPrice(BigDecimal declaUnitPrice) {
        this.declaUnitPrice = declaUnitPrice;
    }

    /**
     * 获取 申报总价/成交总价 字段:stock_info.decla_total_price
     *
     * @return stock_info.decla_total_price, 申报总价/成交总价
     */
    public BigDecimal getDeclaTotalPrice() {
        return declaTotalPrice;
    }

    /**
     * 设置 申报总价/成交总价 字段:stock_info.decla_total_price
     *
     * @param declaTotalPrice the value for stock_info.decla_total_price, 申报总价/成交总价
     */
    public void setDeclaTotalPrice(BigDecimal declaTotalPrice) {
        this.declaTotalPrice = declaTotalPrice;
    }

    /**
     * 获取 成交币种/申报币种 字段:stock_info.decla_currency
     *
     * @return stock_info.decla_currency, 成交币种/申报币种
     */
    public String getDeclaCurrency() {
        return declaCurrency;
    }

    /**
     * 设置 成交币种/申报币种 字段:stock_info.decla_currency
     *
     * @param declaCurrency the value for stock_info.decla_currency, 成交币种/申报币种
     */
    public void setDeclaCurrency(String declaCurrency) {
        this.declaCurrency = declaCurrency;
    }

    /**
     * 获取 原产国 字段:stock_info.origin_country
     *
     * @return stock_info.origin_country, 原产国
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * 设置 原产国 字段:stock_info.origin_country
     *
     * @param originCountry the value for stock_info.origin_country, 原产国
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * 获取 目的国 字段:stock_info.dest_country
     *
     * @return stock_info.dest_country, 目的国
     */
    public String getDestCountry() {
        return destCountry;
    }

    /**
     * 设置 目的国 字段:stock_info.dest_country
     *
     * @param destCountry the value for stock_info.dest_country, 目的国
     */
    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    /**
     * 获取 海关监管条件 字段:stock_info.supervision_conditions
     *
     * @return stock_info.supervision_conditions, 海关监管条件
     */
    public String getSupervisionConditions() {
        return supervisionConditions;
    }

    /**
     * 设置 海关监管条件 字段:stock_info.supervision_conditions
     *
     * @param supervisionConditions the value for stock_info.supervision_conditions, 海关监管条件
     */
    public void setSupervisionConditions(String supervisionConditions) {
        this.supervisionConditions = supervisionConditions;
    }

    /**
     * 获取 创建时间 字段:stock_info.create_time
     *
     * @return stock_info.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:stock_info.create_time
     *
     * @param createTime the value for stock_info.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:stock_info.update_time
     *
     * @return stock_info.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:stock_info.update_time
     *
     * @param updateTime the value for stock_info.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    
    public String getId() {
		return id;
	}

	public void appendId() {
    	this.id = new StringBuilder().append(this.so).append(this.po).append(this.sku).toString() ;  
    }
}