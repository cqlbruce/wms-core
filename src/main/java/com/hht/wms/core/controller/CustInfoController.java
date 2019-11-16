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
import com.hht.wms.core.dto.IdReqDto;
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
	
	@SuppressWarnings("rawtypes")
	@PostMapping("add")
    @ApiOperation(value = "客户项目信息新增", notes = "")
	public Resp addCust(@RequestBody CustInfo reqDto) throws Exception{
 		logger.info("...addCust..............{}",JSON.toJSON(reqDto) );
 		custInfoService.add(reqDto);
		return Resp.success("客户项目信息新增成功");
    }	
	
	@SuppressWarnings("unchecked")
	@PostMapping("query")
    @ApiOperation(value = "客户信息查询", notes = "")
	public Resp<CustInfoQueryRespDto> query(@RequestBody CustInfoQueryReqDto reqDto) {
 		logger.info("....custInfoController....query......{}",JSON.toJSON(reqDto) );
 		CustInfoQueryRespDto respDto = null ; 
 		if(0==reqDto.getSize()) {
 			respDto = custInfoService.queryList(reqDto);
 		}else {
 			respDto = custInfoService.queryByPage(reqDto);
 		}
 		
		return Resp.success("客户项目信息查询成功" , respDto );
	}		
	
	
	@SuppressWarnings("rawtypes")
	@PostMapping("update")
    @ApiOperation(value = "客户项目信息修改", notes = "")
	public Resp update(@RequestBody CustInfo reqDto) throws Exception{
 		logger.info("...modify..............{}",JSON.toJSON(reqDto) );
 		custInfoService.modify(reqDto);
		return Resp.success("客户项目信息修改成功");
    }	
	
	@SuppressWarnings("rawtypes")
	@PostMapping("delete")
    @ApiOperation(value = "客户项目信息删除", notes = "")
	public Resp delete(@RequestBody IdReqDto reqDto) throws Exception{
 		logger.info("...delete..............{}",JSON.toJSON(reqDto.getId()));
 		custInfoService.delete(reqDto.getId());
		return Resp.success("客户项目信息删除成功");
    }	
	
}
