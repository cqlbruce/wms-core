package com.hht.wms.core.dto;

import java.math.BigDecimal;

public class StockInfoModifyReqDto {
	

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
     * 商品名称
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

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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

	public String getInboundNo() {
		return inboundNo;
	}

	public void setInboundNo(String inboundNo) {
		this.inboundNo = inboundNo;
	}

	public String getCustomsMeterialNo() {
		return customsMeterialNo;
	}

	public void setCustomsMeterialNo(String customsMeterialNo) {
		this.customsMeterialNo = customsMeterialNo;
	}

	public String getRcvdDate() {
		return rcvdDate;
	}

	public void setRcvdDate(String rcvdDate) {
		this.rcvdDate = rcvdDate;
	}

	public Integer getRcvdCtns() {
		return rcvdCtns;
	}

	public void setRcvdCtns(Integer rcvdCtns) {
		this.rcvdCtns = rcvdCtns;
	}

	public Integer getRcvdPcs() {
		return rcvdPcs;
	}

	public void setRcvdPcs(Integer rcvdPcs) {
		this.rcvdPcs = rcvdPcs;
	}

	public Integer getItemsPerBox() {
		return itemsPerBox;
	}

	public void setItemsPerBox(Integer itemsPerBox) {
		this.itemsPerBox = itemsPerBox;
	}

	public BigDecimal getGwPerBoxActul() {
		return gwPerBoxActul;
	}

	public void setGwPerBoxActul(BigDecimal gwPerBoxActul) {
		this.gwPerBoxActul = gwPerBoxActul;
	}

	public BigDecimal getGwAllActul() {
		return gwAllActul;
	}

	public void setGwAllActul(BigDecimal gwAllActul) {
		this.gwAllActul = gwAllActul;
	}

	public BigDecimal getBoxLengthActul() {
		return boxLengthActul;
	}

	public void setBoxLengthActul(BigDecimal boxLengthActul) {
		this.boxLengthActul = boxLengthActul;
	}

	public BigDecimal getBoxWidthActul() {
		return boxWidthActul;
	}

	public void setBoxWidthActul(BigDecimal boxWidthActul) {
		this.boxWidthActul = boxWidthActul;
	}

	public BigDecimal getBoxHighActul() {
		return boxHighActul;
	}

	public void setBoxHighActul(BigDecimal boxHighActul) {
		this.boxHighActul = boxHighActul;
	}

	public BigDecimal getBoxPerVolumeActul() {
		return boxPerVolumeActul;
	}

	public void setBoxPerVolumeActul(BigDecimal boxPerVolumeActul) {
		this.boxPerVolumeActul = boxPerVolumeActul;
	}

	public BigDecimal getBoxAllVolumeActul() {
		return boxAllVolumeActul;
	}

	public void setBoxAllVolumeActul(BigDecimal boxAllVolumeActul) {
		this.boxAllVolumeActul = boxAllVolumeActul;
	}

	public BigDecimal getCustsDeclaPieceWeigh() {
		return custsDeclaPieceWeigh;
	}

	public void setCustsDeclaPieceWeigh(BigDecimal custsDeclaPieceWeigh) {
		this.custsDeclaPieceWeigh = custsDeclaPieceWeigh;
	}

	public BigDecimal getCustsDeclaAllWeigh() {
		return custsDeclaAllWeigh;
	}

	public void setCustsDeclaAllWeigh(BigDecimal custsDeclaAllWeigh) {
		this.custsDeclaAllWeigh = custsDeclaAllWeigh;
	}

	public String getWarehousePosition() {
		return warehousePosition;
	}

	public void setWarehousePosition(String warehousePosition) {
		this.warehousePosition = warehousePosition;
	}

	public BigDecimal getShippedCtns() {
		return shippedCtns;
	}

	public void setShippedCtns(BigDecimal shippedCtns) {
		this.shippedCtns = shippedCtns;
	}

	public Integer getShippedPcs() {
		return shippedPcs;
	}

	public void setShippedPcs(Integer shippedPcs) {
		this.shippedPcs = shippedPcs;
	}

	public BigDecimal getShippedGw() {
		return shippedGw;
	}

	public void setShippedGw(BigDecimal shippedGw) {
		this.shippedGw = shippedGw;
	}

	public BigDecimal getShippedWeigh() {
		return shippedWeigh;
	}

	public void setShippedWeigh(BigDecimal shippedWeigh) {
		this.shippedWeigh = shippedWeigh;
	}

	public BigDecimal getShippedVolume() {
		return shippedVolume;
	}

	public void setShippedVolume(BigDecimal shippedVolume) {
		this.shippedVolume = shippedVolume;
	}

	public BigDecimal getStockCtns() {
		return stockCtns;
	}

	public void setStockCtns(BigDecimal stockCtns) {
		this.stockCtns = stockCtns;
	}

	public Integer getStockPcs() {
		return stockPcs;
	}

	public void setStockPcs(Integer stockPcs) {
		this.stockPcs = stockPcs;
	}

	public BigDecimal getStockGw() {
		return stockGw;
	}

	public void setStockGw(BigDecimal stockGw) {
		this.stockGw = stockGw;
	}

	public BigDecimal getStockVolume() {
		return stockVolume;
	}

	public void setStockVolume(BigDecimal stockVolume) {
		this.stockVolume = stockVolume;
	}

	public String getStockCheck() {
		return stockCheck;
	}

	public void setStockCheck(String stockCheck) {
		this.stockCheck = stockCheck;
	}

	public String getCustomsOrderNo() {
		return customsOrderNo;
	}

	public void setCustomsOrderNo(String customsOrderNo) {
		this.customsOrderNo = customsOrderNo;
	}

	public String getCustomsMerchNo() {
		return customsMerchNo;
	}

	public void setCustomsMerchNo(String customsMerchNo) {
		this.customsMerchNo = customsMerchNo;
	}

	public String getMerchName() {
		return merchName;
	}

	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}

	public Integer getDeclaCount() {
		return declaCount;
	}

	public void setDeclaCount(Integer declaCount) {
		this.declaCount = declaCount;
	}

	public String getDeclaUnit() {
		return declaUnit;
	}

	public void setDeclaUnit(String declaUnit) {
		this.declaUnit = declaUnit;
	}

	public BigDecimal getDeclaUnitPrice() {
		return declaUnitPrice;
	}

	public void setDeclaUnitPrice(BigDecimal declaUnitPrice) {
		this.declaUnitPrice = declaUnitPrice;
	}

	public BigDecimal getDeclaTotalPrice() {
		return declaTotalPrice;
	}

	public void setDeclaTotalPrice(BigDecimal declaTotalPrice) {
		this.declaTotalPrice = declaTotalPrice;
	}

	public String getDeclaCurrency() {
		return declaCurrency;
	}

	public void setDeclaCurrency(String declaCurrency) {
		this.declaCurrency = declaCurrency;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public String getDestCountry() {
		return destCountry;
	}

	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}

	public String getSupervisionConditions() {
		return supervisionConditions;
	}

	public void setSupervisionConditions(String supervisionConditions) {
		this.supervisionConditions = supervisionConditions;
	}
    
    
    

}
