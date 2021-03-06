package com.hht.wms.core.dto;

import lombok.Data;

@Data
public class ShippedAbstractQueryReqDto {
	
	private String custId ; 
	
	private String clp ; 
	
	private String cntrNo ; 
	
	private String shippedDate ; 
	
	private int  page ;
	
	private int size;
	
	private int beginSize ; 

}
