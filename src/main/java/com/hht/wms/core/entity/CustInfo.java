package com.hht.wms.core.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("cust_info")
public class CustInfo {
	
	@TableId	
    private String id;
	
	@TableField
    private String custId;
	
	@TableField
    private String custShortName;
	
	@TableField
    private String custFullName;
	
	@TableField
    private String projectId;
	
	@TableField
    private String projectName;
	
	@TableField
    private Date createTime;

	@TableField
    private Date updateTime;
	
}
