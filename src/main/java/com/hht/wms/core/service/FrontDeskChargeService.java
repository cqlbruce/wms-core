package com.hht.wms.core.service;

import com.hht.wms.core.dto.FrontDeskChargeReqDto;
import com.hht.wms.core.dto.FrontDeskChargeRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.entity.StockInfo;

public interface FrontDeskChargeService {
	
	
	
	int add(FrontDeskCharge reqDto);
	
	FrontDeskChargeRespDto query(FrontDeskChargeReqDto reqDto);
	
	int updateByInboundNo(StockInfo info)  throws Exception;


}
