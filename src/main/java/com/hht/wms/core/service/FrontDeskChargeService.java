package com.hht.wms.core.service;

import com.hht.wms.core.dto.FrontDeskChargeReqDto;
import com.hht.wms.core.dto.FrontDeskChargeRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;

public interface FrontDeskChargeService {
	
	
	
	int add(FrontDeskCharge reqDto);
	
	FrontDeskChargeRespDto query(FrontDeskChargeReqDto reqDto);

}
