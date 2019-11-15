package com.hht.wms.core.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hht.wms.core.dao.CustInfoDao;
import com.hht.wms.core.dto.CustInfoQueryReqDto;
import com.hht.wms.core.dto.CustInfoQueryRespDto;
import com.hht.wms.core.entity.CustInfo;
import com.hht.wms.core.service.CustInfoService;
import com.hht.wms.core.util.SnowFlakeUtil;

@Service
public class CustInfoServiceImpl extends ServiceImpl<CustInfoDao, CustInfo> implements CustInfoService{
	private static Logger logger = LoggerFactory.getLogger(CustInfoServiceImpl.class) ; 

	@Autowired
	private CustInfoDao custInfoDao ; 
	
	@Override
	public int add(CustInfo custInfo) throws Exception {
		custInfo.setId(SnowFlakeUtil.getNewNextId());
		custInfo.setCustId(SnowFlakeUtil.getNewNextId());
		custInfo.setProjectId(SnowFlakeUtil.getNewNextId());
		return baseMapper.insert(custInfo);
	}

	@Override
	public CustInfoQueryRespDto queryByPage(CustInfoQueryReqDto reqDto) {
		logger.info("CustInfoServiceImpl ---queryinfo-----{}",JSON.toJSON(reqDto));
		CustInfoQueryRespDto respDto = new CustInfoQueryRespDto();
		int total = custInfoDao.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<CustInfo> list =  custInfoDao.queryList(reqDto);
		respDto.setItems(list);
		return respDto ;
	}
	
	

	@Override
	public int modify(CustInfo reqDto) {
		return baseMapper.updateById(reqDto);
	}
	
	@Override
	public int delete(String custId) {
		return baseMapper.deleteById(custId);
	}

	@Override
	public CustInfoQueryRespDto queryList(CustInfoQueryReqDto reqDto) {
		CustInfoQueryRespDto respDto = new CustInfoQueryRespDto();
		List<CustInfo> list =  custInfoDao.queryList(reqDto);
		respDto.setItems(list);
		return respDto ;
	}
}
