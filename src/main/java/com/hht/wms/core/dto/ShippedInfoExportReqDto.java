package com.hht.wms.core.dto;

import java.math.BigDecimal;

public class ShippedInfoExportReqDto {
	
	private String clp ; 
	
	private String cntrNo ; 
	
	private String seal ; 
	
	private BigDecimal cntrWeigh ;

	public String getClp() {
		return clp;
	}

	public void setClp(String clp) {
		this.clp = clp;
	}

	public String getCntrNo() {
		return cntrNo;
	}

	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}

	public String getSeal() {
		return seal;
	}

	public void setSeal(String seal) {
		this.seal = seal;
	}

	public BigDecimal getCntrWeigh() {
		return cntrWeigh;
	}

	public void setCntrWeigh(BigDecimal cntrWeigh) {
		this.cntrWeigh = cntrWeigh;
	} 
	
	

}
