package com.hht.wms.core.dto;

import lombok.Data;

@Data
public class FrontDeskChargeQueryReqDto {
	
	private String inboundNo ;

	private int  page ;
	
	private int beginSize ; 
	
	private int size ;


}
