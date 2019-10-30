package com.hht.wms.core.service;

import com.hht.wms.core.dto.CustInfoQueryReqDto;
import com.hht.wms.core.dto.CustInfoQueryRespDto;
import com.hht.wms.core.entity.CustInfo;

public interface CustInfoService {
	
	int add(CustInfo custInfo) throws Exception;
	
	CustInfoQueryRespDto queryList(CustInfoQueryReqDto reqDto );


}
