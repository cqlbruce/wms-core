package com.hht.wms.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.StockAbstractQueryReqDto;
import com.hht.wms.core.dto.StockAbstractQueryRespDto;
import com.hht.wms.core.service.StockAbstractService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/stock/abstract/")
@CrossOrigin 
public class StockAbstractController {
	private static Logger logger = LoggerFactory.getLogger(StockAbstractController.class) ; 
	
	@Autowired
	private StockAbstractService stockAbstractService ; 

	
	@SuppressWarnings("unchecked")
	@PostMapping("query")
    @ApiOperation(value = "客户项目信息查询", notes = "")
	public Resp<StockAbstractQueryRespDto> query(@RequestBody StockAbstractQueryReqDto reqDto) {
		
		logger.info("-----StockAbstractController---query--req--{}",reqDto);
		
		StockAbstractQueryRespDto respDto = stockAbstractService.queryList(reqDto);
		
		return Resp.success("查询前台收费成功" , respDto );
	}	
	
	

}
