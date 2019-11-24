package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.entity.StockAbstractInfo;

public class StockAbstractQueryRespDto {
	
	
	private int total ; 
	
	List<StockAbstractInfo> items ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<StockAbstractInfo> getItems() {
		return items;
	}

	public void setItems(List<StockAbstractInfo> items) {
		this.items = items;
	}
	
	

}
