package com.hht.wms.core.service;

import com.hht.wms.core.dto.StockAbstractQueryReqDto;
import com.hht.wms.core.dto.StockAbstractQueryRespDto;
import com.hht.wms.core.entity.StockAbstractInfo;

public interface StockAbstractService {
	
	
	
	int add(StockAbstractInfo stockAbstractInfo) throws Exception;

	
	StockAbstractQueryRespDto queryList(StockAbstractQueryReqDto reqDto );

	int deleteById(String inboundNo);

}
