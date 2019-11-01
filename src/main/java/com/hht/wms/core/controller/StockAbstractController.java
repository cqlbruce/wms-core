package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.CustInfoQueryReqDto;
import com.hht.wms.core.dto.CustInfoQueryRespDto;
import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.StockInfoModifyReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.ExcelUtil;
import com.hht.wms.core.util.NumberUtil;
import com.hht.wms.core.util.SnowFlakeUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/stock/abstract/")
@CrossOrigin 
public class StockAbstractController {
	private static Logger logger = LoggerFactory.getLogger(StockAbstractController.class) ; 
	
	@Autowired
	private StockInfoService stockInfoService ; 

	
	@SuppressWarnings("unchecked")
	@PostMapping("query")
    @ApiOperation(value = "客户项目信息查询", notes = "")
	public Resp<CustInfoQueryRespDto> query(@RequestBody CustInfoQueryReqDto reqDto) {
		
		CustInfoQueryRespDto respDto = custInfoService.queryList(reqDto);
		
		return Resp.success("查询前台收费成功" , respDto );
	}	
	
	

}
