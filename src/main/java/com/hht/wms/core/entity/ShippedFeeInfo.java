package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("shipped_fee_info")
public class ShippedFeeInfo {
	
    /**
     * 主键 id
     * 表字段 : shipped_fee_info.id
     */
	@TableId
    private String id;

    /**
     * 客户采购订单号
     * 表字段 : shipped_fee_info.po
     */
	@TableField
    private String po;
    /**
     * 货物款号 asn-item
     * 表字段 : shipped_fee_info.sku
     */
	@TableField
    private String item;
	  
    /**
     * 入仓落货纸号
     * 表字段 : shipped_fee_info.po
     */
	@TableField
    private String so;	  
	
    /**
     * 入仓编号
     * 表字段 : shipped_fee_info.inbound_no
     */
	@TableField
    private String inboundNo;
	  
    /**
     * shpt_no
     * 表字段 : shipped_fee_info.shpt_no
     */
	@TableField
    private String shpt_no;	  
	
    /**
     * 运输路线
     * 表字段 : shipped_fee_info.traffic_line
     */
	@TableField
    private String traffic_line;	  	
	
    /**
     * 柜形
     * 表字段 : shipped_fee_info.cntr_type
     */
	@TableField
    private String cntr_type;	  		
	
    /**
     * 分拣费
     * 表字段 : shipped_fee_info.sorting_fee
     */
	@TableField
    private BigDecimal sorting_fee;	  	
	
	  
    /**
     * 入闸费
     * 表字段 : shipped_fee_info.enter_gate_fee
     */
	@TableField
    private BigDecimal enterGateFee;	 	  
		  
    /**
     * 装卸单价
     * 表字段 : shipped_fee_info.unload_unit_price
     */
	@TableField
    private BigDecimal unloadUnitPrice;
	
    /**
     * 装货费
     * 表字段 : shipped_fee_info.load_fee
     */
	@TableField
    private BigDecimal load_fee;		  

	
    /**
     * 商检费
     * 表字段 : shipped_fee_info.commercial_inspection_fee
     */
	@TableField
    private BigDecimal commercialInspectionFee;	
	
    /**
     * 运输费
     * 表字段 : shipped_fee_info.traffic_fee
     */
	@TableField
    private BigDecimal trafficFee;	
	
    /**
     * 押车费
     * 表字段 : shipped_fee_info.del_bill_fee
     */
	@TableField
    private BigDecimal pledgeCarFee;	
	
    /**
     * 代垫费
     * 表字段 : shipped_fee_info.del_bill_fee
     */
	@TableField
    private BigDecimal paymentInAdvanceFee;	
	
    /**
     * 代垫税费
     * 表字段 : shipped_fee_info.payment_inAdvance_tax_fee
     */
	@TableField
    private BigDecimal paymentInAdvanceTaxFee;	
	
    /**
     * 合计
     * 表字段 : shipped_fee_info.total
     */
	@TableField
    private BigDecimal total;	
	
    /**
     * 创建时间
     * 表字段 : shipped_fee_info.create_time
     */
	@TableField
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : shipped_fee_info.update_time
     */
	@TableField
    private Date updateTime;	
	
		
	

}
