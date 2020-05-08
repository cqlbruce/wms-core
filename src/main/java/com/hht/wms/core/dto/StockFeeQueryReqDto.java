package com.hht.wms.core.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.hht.wms.core.entity.FrontDeskCharge;

import lombok.Data;

/**
 **入仓费用查询
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:00
 * @Copyright © 2019-2020 ****有限公司
 */
@Data
public class StockFeeQueryReqDto {
	
	
	//客户ID
	private String custId ; 
	
	//项目名称
	private String projectId ;
	
	//入仓落纸号
	private String so ; 
	
	//进仓开始日期
    private String beginDate;

    //进仓结束日期
    private String endDate;

    private int page ;

    private int limit ;
    
    private int beginSize;

}
