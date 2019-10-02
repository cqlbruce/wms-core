package com.hht.wms.core.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.dao.ShippedInfoMapper;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.service.ShippedInfoService;

@Service
public class ShippedInfoServiceImpl implements ShippedInfoService{

	private static Logger logger = LoggerFactory.getLogger(ShippedInfoServiceImpl.class) ; 

	
	@Autowired
	private ShippedInfoMapper shippedInfoMapper ; 
	
	@Override
	public ShippedInfoRespDto queryList(ShippedInfoReqDto reqDto) {
		logger.info("ShippedInfoServiceImpl ---reqDto-----{}",JSON.toJSON(reqDto));
		ShippedInfoRespDto respDto = new ShippedInfoRespDto();
		int total = shippedInfoMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<ShippedInfo> list =  shippedInfoMapper.queryList(reqDto);
		respDto.setItems(list);
		return respDto ;
	}

}
