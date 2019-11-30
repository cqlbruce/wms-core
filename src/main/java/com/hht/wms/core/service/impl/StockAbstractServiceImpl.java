package com.hht.wms.core.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hht.wms.core.common.Constant;
import com.hht.wms.core.dao.StockAbstractInfoDao;
import com.hht.wms.core.dao.StockInfoDao;
import com.hht.wms.core.dto.StockAbstractQueryReqDto;
import com.hht.wms.core.dto.StockAbstractQueryRespDto;
import com.hht.wms.core.entity.StockAbstractInfo;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.StockAbstractService;

@Service
public class StockAbstractServiceImpl extends ServiceImpl<StockAbstractInfoDao, StockAbstractInfo> implements StockAbstractService{
	
	private static Logger logger = LoggerFactory.getLogger(StockAbstractServiceImpl.class); 

	@Autowired
	private StockInfoDao stockInfoMapper ; 
	
	@Override
	public int add(StockAbstractInfo stockAbstractInfo) throws Exception {
		return baseMapper.insert(stockAbstractInfo) ; 
	}
	

	@Override
	public StockAbstractQueryRespDto queryList(StockAbstractQueryReqDto reqDto) {
		logger.info("---StockAbstractServiceImpl ---queryList-----{}",JSON.toJSON(reqDto));
		StockAbstractQueryRespDto respDto = new StockAbstractQueryRespDto();
		int total = baseMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<StockAbstractInfo> list =  baseMapper.queryList(reqDto);
		if(CollectionUtils.isEmpty(list)) {
			return respDto ;
		}
		
		List<String> inboundNoList = new ArrayList<String>();
		for(StockAbstractInfo sai : list) {
			if(StringUtils.isNotEmpty(sai.getInboundNo())) {
				inboundNoList.add(sai.getInboundNo());
			}
		}
		//获取对应入仓单号 库存信息
		List<StockInfo> siList = stockInfoMapper.selectByInboundNoList(inboundNoList) ; 
		if(CollectionUtils.isEmpty(siList)) {
			respDto.setItems(list);
			respDto.setTotal(list.size());
			return respDto ;
		}		
		//加工数据结构
		Map<String,List<StockInfo>> map = new HashMap<String,List<StockInfo>>();
		for(StockInfo si : siList) {
			List<StockInfo> tempList = map.get(si.getInboundNo());
			if(CollectionUtils.isNotEmpty(tempList)) {
				tempList.add(si);
				continue;
			}
			tempList = new ArrayList<StockInfo>();
			tempList.add(si);
		}
		
		//设置根据明细设置 总批次状态
		for(StockAbstractInfo sai : list) {
			List<StockInfo> tempList = map.get(sai.getInboundNo());
			if(CollectionUtils.isEmpty(tempList)) {
				sai.setStatus(Constant.INBOUND_STATUS_READY );
				continue ; 
			}
			String status = Constant.INBOUND_STATUS_FINISH;
			// status 0 登记  1 已入库
			for(StockInfo si : tempList) {
				if(Constant.INBOUND_STATUS_READY.equals(si.getStatus())||StringUtils.isEmpty(si.getStatus())) {
					status = Constant.INBOUND_STATUS_READY ; 
					break ; 
				}
			}
			sai.setStatus(status);
		}
		respDto.setItems(list);
		return respDto ;
	}

	
}
