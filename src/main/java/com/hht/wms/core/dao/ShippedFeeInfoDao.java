package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.entity.ShippedFeeInfo;
import com.hht.wms.core.util.BaseDao;

public interface ShippedFeeInfoDao extends BaseDao<ShippedFeeInfo>{
	
	
	
    void insertOrUpdate(List<ShippedFeeInfo> list);


}
