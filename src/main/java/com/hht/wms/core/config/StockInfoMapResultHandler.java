package com.hht.wms.core.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

import com.hht.wms.core.entity.StockInfo;

public class StockInfoMapResultHandler implements ResultHandler{
	
	
	private final Map<String , StockInfo> mappedResults = new HashMap<String,StockInfo>();
	

	@Override
	public void handleResult(ResultContext context) {
//		Map<String,Object> paramap = new HashMap<String,Object>();
		StockInfo si = (StockInfo)context.getResultObject();
		String code = si.getInboundNo();
		mappedResults.put(code, si);
	}
	
	public Map<String,StockInfo> getMappedResults(){
		return mappedResults ; 
	}
	

}
