package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedStatisticsRespDto;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.util.BaseDao;

public interface ShippedInfoDao extends BaseDao<ShippedInfo>{
    
    //自定义
    List<ShippedInfo> queryList(ShippedInfoReqDto reqDto) ;
    
    int selectCount(ShippedInfoReqDto reqDto) ;
    
    List<ShippedInfo> queryListByClp(String clp);
    
    void batchUpdate(List<ShippedInfo> list);
    
    ShippedStatisticsRespDto shippedStatics(String shippedDate);

}