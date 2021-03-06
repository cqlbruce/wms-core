package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.List;

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

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.FrontDeskChargeAddReqDto;
import com.hht.wms.core.dto.FrontDeskChargeDetail;
import com.hht.wms.core.dto.FrontDeskChargeQueryReqDto;
import com.hht.wms.core.dto.FrontDeskChargeQueryRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.service.FrontDeskChargeService;
import com.hht.wms.core.util.DateUtil;
import com.hht.wms.core.util.NumberUtil;
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
 		logger.info("...FrontDeskChargeAddReqDto..............{}",JSON.toJSON(reqDto) );
		//页面需输入   入仓号 代收款合计  支付方式  收据编码  一车几单
		List<FrontDeskChargeDetail> detailList = reqDto.getItems() ; 
		FrontDeskCharge fdc = new FrontDeskCharge();
		BeanUtils.copyProperties(reqDto, fdc);
		fdc.setTranDate(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
		int i = 0 ; 
		for(FrontDeskChargeDetail detail : detailList) {
			fdc.setId(SnowFlakeUtil.getNewNextId());
			BeanUtils.copyProperties(detail, fdc);
			fdc.setFeeTotal(NumberUtil.getBigDecimal(reqDto.getEnterGateFee()).add(reqDto.getCustomsDeclarationFee()));
			if(0!=i) {
				fdc.setEnterGateFee(BigDecimal.ZERO);
				fdc.setFeeTotal(BigDecimal.ZERO);
				fdc.setRecAmt(BigDecimal.ZERO);
				fdc.setCustomsDeclarationFee(BigDecimal.ZERO);
			}			
			frontDeskChargeService.add(fdc);
			i++ ; 
		}
		return Resp.success("新增前台收费成功");
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("export")
    @ApiOperation(value = "前台收费导出", notes = "")
	public Resp<FrontDeskChargeQueryRespDto> export(@RequestBody FrontDeskChargeQueryReqDto reqDto) {
		FrontDeskChargeQueryRespDto respDto = frontDeskChargeService.query(reqDto);
		return Resp.success("查询前台收费成功" , respDto );
	}
	
	
	
	@SuppressWarnings("unchecked")
	@PostMapping("query")
    @ApiOperation(value = "查询前台收费", notes = "")
	public Resp<FrontDeskChargeQueryRespDto> query(@RequestBody FrontDeskChargeQueryReqDto reqDto) {
		FrontDeskChargeQueryRespDto respDto = frontDeskChargeService.queryByPage(reqDto);
		return Resp.success("查询前台收费成功" , respDto );
	}
	

	@SuppressWarnings("rawtypes")
	@PostMapping("update")
    @ApiOperation(value = "修改前台收费", notes = "")
	public Resp update(@RequestBody FrontDeskCharge reqDto) {
		frontDeskChargeService.update(reqDto);
		return Resp.success("修改前台收费成功" );
		
	}
	

	@SuppressWarnings("rawtypes")
	@PostMapping("delete")
    @ApiOperation(value = "删除前台收费", notes = "")
	public Resp delete(@RequestParam("id") String id) {
		frontDeskChargeService.delete(id);
		return Resp.success("删除前台收费成功");
	}

}
