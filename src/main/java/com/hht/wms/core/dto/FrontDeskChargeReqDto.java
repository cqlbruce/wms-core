package com.hht.wms.core.dto;

public class FrontDeskChargeReqDto {
	
	private String inboundNo ;

	private int  page ;
	
	private int beginSize ; 
	
	private int size ;
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
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

	public String getInboundNo() {
		return inboundNo;
	}

	public void setInboundNo(String inboundNo) {
		this.inboundNo = inboundNo;
	}

}
