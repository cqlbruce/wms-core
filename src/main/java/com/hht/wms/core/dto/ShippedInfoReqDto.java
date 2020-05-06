package com.hht.wms.core.dto;

import lombok.Data;

@Data
public class ShippedInfoReqDto {
	
	private String so ; 
	
	private String po ; 
	
	private String item ;
	
	private String clp ; 
	
	private String seal ; 
	
	private String custId;
	
	private String inbundNo;
	
	private String cntrNo ; 
	
	private String beginDate ; 
	
	private String endDate ; 
		
	private int  page ;
	
	private int beginSize ; 
	
	private int size ;
	

	
}
