package com.hht.wms.core.service;

import java.util.List;

import com.hht.wms.core.dto.ShippedFeeQueryReqDto;
import com.hht.wms.core.dto.ShippedFeeQueryRespDto;
import com.hht.wms.core.dto.StockFeeQueryReqDto;
import com.hht.wms.core.dto.StockFeeQueryRespDto;
import com.hht.wms.core.dto.vo.ShippedFee;
import com.hht.wms.core.dto.vo.StockFee;

public interface FeeInfoService {
	
	StockFeeQueryRespDto stockFeeInfoQueryByPage(StockFeeQueryReqDto reqDto);
	
	List<StockFee> stockFeeInfoQueryList(StockFeeQueryReqDto reqDto);

	ShippedFeeQueryRespDto shippedFeeInfoQueryByPage(ShippedFeeQueryReqDto reqDto);
	
	List<ShippedFee> shippedFeeInfoQueryList(ShippedFeeQueryReqDto reqDto);

}
