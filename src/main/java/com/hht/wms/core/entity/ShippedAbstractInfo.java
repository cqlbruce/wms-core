package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data		
@TableName("shipped_abstract_info")
public class ShippedAbstractInfo {
	
		@TableId
	    private String clp;

		@TableField
	    private String custId;
		
		@TableField
	    private String cntrNo;
		
		@TableField
	    private String seal;
		
		@TableField
	    private BigDecimal cntrWeigh;		
		
		@TableField
	    private String createTime;
		
		@TableField
	    private Date updateTime;

}
