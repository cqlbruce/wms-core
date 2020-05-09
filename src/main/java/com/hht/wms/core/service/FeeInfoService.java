package com.hht.wms.core.service;

import com.hht.wms.core.dto.ShippedFeeQueryReqDto;
import com.hht.wms.core.dto.ShippedFeeQueryRespDto;
import com.hht.wms.core.dto.StockFeeQueryReqDto;
import com.hht.wms.core.dto.StockFeeQueryRespDto;

public interface FeeInfoService {
	
	
	
	StockFeeQueryRespDto stockFeeInfoQueryByPage(StockFeeQueryReqDto reqDto);
	
	ShippedFeeQueryRespDto shippedFeeInfoQueryByPage(ShippedFeeQueryReqDto reqDto);

}
