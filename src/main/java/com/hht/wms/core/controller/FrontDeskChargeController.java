package com.hht.wms.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hht.wms.core.common.Resp;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.FrontDeskChargeService;
import com.hht.wms.core.util.DateUtil;
import com.hht.wms.core.util.SnowFlakeUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/charge/")
@CrossOrigin 
public class FrontDeskChargeController {
	
	@Autowired
	private FrontDeskChargeService frontDeskChargeService ; 
	
	
	@SuppressWarnings("unchecked")
	@PostMapping("add")
    @ApiOperation(value = "新增前台收费", notes = "")
	public Resp<?> add(@RequestBody FrontDeskCharge reqDto) {
		//页面需输入   入仓号 代收款合计  支付方式  收据编码  一车几单
		
		reqDto.setTranDate(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
		reqDto.setId(SnowFlakeUtil.getNewNextId());
		
		return Resp.success("新增前台收费成功");

	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("query")
    @ApiOperation(value = "查询前台收费", notes = "")
	public Resp<FrontDeskCharge> query(@RequestBody StockInfo reqDto) {
		
		
		
		
		
		return Resp.success("查询前台收费成功" , null );

	}
	

}
