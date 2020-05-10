package com.hht.wms.core.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ShippedFeeUpdateReqDto {

	
	private String custId ; 
	
	private String projectId;
	
	private String so  ; 
	
	private String po ; 
	
	private String item ; 
	
	private String clp ; 
	
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
    
    //分拣费
    private BigDecimal sortingFee;
    
    //入闸费
    private BigDecimal enterGateFee;
    
    /**
     * 运输路线
     * */
    private String trafficLine;
}
