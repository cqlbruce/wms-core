package com.hht.wms.core.dto;

public class ShippedInfoReqDto {
	
	private String so ; 
	
	private String po ; 
	
	private String sku ;
	
	private String clp ; 
		
	private int  page ;
	
	private int limit ;

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

	public String getClp() {
		return clp;
	}

	public void setClp(String clp) {
		this.clp = clp;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
}
