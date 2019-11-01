package com.hht.wms.core.service;

import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.entity.CustInfo;

public interface StockAbstractService {
	
	
	
	int add(CustInfo custInfo) throws Exception;

	
	ShippedInfoRespDto queryList(ShippedInfoReqDto reqDto );

	

}
