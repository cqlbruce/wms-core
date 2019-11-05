package com.hht.wms.core.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.FrontDeskChargeAddReqDto;
import com.hht.wms.core.dto.FrontDeskChargeDetail;
import com.hht.wms.core.dto.FrontDeskChargeQueryReqDto;
import com.hht.wms.core.dto.FrontDeskChargeQueryRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.service.FrontDeskChargeService;
import com.hht.wms.core.util.DateUtil;
import com.hht.wms.core.util.SnowFlakeUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/charge/")
@CrossOrigin 
public class FrontDeskChargeController {
	
	private static Logger logger = LoggerFactory.getLogger(FrontDeskChargeController.class) ; 

	
	@Autowired
	private FrontDeskChargeService frontDeskChargeService ; 
	
	
	@PostMapping("add")
    @ApiOperation(value = "新增前台收费", notes = "")
	public Resp<?> add(@RequestBody FrontDeskChargeAddReqDto reqDto) {
 		logger.info("---FrontDeskChargeAddReqDto..............{}",JSON.toJSON(reqDto) );
		//页面需输入   入仓号 代收款合计  支付方式  收据编码  一车几单
		List<FrontDeskChargeDetail> detailList = reqDto.getItems() ; 
		FrontDeskCharge fdc = new FrontDeskCharge();
		BeanUtils.copyProperties(reqDto, fdc);
		fdc.setTranDate(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
		for(FrontDeskChargeDetail detail : detailList) {
			fdc.setId(SnowFlakeUtil.getNewNextId());
			BeanUtils.copyProperties(detail, fdc);
			frontDeskChargeService.add(fdc);
		}
		return Resp.success("新增前台收费成功");
	}
	
	
	@SuppressWarnings("unchecked")
	@PostMapping("query")
    @ApiOperation(value = "查询前台收费", notes = "")
	public Resp<FrontDeskChargeQueryRespDto> query(@RequestBody FrontDeskChargeQueryReqDto reqDto) {
		
		FrontDeskChargeQueryRespDto respDto = frontDeskChargeService.query(reqDto);
		return Resp.success("查询前台收费成功" , respDto );
	}
	

}
