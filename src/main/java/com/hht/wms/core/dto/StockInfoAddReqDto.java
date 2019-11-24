package com.hht.wms.core.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class StockInfoAddReqDto {
	
	private String po ; 
	
	private String item ; 
	
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

	
	
}
