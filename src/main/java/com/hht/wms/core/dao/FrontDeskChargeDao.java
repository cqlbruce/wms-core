package com.hht.wms.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hht.wms.core.dto.FrontDeskChargeQueryReqDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.util.BaseDao;

public interface FrontDeskChargeDao extends BaseDao<FrontDeskCharge>{
    
    //    自定义
    List<FrontDeskCharge> queryList(FrontDeskChargeQueryReqDto reqDto) ;
    
    int selectCount(FrontDeskChargeQueryReqDto reqDto) ;
    
    FrontDeskCharge selectByInboundNo(@Param("inboundNo")String inboundNo) ;
    
    List<FrontDeskCharge> queryByPage(FrontDeskChargeQueryReqDto reqDto) ;
   
}