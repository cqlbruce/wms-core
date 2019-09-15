package com.hht.wms.core.dto;

public class StockInfoQueryReqDto {
	
	private String po ; 
	
	private String sku ;
	
//	private String inboundNo ;
	
	private int  page ;
	
	private int limit ;

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

//	public String getInboundNo() {
//		return inboundNo;
//	}
//
//	public void setInboundNo(String inboundNo) {
//		this.inboundNo = inboundNo;
//	}
//	
//	

}
