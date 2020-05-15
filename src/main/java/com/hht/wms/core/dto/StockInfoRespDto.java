package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.dto.vo.StockInfoVo;

public class StockInfoRespDto {

	private int total ; 
	
	List<StockInfoVo> items ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<StockInfoVo> getItems() {
		return items;
	}

	public void setItems(List<StockInfoVo> items) {
		this.items = items;
	} 
	
	
 
}
