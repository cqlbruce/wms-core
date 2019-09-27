package com.hht.wms.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hht.wms.core.dao.ShippedInfoMapper;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.service.ShippedInfoService;

@Service
public class ShippedInfoServiceImpl implements ShippedInfoService{

	
	
	@Autowired
	private ShippedInfoMapper shippedInfoMapper ; 
	
	@Override
	public List<ShippedInfo> queryList(ShippedInfoReqDto reqDto) {
		
		shippedInfoMapper

		return null;
	}

}
