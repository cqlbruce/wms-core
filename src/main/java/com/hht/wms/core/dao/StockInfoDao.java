package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockStatisticsRespDto;
import com.hht.wms.core.dto.vo.StockInfoVo;
import com.hht.wms.core.dto.vo.ThreeElement;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.util.BaseDao;

public interface StockInfoDao extends BaseDao<StockInfo>{
    
    List<StockInfoVo> queryByPage(StockInfoQueryReqDto reqDto);
    
    List<StockInfoVo> queryList(StockInfoQueryReqDto reqDto);
    
    int selectCount(StockInfoQueryReqDto reqDto);
    
    List<StockInfo> queryByThreeElemet(ThreeElement te);
    
    List<StockInfo> selectByInboundNoList(List<String> inboundNoList);
    
    StockStatisticsRespDto stockStatics(String date);
    
    StockStatisticsRespDto currentMonthStatics(String month);
    
    int deleteByInboundNo(String inboundNo);
    
}