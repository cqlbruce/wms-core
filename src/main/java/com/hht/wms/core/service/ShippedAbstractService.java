package com.hht.wms.core.service;

import com.hht.wms.core.dto.ShippedAbstractQueryReqDto;
import com.hht.wms.core.dto.ShippedAbstractQueryRespDto;

public interface ShippedAbstractService {
	
	
	
	ShippedAbstractQueryRespDto queryList(ShippedAbstractQueryReqDto reqDto);
	

}
