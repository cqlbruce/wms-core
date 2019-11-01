package com.hht.wms.core.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("stock_abstract_info")
public class StockAbstractInfo {

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
	    private String cust_id;

	    /**
	     * 客户采购订单号
	     * 表字段 : shipped_info.po
	     */
		@TableField
	    private String inbound_no;
	    /**
	     * 货物款号 asn-item
	     * 表字段 : shipped_info.sku
	     */
		@TableField
	    private String car_num;
	    /**
	     * 入仓编号
	     * 表字段 : shipped_info.inbound_no
	     */
		@TableField
	    private String status;
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
