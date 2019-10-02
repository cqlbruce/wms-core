package com.hht.wms.core.dto;

public class StockInfoQueryReqDto {
	
	private String so ; 
	
	private String po ; 
	
	private String sku ;
	
	private String inbundNo ; 
		
	private int  page ;
	
	private int size;
	
	private int beginSize ; 
	
	
	public String getInbundNo() {
		return inbundNo;
	}

	public void setInbundNo(String inbundNo) {
		this.inbundNo = inbundNo;
	}

	public int getBeginSize() {
		return beginSize;
	}

	public void setBeginSize(int beginSize) {
		this.beginSize = beginSize;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
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



}
