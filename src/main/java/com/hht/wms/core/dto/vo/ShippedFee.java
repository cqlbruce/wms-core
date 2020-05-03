package com.hht.wms.core.dto.vo;

import java.math.BigDecimal;

import com.hht.wms.core.dto.CustInfoQueryReqDto;

import lombok.Data;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.entity
 * @date 2019/9/22 3:43
 * @Copyright © 2019-2020 ****有限公司
 */
@Data
public class ShippedFee {
	
	//客户ID
	private String custId ; 
	
	//项目名称
	private String projectId ;
	
    /**
               * 出仓日期
     * */
    private String shippedDate;

    /**
     * shptNo
     * */
    private String shptNo;

    /**
     * 出仓单号
     * */
    private String clp;

    /**
     * 车牌号
     * 表字段 : front_desk_charge.car_num
     */
    private String carNum;
	
    /**
     * 柜号
     */
    private String cntrNo;

    /**
     * 运输路线
     * */
    private String trafficLine;

    /**
     * 柜型
     * */
    private String cntrType;

    /**
     * 总出仓箱数
     * */
    private BigDecimal shippedCtns;

    /**
     * 总出仓体积
     * */
    private BigDecimal shippedVolume;
    
    
    //分拣费
    private BigDecimal sortingFee;
    
    //入闸费
    private BigDecimal enterGateFee;
    
    
    //入仓总箱数
    private BigDecimal rcvdCtns;
    
    
    //装卸单价
    private BigDecimal unloadUnitPrice;

    //装货费
    private BigDecimal loadFee;
    
    
    //查货/商检费
    private BigDecimal commercialInspectionFee;
    
    //运输费
    private BigDecimal trafficFee;    
    
    //押车费
    private BigDecimal pledgeCarFee;      
    
    //代垫费
    private BigDecimal paymentInAdvanceFee;  
    
    //代垫税费
    private BigDecimal paymentInAdvanceTaxFee;  
    
    //费用合计
    private BigDecimal total;  


}
