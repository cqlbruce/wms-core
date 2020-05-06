package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("stock_fee_info")
public class StockFeeInfo {
	
	
    /**
     * 主键 id
     * 表字段 : stock_fee_info.id
     */
	@TableId
    private String id;

    /**
     * 客户采购订单号
     * 表字段 : stock_fee_info.po
     */
	@TableField
    private String po;
    /**
     * 货物款号 asn-item
     * 表字段 : stock_fee_info.sku
     */
	@TableField
    private String item;
	  
    /**
     * 入仓落货纸号
     * 表字段 : stock_fee_info.po
     */
	@TableField
    private String so;	  
	
	  
    /**
     * 入仓编号
     * 表字段 : stock_fee_info.inbound_no
     */
	@TableField
    private String inboundNo;
	  
	  
	  
    /**
     * 续页费
     * 表字段 : stock_fee_info.continuation_sheet_fee
     */
	@TableField
    private BigDecimal continuationSheetFee;	  
	  
	  
    /**
     * 入闸费
     * 表字段 : stock_fee_info.enter_gate_fee
     */
	@TableField
    private BigDecimal enterGateFee;	 	  
		  
    /**
     * 装卸单价
     * 表字段 : stock_fee_info.unload_unit_price
     */
	@TableField
    private BigDecimal unloadUnitPrice;
	
	
    /**
     * 卸货费
     * 表字段 : stock_fee_info.unload_fee
     */
	@TableField
    private BigDecimal unloadFee;		  
		  
	  
    /**
     * 混装费
     * 表字段 : stock_fee_info.assorted_packing_fee
     */
	@TableField
    private BigDecimal assortedPackingFee;
	
	
    /**
     * 加班费
     * 表字段 : stock_fee_info.overtime_fee
     */
	@TableField
    private BigDecimal overtimeFee;
	
    /**
     * 删单费
     * 表字段 : stock_fee_info.del_bill_fee
     */
	@TableField
    private BigDecimal delBillFee;	
	  
	  
    /**
     * 商检费
     * 表字段 : stock_fee_info.commercial_inspection_fee
     */
	@TableField
    private String commercialInspectionFee;	
	
    /**
     * 运输费
     * 表字段 : stock_fee_info.traffic_fee
     */
	@TableField
    private BigDecimal trafficFee;	
	
    /**
     * 押车费
     * 表字段 : stock_fee_info.del_bill_fee
     */
	@TableField
    private BigDecimal pledgeCarFee;	
	
	
    /**
     * 代垫费
     * 表字段 : stock_fee_info.del_bill_fee
     */
	@TableField
    private String paymentInAdvanceFee;	
	
	
    /**
     * 代垫税费
     * 表字段 : stock_fee_info.payment_inAdvance_tax_fee
     */
	@TableField
    private String paymentInAdvanceTaxFee;	
	
    /**
     * 合计
     * 表字段 : stock_fee_info.total
     */
	@TableField
    private String total;	
	
    /**
     * 创建时间
     * 表字段 : stock_fee_info.create_time
     */
	@TableField
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : stock_fee_info.update_time
     */
	@TableField
    private Date updateTime;	
	
	

}
