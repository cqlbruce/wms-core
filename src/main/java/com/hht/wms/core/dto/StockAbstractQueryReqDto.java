package com.hht.wms.core.dto;

import lombok.Data;

@Data
public class StockAbstractQueryReqDto {
	
	private String inboundNo ; 
	
	private String custId ; 
	
	private String so ; 
	
	private int  page ;
	
	private int size;
	
	private int beginSize ; 
	

}
