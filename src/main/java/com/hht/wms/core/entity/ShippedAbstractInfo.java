package com.hht.wms.core.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

public class ShippedAbstractInfo {
	
		/**
		 * 出仓单号
		 */
		@TableId
	    private String clp;

		@TableField
	    private String custId;
		
		/**
		 * 柜号
		 */
		@TableField
	    private String cntrNo;
		
		/**
		 * 封条
		 */
		@TableField
	    private String seal;
		
		@TableField
	    private String createTime;
		@TableField
	    private Date updateTime;

}
