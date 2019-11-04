package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.ShippedAbstractQueryReqDto;
import com.hht.wms.core.entity.ShippedAbstractInfo;
import com.hht.wms.core.util.BaseDao;

public interface ShippedAbstractInfoDao  extends BaseDao<ShippedAbstractInfo > {
	
    int selectCount(ShippedAbstractQueryReqDto reqDto) ;
    
	   //    自定义
    List<ShippedAbstractInfo> queryList(ShippedAbstractQueryReqDto reqDto) ;
    
    void insertOrUpdate(List<ShippedAbstractInfo> list);

}
