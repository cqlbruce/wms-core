package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.CustInfoQueryReqDto;
import com.hht.wms.core.entity.CustInfo;
import com.hht.wms.core.util.BaseDao;

public interface CustInfoDao extends BaseDao<CustInfo>{
	
	
    List<CustInfo> queryList(CustInfoQueryReqDto reqDto);
    
    int selectCount(CustInfoQueryReqDto reqDto);
	
	
}

