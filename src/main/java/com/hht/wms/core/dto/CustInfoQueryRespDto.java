package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.entity.CustInfo;

public class CustInfoQueryRespDto {
	
	private int total ; 
	
	List<CustInfo> items ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<CustInfo> getItems() {
		return items;
	}

	public void setItems(List<CustInfo> items) {
		this.items = items;
	}
	
	

}
