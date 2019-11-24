package com.hht.wms.core.dto;

import lombok.Data;
@Data
public class StockInfoQueryReqDto {
	
	private String so ; 
	
	private String po ; 
	
	private String item ;
	
	private String inbundNo ; 
		
	private int  page ;
	
	private int size;
	
	private int beginSize ; 
	

}
