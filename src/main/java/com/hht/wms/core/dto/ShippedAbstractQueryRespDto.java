package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.entity.ShippedAbstractInfo;

public class ShippedAbstractQueryRespDto {
	
	
	private int total ; 
	
	List<ShippedAbstractInfo> items ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<ShippedAbstractInfo> getItems() {
		return items;
	}

	public void setItems(List<ShippedAbstractInfo> items) {
		this.items = items;
	}

	

}
