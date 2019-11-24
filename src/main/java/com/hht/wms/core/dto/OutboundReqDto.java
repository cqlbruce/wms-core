package com.hht.wms.core.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OutboundReqDto {

	private String id ; 
	
	private String clp ; 
	
	private int pcs ; 
	
	private int ctns ; 
	
	private String so ;
	
	private String po ;
	
	private String item ; 
	
	private BigDecimal gw ; 
	
	private BigDecimal volume ; 
	

}
