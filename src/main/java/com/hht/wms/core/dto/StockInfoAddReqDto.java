package com.hht.wms.core.dto;

import java.math.BigDecimal;

public class StockInfoAddReqDto {
	
	private String po ; 
	
	private String sku ; 
	
	private String so ; 
	
	/**
	 * 海关系统物料号
	 */
	private String customsMeterialNo ; 
	
	/**
	 * 实收箱数
	 */
	private int rcvdCtns ; 
	
	/**
	 * 实收件数
	 */
	private int rcvdPcs ; 
	
	/**
	 * 单箱毛重
	 */
	private BigDecimal gwPerBoxActul ;
	
	/**
	 * 报关单件净重
	 */
	private BigDecimal custsDeclaPieceWeigh ;
	
	/**
	 * 实测外箱长
	 */
	private BigDecimal boxLengthActul ; 
	
	/**
	 * 实测外箱宽
	 */
	private BigDecimal boxWidthActul ; 
	
	/**
	 *  实测外箱高
	 */
	private BigDecimal boxHighActul ;
	
	/**
	 * 申报数量/成交数量
	 */
	private int declaCount ;
	
	/**
	 * 成交单位
	 */
	private String declaUnit ; 
	
	/**
	 * 申报单价
	 */
	private BigDecimal declaUnitPrice ; 
	
	/**
	 * 申报币种
	 */
	private String declaCurrency ;
	
	/**
	 * 商品编码
	 */
	private String customsMerchNo ; 
	
	/**
	 * 商品名称
	 */
	private String merchName ; 
	
	/**
	 * 原产国
	 */
	private String originCountry ;
	
	
	/**
	 * 目的国
	 */
	private String destCountry ;
	
	/**
	 * 仓位
	 */
	private String warehousePosition ; 
	
	/**
	 * 入仓编号
	 */
	private String inboundNo ; 
	
	/**
	 * 供应商名称
	 */
	private String supplierName ; 
	
	/**
	 * 备注
	 */
	private String remarks ;

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

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getCustomsMeterialNo() {
		return customsMeterialNo;
	}

	public void setCustomsMeterialNo(String customsMeterialNo) {
		this.customsMeterialNo = customsMeterialNo;
	}

	public int getRcvdCtns() {
		return rcvdCtns;
	}

	public void setRcvdCtns(int rcvdCtns) {
		this.rcvdCtns = rcvdCtns;
	}

	public int getRcvdPcs() {
		return rcvdPcs;
	}

	public void setRcvdPcs(int rcvdPcs) {
		this.rcvdPcs = rcvdPcs;
	}

	public BigDecimal getGwPerBoxActul() {
		return gwPerBoxActul;
	}

	public void setGwPerBoxActul(BigDecimal gwPerBoxActul) {
		this.gwPerBoxActul = gwPerBoxActul;
	}

	public BigDecimal getCustsDeclaPieceWeigh() {
		return custsDeclaPieceWeigh;
	}

	public void setCustsDeclaPieceWeigh(BigDecimal custsDeclaPieceWeigh) {
		this.custsDeclaPieceWeigh = custsDeclaPieceWeigh;
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

	public int getDeclaCount() {
		return declaCount;
	}

	public void setDeclaCount(int declaCount) {
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

	public String getDeclaCurrency() {
		return declaCurrency;
	}

	public void setDeclaCurrency(String declaCurrency) {
		this.declaCurrency = declaCurrency;
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

	public String getWarehousePosition() {
		return warehousePosition;
	}

	public void setWarehousePosition(String warehousePosition) {
		this.warehousePosition = warehousePosition;
	}

	public String getInboundNo() {
		return inboundNo;
	}

	public void setInboundNo(String inboundNo) {
		this.inboundNo = inboundNo;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	} 
	
	
}
