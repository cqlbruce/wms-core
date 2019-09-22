package com.hht.wms.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hht.wms.core.dao.StockInfoMapper;
import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.StockInfoService;

public class StockInfoServiceImpl implements StockInfoService{
	
	
	@Autowired
	private StockInfoMapper stockInfoMapper ; 

	@Override
	public List<StockInfo> loadStock(StockInfoQueryReqDto reqDto) {
		
		List<StockInfo> stockInfo = stockInfoMapper.queryList(reqDto);
		stockInfoMapper.selectCount(reqDto);
		
		return null;
	}

	@Override
	public int addStock(List<StockInfo> stockInfoList) {
		for(StockInfo info : stockInfoList) {
			stockInfoMapper.insertSelective(info);
		}
		return 0;
	}

	@Override
	public int updateStock(StockInfo stockInfo) {
		
		int i = stockInfoMapper.updateByPrimaryKey(stockInfo);

		return i;
	}

	@Override
	public int outbound(OutboundReqDto reqDto) {
		
		
		
		return 0;
	}

	
	
	
	
}
