package com.hht.wms.core.service;

import java.util.List;

import com.hht.wms.core.dto.StockInfoModifyReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.dto.StockStatisticsRespDto;
import com.hht.wms.core.dto.vo.StockInfoVo;
import com.hht.wms.core.entity.StockInfo;

public interface StockInfoService {
	
	StockInfoRespDto loadStock(StockInfoQueryReqDto reqDto);
	
	int addStock(List<StockInfo> stockInfoList) throws Exception;
	
	int updateStock(StockInfo info);
	
	List<StockInfo> queryByThreeElemet(String so , String po , String item);
	
	int modify(StockInfoModifyReqDto reqDto) ;
	
	void deleteById(String id);

    StockStatisticsRespDto stockStatics(String date);

    int deleteByInboundNo(String inboundNo);
    
    List<StockInfoVo> queryList(StockInfoQueryReqDto reqDto);
    
	StockStatisticsRespDto currentMonthStatics(String month);

}
