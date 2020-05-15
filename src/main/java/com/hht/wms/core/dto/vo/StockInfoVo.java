package com.hht.wms.core.dto.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

@Data
public class StockInfoVo {
	
	private String projectId ; 
	
    /**
     * 主键 id
     * 表字段 : stock_info.id
     */
    private String id;

    /**
     * 客户
     * 表字段
     */
	
	private String custId;

    /**
     * 入仓落货纸号
     * 表字段 : stock_info.so
     */
	
    private String so;

    /**
               * 客户采购订单号
     *	 表字段 : stock_info.po
     */
	
    private String po;
	
	
	private String transactionCurrency ;
	
	
	private String commercialInspectionNo ;

    /**
     	* 货物款号 asn-item
     	* 表字段 : stock_info.sku
     */
	
    private String item;

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
     * 包装类型
     * 表字段 : stock_info.pack_type
     */
	
    private String packType;	
	

    /**
     * 实收箱数
     * 表字段 : stock_info.rcvd_ctns
     */
	
    private Integer rcvdCtns;
	
    /**
     * 第一计量单位
     * 表字段 : stock_info.firstUnitMeasurement
     */	
	
	private String firstUnitMeasurement ; 
	
	
    /**
     * 第一法定数量
     * 表字段 : stock_info.firstLegalCount
     */		
	
    private BigDecimal firstLegalCount;	
	
	
    /**
     * 第二法定单位
     * 表字段 : stock_info.secondUnitMeasurement
     */			
	
	private String secondUnitMeasurement ; 
	
	
    /**
         * 第二法定数量 
         * 表字段 : stock_info.secondLegalCount
     */		
	
    private BigDecimal secondLegalCount;	
	
	
    /**
         * 成交单位  
         * 表字段 : stock_info.transactionUnit
     */			
	
	private String transactionUnit ; 
	
	
    /**
         * 成交数量
         * 表字段 : stock_info.transactionCount
     */			
	
    private BigDecimal transactionCount;		
	
	
	/**
	  * 成交总价
	  * 表字段 : stock_info.transTotalPrice
	 */			
	
	private BigDecimal transTotalPrice;	

	/**
	 * 成交单价
	 * 表字段 : stock_info.transUnitPrice
	*/			
	
	private BigDecimal transUnitPrice;	

	/**
	 * 申报要素
	 * 表字段 : stock_info.declaElement
	*/			
	
	private String declaElement;	
	
    /**
     * 实收件数
     * 表字段 : stock_info.rcvd_pcs
     */
	
    private Integer rcvdPcs;
	
	
    private String carNum;

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
	
	
    private String customsNo;	
	
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
     * 报关品名
     * 表字段 : stock_info.productName
     */
	
    private String productName;	
	
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
	
    private BigDecimal declaCount;

    /**
     * 申报单位/成交单位
     * 表字段 : stock_info.decla_unit
     */
	
    private String declaUnit;
	
	
    private String status;	

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
     * 商检标识
     * 表字段 : stock_info.commercialInspectionFlag
     */
	
    private String commercialInspectionFlag;	
	
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
}