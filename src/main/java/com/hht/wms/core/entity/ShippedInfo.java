package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("shipped_info")
public class ShippedInfo {
    /**
     * 主键 id
     * 表字段 : shipped_info.id
     */
	@TableId
    private String id;

    /**
     * 入仓落货纸号
     * 表字段 : shipped_info.so
     */
	@TableField
    private String so;

    /**
     * 客户采购订单号
     * 表字段 : shipped_info.po
     */
	@TableField
    private String po;
    /**
     * 货物款号 asn-item
     * 表字段 : shipped_info.sku
     */
	  @TableField
    private String sku;
    /**
     * 入仓编号
     * 表字段 : shipped_info.inbound_no
     */
	  @TableField
    private String inboundNo;

    /**
     * 海关系统物料号
     * 表字段 : shipped_info.customs_meterial_no
     */
	  @TableField
    private String customsMeterialNo;

    /**
     * 出仓订单日期
     * 表字段 : shipped_info.shipped_order_date
     */
	  @TableField
    private String shippedOrderDate;

    /**
     * 实际离仓日期
     * 表字段 : shipped_info.shipped_date
     */
	  @TableField
    private String shippedDate;

    /**
     * 出仓单号clp
     * 表字段 : shipped_info.shipped_no
     */
	  @TableField
    private String clp;

    /**
     * 仓库位置
     * 表字段 : shipped_info.warehouse_position
     */
	  @TableField
    private String warehousePosition;

    /**
     * 总出仓箱数
     * 表字段 : shipped_info.shipped_ctns
     */
	  @TableField
    private BigDecimal shippedCtns;

    /**
     * 总出仓件数
     * 表字段 : shipped_info.shipped_pcs
     */
	  @TableField
    private Integer shippedPcs;

    /**
     * 出仓毛重
     * 表字段 : shipped_info.shipped_gw
     */
	  @TableField
    private BigDecimal shippedGw;

    /**
     * 出仓体积
     * 表字段 : shipped_info.shipped_volume
     */
	  @TableField
    private BigDecimal shippedVolume;

    /**
     * 海关商品编码
     * 表字段 : shipped_info.customs_merch_no
     */
	  @TableField
    private String customsMerchNo;

    /**
     * 报关单号
     * 表字段 : shipped_info.merch_name
     */
	  @TableField
    private String merchName;

    /**
     * 申报数量/成交数量
     * 表字段 : shipped_info.decla_count
     */
	  @TableField
    private Integer declaCount;

    /**
     * 申报单位/成交单位
     * 表字段 : shipped_info.decla_unit
     */
	  @TableField
    private String declaUnit;

    /**
     * 申报单位/成交单位
     * 表字段 : shipped_info.decla_unit_price
     */
	  @TableField
    private BigDecimal declaUnitPrice;

    /**
     * 申报总价/成交总价
     * 表字段 : shipped_info.decla_total_price
     */
	  @TableField
    private BigDecimal declaTotalPrice;

    /**
     * 成交币种/申报币种
     * 表字段 : shipped_info.decla_currency
     */
	  @TableField
    private String declaCurrency;

    /**
     * 原产国
     * 表字段 : shipped_info.origin_country
     */
	  @TableField
    private String originCountry;

    /**
     * 目的国
     * 表字段 : shipped_info.dest_country
     */
	  @TableField
    private String destCountry;

    /**
     * 单件净重
     * 表字段 : shipped_info.piece_weigh
     */
	  @TableField
    private BigDecimal pieceWeigh;

    /**
     * 出仓总净重
     * 表字段 : shipped_info.shipped_all_weigh
     */
	  @TableField
    private BigDecimal shippedAllWeigh;

    /**
     * 海关监管条件
     * 表字段 : shipped_info.supervision_conditions
     */
	  @TableField
    private String supervisionConditions;

    /**
     * 创建时间
     * 表字段 : shipped_info.create_time
     */
	  @TableField
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : shipped_info.update_time
     */
	  @TableField
    private Date updateTime;
}