package com.hht.wms.core.service;

import java.util.List;

import com.hht.wms.core.dto.ShippedAbstractQueryReqDto;
import com.hht.wms.core.dto.ShippedAbstractQueryRespDto;
import com.hht.wms.core.entity.ShippedAbstractInfo;

public interface ShippedAbstractService {
	
	
	
	ShippedAbstractQueryRespDto queryList(ShippedAbstractQueryReqDto reqDto);
	
	void addByShipped(List<ShippedAbstractInfo> info);
	
	List<ShippedAbstractInfo> selectByClp(String clp) ; 
	

	

}
