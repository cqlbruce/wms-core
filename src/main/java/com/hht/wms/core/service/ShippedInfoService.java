package com.hht.wms.core.service;

import java.util.List;

import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.entity.ShippedInfo;

public interface ShippedInfoService {
	
	
	List<ShippedInfo> queryList(ShippedInfoReqDto reqDto );
	

}
