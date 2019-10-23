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
import com.hht.wms.core.dto.FrontDeskChargeReqDto;
import com.hht.wms.core.dto.FrontDeskChargeRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.FrontDeskChargeService;

@Service
public class FrontDeskChargeServiceImpl extends ServiceImpl<FrontDeskChargeDao, FrontDeskCharge> implements FrontDeskChargeService{
	private static Logger logger = LoggerFactory.getLogger(FrontDeskChargeServiceImpl.class) ; 

	
	@Autowired
	private FrontDeskChargeDao frontDeskChargeMapper ; 
	

	@Override
	public int add(FrontDeskCharge reqDto) {
		
		return baseMapper.insert(reqDto) ;
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
	
	
	public int updateByInboundNo(StockInfo info) throws Exception{
		
		if(StringUtils.isEmpty(info.getInboundNo())) {
			logger.error("入仓编号为空，无法更新前台收费信息");
			throw new Exception("入仓编号为空，无法更新前台收费信息");
		}
		FrontDeskCharge charge = baseMapper.selectByInboundNo(info.getInboundNo());
		if(null == charge) {
			logger.error("对应入仓编号{}的前台收费信息为空，更新失败",info.getInboundNo());
			throw new Exception("对应入仓编号的前台收费信息为空，更新失败");
		}
		charge.setCustName(info.getSupplierName());
		charge.setSo(info.getSo());
		charge.setFactory(info.getSupplierName());
//		charge.setCarNum(info.set);
//		frontDeskChargeMapper.updateByPrimaryKeySelective(charge);
		return baseMapper.updateById(charge);
	}
	
	
	

}
