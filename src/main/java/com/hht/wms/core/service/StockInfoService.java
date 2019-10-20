package com.hht.wms.core.service;

import java.util.List;

import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.entity.StockInfo;

public interface StockInfoService {
	
	StockInfoRespDto loadStock(StockInfoQueryReqDto reqDto);
	
	int addStock(List<StockInfo> stockInfoList);
	
	int updateStock(StockInfo stockInfo);
	
	StockInfo queryByThreeElemet(String so , String po , String sku);

}
