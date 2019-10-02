package com.hht.wms.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.ShippedInfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/shipped/")
@CrossOrigin 
public class ShippedInfoController {
	
	private static Logger logger = LoggerFactory.getLogger(ShippedInfoController.class) ; 

	@Autowired
	private ShippedInfoService shippedInfoService ; 
	
	@SuppressWarnings("unchecked")
	@PostMapping("load")
    @ApiOperation(value = "出仓数据", notes = "")
	public Resp<ShippedInfoRespDto> shippedInfoQuery(@RequestBody ShippedInfoReqDto reqDto) {
 		logger.info("shippedInfoQuery..............{}",JSON.toJSON(reqDto) );
		return Resp.success("出仓数据查询成功" , shippedInfoService.queryList(reqDto));
    }

	
	@PostMapping("/upload")
    @ApiOperation(value = "导入excl,批量出仓", notes = "")
	public Resp fileUploadShipped(@RequestParam("excelFile") MultipartFile excelFile)  throws Exception {
	    String fileName = excelFile.getOriginalFilename();
 		logger.info("...fileUploadShipped...............{}",fileName );
		if(excelFile.isEmpty()) {
			return Resp.fail("文件为空");
		}
		List<StockInfo> stockInfoList = new ArrayList<StockInfo>();
		Workbook wb  = new XSSFWorkbook(excelFile.getInputStream());   
		try{
			Sheet ss = wb.getSheetAt(0);
			
			
		}finally{
			wb.close();
		}
		return Resp.success("uploadStock");
	}
	
	
}
