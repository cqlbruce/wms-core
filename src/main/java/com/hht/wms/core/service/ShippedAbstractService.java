package com.hht.wms.core.service;

import com.hht.wms.core.dto.ShippedAbstractQueryRespDto;
import com.hht.wms.core.dto.ShippedInfoReqDto;

public interface ShippedAbstractService {
	
	
	
	ShippedAbstractQueryRespDto queryList(ShippedInfoReqDto reqDto);
	

}
