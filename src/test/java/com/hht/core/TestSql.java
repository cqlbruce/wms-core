package com.hht.core;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.dao.ShippedInfoDao;
import com.hht.wms.core.dao.StockInfoDao;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.service.ShippedInfoService;

public class TestSql extends TestBase{
	private static Logger logger = LoggerFactory.getLogger(TestSql.class) ;
	
    @Autowired 
	private StockInfoDao mapper ; 
    
    @Autowired
    private ShippedInfoService shippedInfoService ;
    
    @Autowired
    private ShippedInfoDao shippedInfoMapper ; 
	
	@Test
	public void test() {
//		StockInfoQueryReqDto reqDto = new StockInfoQueryReqDto();
//		System.out.println(mapper.queryList(reqDto));
//		System.out.println(mapper.selectCount(reqDto));
		ShippedInfoReqDto reqDto = new ShippedInfoReqDto();
		reqDto.setPo("");
		reqDto.setEndDate("2019-06-10");
		reqDto.setBeginDate("2019-06-03");
		reqDto.setSo("");
//		reqDto.setLimit(10);	
		reqDto.setPage(2);
		reqDto.setBeginSize(1);
		reqDto.setSize(2);
		
		int i = shippedInfoMapper.selectCount(reqDto);
		System.out.println("i ======= " + i);
//		List<ShippedInfo> list = shippedInfoService.queryList(reqDto);
//		logger.info("shippedInfo ========== {}" , JSON.toJSON(list));
		
	}

}
