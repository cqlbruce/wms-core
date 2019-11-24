package com.hht.wms.core.service;

import com.hht.wms.core.dto.CustInfoQueryReqDto;
import com.hht.wms.core.dto.CustInfoQueryRespDto;
import com.hht.wms.core.entity.CustInfo;

public interface CustInfoService {
	
	int add(CustInfo custInfo) throws Exception;
	
	CustInfoQueryRespDto queryByPage(CustInfoQueryReqDto reqDto );
	
	CustInfoQueryRespDto queryList(CustInfoQueryReqDto reqDto );
	
	int modify(CustInfo reqDto) ;
	
	int delete(String custId);
	
}
