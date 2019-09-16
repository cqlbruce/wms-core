package com.hht.wms.core.dto;

public class StockInfoOutReqDto {
	
	
	private String clpNo ; 
	
	private String so ; 
	
	private String po ;
	
	private String sku ; 
	
	private int pcs ;
	
	

	public String getClpNo() {
		return clpNo;
	}

	public void setClpNo(String clpNo) {
		this.clpNo = clpNo;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getPcs() {
		return pcs;
	}

	public void setPcs(int pcs) {
		this.pcs = pcs;
	} 
	

}
