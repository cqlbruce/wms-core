package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.entity.StockInfo;

public class StockInfoRespDto {

	private int total ; 
	
	List<StockInfo> items ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<StockInfo> getItems() {
		return items;
	}

	public void setItems(List<StockInfo> items) {
		this.items = items;
	} 
	
	
 
}
