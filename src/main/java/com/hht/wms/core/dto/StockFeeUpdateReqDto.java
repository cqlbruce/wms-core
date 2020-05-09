package com.hht.wms.core.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class StockFeeUpdateReqDto {
	
	
	private String so ; 
	
	private String po ; 
	
	private String item ; 
	
	private String inboundNo ; 
	
	
    //续页费
    private BigDecimal continuationSheetFee ; 

    //入闸费
    private BigDecimal enterGateFee;
    
    //装卸单价
    private BigDecimal unloadUnitPrice;

    //卸货费
    private BigDecimal unloadFee;

    //混装费
    private BigDecimal assortedPackingFee;
    
    //加班费
    private BigDecimal overtimeFee;

    //删单费
    private BigDecimal delBillFee;
    
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

}
