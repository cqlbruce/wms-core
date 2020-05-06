package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.ShippedFeeQueryReqDto;
import com.hht.wms.core.dto.StockFeeQueryReqDto;
import com.hht.wms.core.dto.vo.ShippedFee;
import com.hht.wms.core.dto.vo.StockFee;

public interface FeeInfoDao{
	
	
	
    List<StockFee> StockFeeQueryList(StockFeeQueryReqDto reqDto);

    List<ShippedFee> ShippedFeeQueryList(ShippedFeeQueryReqDto reqDto);

}
