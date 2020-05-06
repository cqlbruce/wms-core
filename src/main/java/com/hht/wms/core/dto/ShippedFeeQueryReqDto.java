package com.hht.wms.core.dto;

import lombok.Data;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:48
 * @Copyright © 2019-2020 ****有限公司
 */
@Data
public class ShippedFeeQueryReqDto {
	
	
    private int page;

    private int limit;
    
    private String custId;
    
    private String projectId;
    
    //柜号
    private String cntrNo ; 

    private String beginDate;

    private String endDate;

    private String shptNo;

    private String clp;

    //车牌号
    private String carNum;

    private String route;

}
