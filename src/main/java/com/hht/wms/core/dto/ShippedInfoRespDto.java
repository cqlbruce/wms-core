package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.entity.ShippedInfo;

public class ShippedInfoRespDto {
	
	
	private int total ; 
	
	List<ShippedInfo> items ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<ShippedInfo> getItems() {
		return items;
	}

	public void setItems(List<ShippedInfo> items) {
		this.items = items;
	}
	
	
	

}
