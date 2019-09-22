package com.hht.core;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hht.wms.core.dao.StockInfoMapper;
import com.hht.wms.core.dto.StockInfoQueryReqDto;

public class TestSql extends TestBase{
	
	
    @Autowired 
	StockInfoMapper mapper ; 
	
	@Test
	public void test() {
		StockInfoQueryReqDto reqDto = new StockInfoQueryReqDto();
		
		System.out.println(mapper.queryList(reqDto));
//		System.out.println(mapper.selectCount(reqDto));
	}

}
