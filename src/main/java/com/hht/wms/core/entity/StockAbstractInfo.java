package com.hht.wms.core.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("stock_abstract_info")
public class StockAbstractInfo {


		@TableId
	    private String inboundNo;

		@TableField
	    private String custId;


		@TableField
	    private String carNum;

		@TableField
	    private String status;
		
		@TableField
	    private String rcvdDate;

		@TableField
	    private Date createTime;

		@TableField
	    private Date updateTime;

		
	  
}
