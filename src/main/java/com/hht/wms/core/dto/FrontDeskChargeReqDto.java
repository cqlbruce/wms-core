package com.hht.wms.core.dto;

import lombok.Data;

@Data
public class FrontDeskChargeReqDto {
	
	private String inboundNo ;

	private int  page ;
	
	private int beginSize ; 
	
	private int size ;


}
