package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("front_desk_charge")
public class FrontDeskCharge {
    /**
     * 主键id
     * 表字段 : front_desk_charge.id
     */
	@TableId	
    private String id;

    /**
     * 入仓编号
     * 表字段 : front_desk_charge.inbound_no
     */
	@TableField
    private String inboundNo;

    /**
     * 落货纸号码
     * 表字段 : front_desk_charge.so
     */
	@TableField
    private String so;

    /**
     * 收据编码
     * 表字段 : front_desk_charge.receipt_no
     */
	@TableField
    private String receiptNo;

    /**
     * 客户名称
     * 表字段 : front_desk_charge.cust_name
     */
	@TableField
    private String custName;

    /**
     * 工厂名称
     * 表字段 : front_desk_charge.factory
     */
	@TableField
    private String factory;

    /**
     * 收费日期
     * 表字段 : front_desk_charge.tran_date
     */
	@TableField
    private String tranDate;

    /**
     * 项目名称
     * 表字段 : front_desk_charge.project_name
     */
	@TableField
    private String projectName;

    /**
     * 一车几单
     * 表字段 : front_desk_charge.bill_one_car
     */
	@TableField
    private Integer billOneCar;

    /**
     * 车牌号
     * 表字段 : front_desk_charge.car_num
     */
	@TableField
    private String carNum;

    /**
     * 支付方式  0 现金 1 微信支付
     * 表字段 : front_desk_charge.pay_type
     */
	@TableField
    private String payType;

    /**
     * 结算方式
     * 表字段 : front_desk_charge.settlement_type
     */
    @TableField
    private String settlementType;

    /**
     * 代收款合计
     * 表字段 : front_desk_charge.rec_amt
     */
    @TableField
    private BigDecimal recAmt;

    /**
     * 入闸费
     * 表字段 : front_desk_charge.enter_gate_fee
     */
    @TableField
    private BigDecimal enterGateFee;

    /**
     * 报关费
     * 表字段 : front_desk_charge.customs_declaration_fee
     */
    @TableField
    private BigDecimal customsDeclarationFee;

    /**
     * 创建时间
     * 表字段 : front_desk_charge.create_time
     */
    @TableField
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : front_desk_charge.update_time
     */
    @TableField
    private Date updateTime;

}