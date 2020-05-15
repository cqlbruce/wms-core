package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.dto.vo.ShippedInfoVo;

public class ShippedInfoRespDto {
	
	
	private int total ; 
	
	List<ShippedInfoVo> items ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<ShippedInfoVo> getItems() {
		return items;
	}

	public void setItems(List<ShippedInfoVo> items) {
		this.items = items;
	}
	
	
	

}
