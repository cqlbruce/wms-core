package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.StockAbstractQueryReqDto;
import com.hht.wms.core.entity.ShippedAbstractInfo;
import com.hht.wms.core.util.BaseDao;

public interface ShippedAbstractInfoDao  extends BaseDao<ShippedAbstractInfo > {
	
    int selectCount(StockAbstractQueryReqDto reqDto) ;
    
	   //    自定义
    List<ShippedAbstractInfo> queryList(StockAbstractQueryReqDto reqDto) ;
    
    void insertOrUpdate(List<ShippedAbstractInfo> list);

}
