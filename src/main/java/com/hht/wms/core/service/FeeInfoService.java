package com.hht.wms.core.service;

import com.hht.wms.core.dto.StockFeeQueryReqDto;
import com.hht.wms.core.dto.StockFeeQueryRespDto;

public interface FeeInfoService {
	
	
	
	StockFeeQueryRespDto stockFeeInfoQueryByPage(StockFeeQueryReqDto reqDto);

	

}
