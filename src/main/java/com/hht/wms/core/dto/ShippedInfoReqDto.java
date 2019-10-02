package com.hht.wms.core.dto;

public class ShippedInfoReqDto {
	
	private String so ; 
	
	private String po ; 
	
	private String sku ;
	
	private String clp ; 
	
	private String beginDate ; 
	
	private String endDate ; 
		
	private int  page ;
	
	private int beginSize ; 
	
	private int size ;
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getBeginSize() {
		return beginSize;
	}

	public void setBeginSize(int beginSize) {
		this.beginSize = beginSize;
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

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
