package com.hht.wms.core.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hht.wms.core.dao.FrontDeskChargeDao;
import com.hht.wms.core.dto.FrontDeskChargeQueryReqDto;
import com.hht.wms.core.dto.FrontDeskChargeQueryRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.FrontDeskChargeService;

@Service
public class FrontDeskChargeServiceImpl extends ServiceImpl<FrontDeskChargeDao, FrontDeskCharge> implements FrontDeskChargeService{
	private static Logger logger = LoggerFactory.getLogger(FrontDeskChargeServiceImpl.class) ; 

	
	@Autowired
	private FrontDeskChargeDao frontDeskChargeMapper ; 
	

	
	public FrontDeskCharge selectByInboundNo(FrontDeskChargeQueryReqDto reqDto) {
		return baseMapper.selectByInboundNo(reqDto);
	}
	
	
	
	@Override
	public int add(FrontDeskCharge reqDto) {
		return baseMapper.insert(reqDto) ;
	}

	@Override
	public FrontDeskChargeQueryRespDto queryByPage(FrontDeskChargeQueryReqDto reqDto) {
		logger.info("FrontDeskChargeServiceImpl ---query--reqDto---{}",JSON.toJSON(reqDto));
		FrontDeskChargeQueryRespDto respDto = new FrontDeskChargeQueryRespDto();
		int total = frontDeskChargeMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<FrontDeskCharge> list = frontDeskChargeMapper.queryByPage(reqDto);
		respDto.setItems(list);
		return respDto ;		
	}
	
	
	
	
	public int updateByInboundNo(StockInfo info) throws Exception{
		
		if(StringUtils.isEmpty(info.getInboundNo())) {
			logger.error("入仓编号为空，无法更新前台收费信息");
			throw new Exception("入仓编号为空，无法更新前台收费信息");
		}
		
		FrontDeskChargeQueryReqDto reqDto = new FrontDeskChargeQueryReqDto();
		reqDto.setInboundNo(info.getInboundNo());
		FrontDeskCharge charge = baseMapper.selectByInboundNo(reqDto);
		
		if(null == charge) {
			logger.error("对应入仓编号{}的前台收费信息为空，不做更新",info.getInboundNo());
			return 0  ; 
//			throw new Exception("对应入仓编号的前台收费信息为空，更新失败");
		}
		charge.setCustId(info.getCustId());
		charge.setSo(info.getSo());
//		charge.setCarNum(info.set);
//		frontDeskChargeMapper.updateByPrimaryKeySelective(charge);
		return baseMapper.updateById(charge);
	}

	@Override
	public int update(FrontDeskCharge reqDto) {
		return baseMapper.updateById(reqDto);
	}

	@Override
	public int delete(String id) {
		return baseMapper.deleteById(id);
	}

	@Override
	public FrontDeskChargeQueryRespDto queryList(FrontDeskChargeQueryReqDto reqDto) {
		FrontDeskChargeQueryRespDto respDto = new FrontDeskChargeQueryRespDto();
		List<FrontDeskCharge> items = baseMapper.queryList(reqDto) ;
		respDto.setItems(items);
		return respDto;
	}



	@Override
	public FrontDeskCharge selectById(String id) {
		return baseMapper.selectById(id);
	}

}
