package com.hht.wms.core.service;

import java.util.List;

import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.entity.StockInfo;

public interface StockInfoService {
	
	List<StockInfo> loadStock(StockInfoQueryReqDto reqDto);
	
	int addStock(List<StockInfo> stockInfoList);
	
	int updateStock(StockInfo stockInfo);

	int outbound(OutboundReqDto reqDto);
	
	
}
