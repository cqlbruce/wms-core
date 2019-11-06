package com.hht.wms.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.CustInfoQueryReqDto;
import com.hht.wms.core.dto.CustInfoQueryRespDto;
import com.hht.wms.core.entity.CustInfo;
import com.hht.wms.core.service.CustInfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping("/cust/")
public class CustInfoController {
	
	private static Logger logger = LoggerFactory.getLogger(CustInfoController.class) ; 

	@Autowired
	private CustInfoService custInfoService ;
	
	@SuppressWarnings("unchecked")
	@PostMapping("add")
    @ApiOperation(value = "客户项目信息新增", notes = "")
	public Resp addCust(@RequestBody CustInfo reqDto) throws Exception{
 		logger.info("...addCust..............{}",JSON.toJSON(reqDto) );
 		custInfoService.add(reqDto);
		return Resp.success("客户项目信息新增成功");
    }	
	
	
	@SuppressWarnings("unchecked")
	@PostMapping("query")
    @ApiOperation(value = "客户项目信息查询", notes = "")
	public Resp<CustInfoQueryRespDto> query(@RequestBody CustInfoQueryReqDto reqDto) {
		
		CustInfoQueryRespDto respDto = custInfoService.queryList(reqDto);
//		CustInfoQueryRespDto respDto = new CustInfoQueryRespDto();
//		respDto.setTotal(2);
//		List<CustInfo> items = new ArrayList<CustInfo>() ;
//		CustInfo ci = new CustInfo();
//		ci.setId("asdf");
//		ci.setProjectId("asdf");
//		ci.setProjectName("asdfas");
//		items.add(ci);
//		respDto.setItems(items);
		return Resp.success("查询前台收费成功" , respDto );
	}	
	
	
	
}
