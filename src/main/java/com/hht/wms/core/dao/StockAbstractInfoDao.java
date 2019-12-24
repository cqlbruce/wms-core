package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.StockAbstractQueryReqDto;
import com.hht.wms.core.entity.StockAbstractInfo;
import com.hht.wms.core.util.BaseDao;

public interface StockAbstractInfoDao extends BaseDao<StockAbstractInfo >{
	
	
    int selectCount(StockAbstractQueryReqDto reqDto) ;
    
	   //    自定义
    List<StockAbstractInfo> queryList(StockAbstractQueryReqDto reqDto) ;
    
    
    int selectCountUnitSo(StockAbstractQueryReqDto reqDto) ;
    
	   //    自定义
    List<StockAbstractInfo> queryListUnitSo(StockAbstractQueryReqDto reqDto) ;    
    
    void insertOrUpdate(List<StockAbstractInfo> list);
    
}
