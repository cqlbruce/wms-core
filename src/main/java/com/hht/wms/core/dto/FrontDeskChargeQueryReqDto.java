package com.hht.wms.core.dto;

import lombok.Data;

@Data
public class FrontDeskChargeQueryReqDto {
	
    private String custId ;
    
    private String carNum ;
    
    private String tranDate ;
	
	private String inboundNo ;
	
	private String so ;
	
	private int  page ;
	
	private int beginSize ; 
	
	private int size ;


}
