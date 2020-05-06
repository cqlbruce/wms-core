package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.entity.StockFeeInfo;
import com.hht.wms.core.util.BaseDao;

public interface StockFeeInfoDao extends BaseDao<StockFeeInfo>{
	
	
    void insertOrUpdate(List<StockFeeInfo> list);

	

}
