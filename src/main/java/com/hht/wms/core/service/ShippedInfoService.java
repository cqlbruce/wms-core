package com.hht.wms.core.service;

import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;

public interface ShippedInfoService {
	
	
	ShippedInfoRespDto queryList(ShippedInfoReqDto reqDto );
	

}
