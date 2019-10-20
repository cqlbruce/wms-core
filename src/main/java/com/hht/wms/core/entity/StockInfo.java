package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("stock_info")
public class StockInfo {
    /**
     * 主键 id
     * 表字段 : stock_info.id
     */
	@TableId
    private String id;

    /**
     * 供应商名称
     * 表字段 : stock_info.supplier_name
     */
	@TableField
	private String supplierName;

    /**
     * 入仓落货纸号
     * 表字段 : stock_info.so
     */
	@TableField
    private String so;

    /**
     * 客户采购订单号
     * 表字段 : stock_info.po
     */
	@TableField
    private String po;

    /**
     * 货物款号 asn-item
     * 表字段 : stock_info.sku
     */
	@TableField
    private String sku;

    /**
     * 入仓编号
     * 表字段 : stock_info.inbound_no
     */
	@TableField
    private String inboundNo;

    /**
     * 海关系统物料号
     * 表字段 : stock_info.customs_meterial_no
     */
	@TableField
    private String customsMeterialNo;

    /**
     * 收货日期
     * 表字段 : stock_info.rcvd_date
     */
	@TableField
    private String rcvdDate;

    /**
     * 实收箱数
     * 表字段 : stock_info.rcvd_ctns
     */
	@TableField
    private Integer rcvdCtns;

    /**
     * 实收件数
     * 表字段 : stock_info.rcvd_pcs
     */
	@TableField
    private Integer rcvdPcs;

    /**
     * 一箱几件
     * 表字段 : stock_info.items_per_box
     */
	@TableField
    private Integer itemsPerBox;

    /**
     * 单箱毛重
     * 表字段 : stock_info.gw_per_box_actul
     */
	@TableField
    private BigDecimal gwPerBoxActul;

    /**
     * 实收总毛重
     * 表字段 : stock_info.gw_all_actul
     */
	@TableField
    private BigDecimal gwAllActul;

    /**
     * 实测外箱长L
     * 表字段 : stock_info.box_length_actul
     */
	@TableField
    private BigDecimal boxLengthActul;

    /**
     * 实测外箱宽W
     * 表字段 : stock_info.box_width_actul
     */
	@TableField
    private BigDecimal boxWidthActul;

    /**
     * 实测外箱高H
     * 表字段 : stock_info.box_high_actul
     */
	@TableField
    private BigDecimal boxHighActul;

    /**
     * 实测单箱体积cbm/ctn
     * 表字段 : stock_info.box_per_volume_actul
     */
	@TableField
    private BigDecimal boxPerVolumeActul;

    /**
     * 实收总体积
     * 表字段 : stock_info.box_all_volume_actul
     */
	@TableField
    private BigDecimal boxAllVolumeActul;

    /**
     * 入仓报关单件净重N.W./pcs
     * 表字段 : stock_info.custs_decla_piece_weigh
     */
	@TableField
    private BigDecimal custsDeclaPieceWeigh;

    /**
     * 入仓报关总净重total N.W
     * 表字段 : stock_info.custs_decla_all_weigh
     */
	@TableField
    private BigDecimal custsDeclaAllWeigh;

    /**
     * 仓库位置
     * 表字段 : stock_info.warehouse_position
     */
	@TableField
    private String warehousePosition;

    /**
     * 总出仓箱数
     * 表字段 : stock_info.shipped_ctns
     */
	@TableField
    private BigDecimal shippedCtns;

    /**
     * 总出仓件数
     * 表字段 : stock_info.shipped_pcs
     */
	@TableField
    private Integer shippedPcs;

    /**
     * 总出仓毛重
     * 表字段 : stock_info.shipped_gw
     */
	@TableField
    private BigDecimal shippedGw;

    /**
     * 总出仓净重
     * 表字段 : stock_info.shipped_weigh
     */
	@TableField
    private BigDecimal shippedWeigh;

    /**
     * 总出仓体积
     * 表字段 : stock_info.shipped_volume
     */
	@TableField
    private BigDecimal shippedVolume;

    /**
     * 总库存箱数
     * 表字段 : stock_info.stock_ctns
     */
	@TableField
    private BigDecimal stockCtns;

    /**
     * 总库存件数
     * 表字段 : stock_info.stock_pcs
     */
	@TableField
    private Integer stockPcs;

    /**
     * 总库存毛重
     * 表字段 : stock_info.stock_gw
     */
	@TableField
    private BigDecimal stockGw;

    /**
     * 总库存净重
     * 表字段 : stock_info.stock_weigh
     */
	@TableField
    private BigDecimal stockWeigh;

    /**
     * 总库存体积
     * 表字段 : stock_info.stock_volume
     */
	@TableField
    private BigDecimal stockVolume;

    /**
     * 库存case pack 检验
     * 表字段 : stock_info.stock_check
     */
	@TableField
    private String stockCheck;

    /**
     * 报关单号
     * 表字段 : stock_info.customs_order_no
     */
	@TableField
    private String customsOrderNo;

    /**
     * 海关商品编码
     * 表字段 : stock_info.customs_merch_no
     */
	@TableField
    private String customsMerchNo;

    /**
     * 报关单号
     * 表字段 : stock_info.merch_name
     */
	@TableField
    private String merchName;

    /**
     * 申报数量/成交数量
     * 表字段 : stock_info.decla_count
     */
	@TableField
    private Integer declaCount;

    /**
     * 申报单位/成交单位
     * 表字段 : stock_info.decla_unit
     */
	@TableField
    private String declaUnit;

    /**
     * 申报单位/成交单位
     * 表字段 : stock_info.decla_unit_price
     */
	@TableField
    private BigDecimal declaUnitPrice;

    /**
     * 申报总价/成交总价
     * 表字段 : stock_info.decla_total_price
     */
	@TableField
    private BigDecimal declaTotalPrice;

    /**
     * 成交币种/申报币种
     * 表字段 : stock_info.decla_currency
     */
	@TableField
    private String declaCurrency;

    /**
     * 原产国
     * 表字段 : stock_info.origin_country
     */
	@TableField
    private String originCountry;

    /**
     * 目的国
     * 表字段 : stock_info.dest_country
     */
	@TableField
    private String destCountry;

    /**
     * 海关监管条件
     * 表字段 : stock_info.supervision_conditions
     */
	@TableField
    private String supervisionConditions;

    /**
     * 创建时间
     * 表字段 : stock_info.create_time
     */
	@TableField
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : stock_info.update_time
     */
	@TableField
    private Date updateTime;


}