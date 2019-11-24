package com.hht.wms.core.service;

import com.hht.wms.core.dto.FrontDeskChargeQueryReqDto;
import com.hht.wms.core.dto.FrontDeskChargeQueryRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.entity.StockInfo;

public interface FrontDeskChargeService {
	
	int add(FrontDeskCharge reqDto);
	
	FrontDeskChargeQueryRespDto query(FrontDeskChargeQueryReqDto reqDto);
	
	FrontDeskChargeQueryRespDto queryByPage(FrontDeskChargeQueryReqDto reqDto);
	
	int updateByInboundNo(StockInfo info)  throws Exception;
	
	int update(FrontDeskCharge reqDto);
	
	int delete(String id);
}
