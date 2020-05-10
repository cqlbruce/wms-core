package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.ShippedFeeQueryReqDto;
import com.hht.wms.core.dto.StockFeeQueryReqDto;
import com.hht.wms.core.dto.vo.ShippedFee;
import com.hht.wms.core.dto.vo.StockFee;

public interface FeeInfoDao {
	
    List<StockFee> stockFeeQueryByPage(StockFeeQueryReqDto reqDto);
    
    int stockFeeSelectCount(StockFeeQueryReqDto reqDto);

    List<ShippedFee> shippedFeeQueryByPage(ShippedFeeQueryReqDto reqDto);
    
    int shippedFeeSelectCount(ShippedFeeQueryReqDto reqDto);
    
    
    List<StockFee> stockFeeQueryList(StockFeeQueryReqDto reqDto);

    List<ShippedFee> shippedFeeQueryList(ShippedFeeQueryReqDto reqDto);


}
