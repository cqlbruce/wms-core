package com.hht.wms.core.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.dao.FeeInfoDao;
import com.hht.wms.core.dto.ShippedFeeQueryReqDto;
import com.hht.wms.core.dto.ShippedFeeQueryRespDto;
import com.hht.wms.core.dto.StockFeeQueryReqDto;
import com.hht.wms.core.dto.StockFeeQueryRespDto;
import com.hht.wms.core.dto.vo.ShippedFee;
import com.hht.wms.core.dto.vo.StockFee;
import com.hht.wms.core.service.FeeInfoService;

@Service
public class FeeInfoServiceImpl  implements FeeInfoService {
	
	
	private Logger logger = LoggerFactory.getLogger(FeeInfoServiceImpl.class);
	
	@Autowired
	private FeeInfoDao feeInfoDao ;
	

	@Override
	public StockFeeQueryRespDto stockFeeInfoQueryByPage(StockFeeQueryReqDto reqDto) {
		logger.info("FeeInfoServiceImpl ---stockFeeInfoQueryByPage--reqDto---{}",JSON.toJSON(reqDto));
		StockFeeQueryRespDto respDto = new StockFeeQueryRespDto();
		int total = feeInfoDao.stockFeeSelectCount(reqDto);
		if(total == 0 ) {
			respDto.setTotal(0);
			return respDto ; 
		}
		int beginSize = (reqDto.getPage()-1)*reqDto.getSize();
		reqDto.setBeginSize(beginSize);
		List<StockFee> list = feeInfoDao.stockFeeQueryByPage(reqDto);
		respDto.setItems(list);
		respDto.setTotal(total);
		return respDto ; 
	}


	@Override
	public ShippedFeeQueryRespDto shippedFeeInfoQueryByPage(ShippedFeeQueryReqDto reqDto) {
		
		logger.info("FeeInfoServiceImpl ---shippedFeeInfoQueryByPage--reqDto---{}",JSON.toJSON(reqDto));
		ShippedFeeQueryRespDto respDto = new ShippedFeeQueryRespDto();
		int total = feeInfoDao.shippedFeeSelectCount(reqDto);
		if(total == 0 ) {
			respDto.setTotal(0);
			return respDto ; 
		}
		int beginSize = (reqDto.getPage()-1)*reqDto.getSize();
		reqDto.setBeginSize(beginSize);
		List<ShippedFee> list = feeInfoDao.shippedFeeQueryByPage(reqDto);
		respDto.setItems(list);
		respDto.setTotal(total);
		return respDto ; 		
		
	}


	@Override
	public List<StockFee> stockFeeInfoQueryList(StockFeeQueryReqDto reqDto) {
		logger.info("FeeInfoServiceImpl ---stockFeeInfoQueryList--reqDto---{}",JSON.toJSON(reqDto));
		List<StockFee> list = feeInfoDao.stockFeeQueryList(reqDto);
		return list;
	}


	@Override
	public List<ShippedFee> shippedFeeInfoQueryList(ShippedFeeQueryReqDto reqDto) {
		logger.info("FeeInfoServiceImpl ---shippedFeeInfoQueryList--reqDto---{}",JSON.toJSON(reqDto));
		List<ShippedFee> list = feeInfoDao.shippedFeeQueryList(reqDto);
		return list;
	}
	
	
	
	
	

}