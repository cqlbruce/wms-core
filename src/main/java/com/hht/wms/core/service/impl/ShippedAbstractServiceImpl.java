package com.hht.wms.core.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hht.wms.core.dao.ShippedAbstractInfoDao;
import com.hht.wms.core.dto.ShippedAbstractQueryReqDto;
import com.hht.wms.core.dto.ShippedAbstractQueryRespDto;
import com.hht.wms.core.entity.ShippedAbstractInfo;
import com.hht.wms.core.service.ShippedAbstractService;

public class ShippedAbstractServiceImpl extends ServiceImpl<ShippedAbstractInfoDao, ShippedAbstractInfo> implements ShippedAbstractService{

	private static Logger logger = LoggerFactory.getLogger(ShippedAbstractServiceImpl.class) ; 
	
	
	@Override
	public ShippedAbstractQueryRespDto queryList(ShippedAbstractQueryReqDto reqDto) {
		logger.info("---ShippedAbstractServiceImpl---reqDto---{}---",JSON.toJSON(reqDto));
		ShippedAbstractQueryRespDto respDto = new ShippedAbstractQueryRespDto();
		int total = baseMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<ShippedAbstractInfo> list =  baseMapper.queryList(reqDto);
		respDto.setItems(list);
		return respDto ;		
	}

	
	
}
