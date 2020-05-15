package com.hht.wms.core.dto.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Data;

@Data
public class ShippedInfoVo {
	
	
	private String custId ; 
	
	private String projectId;
	
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
	  
    private String item;
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
	  
	  
	
    private String cntrNo;

	
    private String seal;

	
    private BigDecimal cntrWeigh;

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
	  
    private String clp;

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
	
    private BigDecimal declaCount;

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
}