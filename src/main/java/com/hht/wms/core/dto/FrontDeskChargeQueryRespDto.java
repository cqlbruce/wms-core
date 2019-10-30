package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.entity.FrontDeskCharge;


public class FrontDeskChargeQueryRespDto {
	
	
	private int total ; 
	
	List<FrontDeskCharge> items ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<FrontDeskCharge> getItems() {
		return items;
	}

	public void setItems(List<FrontDeskCharge> items) {
		this.items = items;
	}
	
	

}
