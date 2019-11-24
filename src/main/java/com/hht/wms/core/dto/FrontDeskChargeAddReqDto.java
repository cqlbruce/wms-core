package com.hht.wms.core.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class FrontDeskChargeAddReqDto {
	
    private String custId;
    
    private String carNum;
    
    private BigDecimal customsDeclarationFee;
    
    private String tranDate;

    private String receiptNo;
    
    private String projectId;

    private Integer billOneCar;

    private String payType;

    private BigDecimal recAmt;

    private BigDecimal enterGateFee;
    
	private List<FrontDeskChargeDetail> items ;



}
