package com.hht.wms.core.service;

import java.util.List;

import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.dto.ShippedStatisticsRespDto;
import com.hht.wms.core.dto.vo.ShippedInfoVo;
import com.hht.wms.core.entity.ShippedInfo;

public interface ShippedInfoService {
	
	ShippedInfoRespDto queryByPage(ShippedInfoReqDto reqDto );
	
	List<ShippedInfoVo> queryList(ShippedInfoReqDto reqDto );
	
	int outbound(OutboundReqDto reqDto) throws Exception;
	
	List<ShippedInfo> queryListByClp(String clp);
	
	void batchUpdate(List<ShippedInfo> list); 
	
    ShippedStatisticsRespDto shippedStatics(String shippedDate);

	
}
