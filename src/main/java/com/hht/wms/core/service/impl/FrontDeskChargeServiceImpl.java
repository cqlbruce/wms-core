package com.hht.wms.core.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.dao.FrontDeskChargeMapper;
import com.hht.wms.core.dto.FrontDeskChargeReqDto;
import com.hht.wms.core.dto.FrontDeskChargeRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.service.FrontDeskChargeService;

public class FrontDeskChargeServiceImpl implements FrontDeskChargeService{
	private static Logger logger = LoggerFactory.getLogger(FrontDeskChargeServiceImpl.class) ; 

	
	@Autowired
	private FrontDeskChargeMapper frontDeskChargeMapper ; 
	

	@Override
	public int add(FrontDeskCharge reqDto) {
		return frontDeskChargeMapper.insertSelective(reqDto);
	}

	@Override
	public FrontDeskChargeRespDto query(FrontDeskChargeReqDto reqDto) {
		logger.info("FrontDeskChargeServiceImpl ---query--reqDto---{}",JSON.toJSON(reqDto));
		FrontDeskChargeRespDto respDto = new FrontDeskChargeRespDto();
		int total = frontDeskChargeMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<FrontDeskCharge> list =  frontDeskChargeMapper.queryList(reqDto);
		respDto.setItems(list);
		return respDto ;		
	}
	
	
	

}
