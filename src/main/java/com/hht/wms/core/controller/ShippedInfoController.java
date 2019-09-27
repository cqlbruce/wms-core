package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.entity.ShippedInfo;
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
 	 	List<ShippedInfo> sList = shippedInfoService.queryList(reqDto) ;
 		ShippedInfoRespDto respDto = new ShippedInfoRespDto();
 	 	if(CollectionUtils.isEmpty(sList)) {
 	 		respDto.setTotal(0);
 	 	}else {
 	 		respDto.setTotal(sList.size());
 	 		respDto.setItems(sList);
 	 	}
		return Resp.success("出仓数据查询成功" , respDto);
    }

	
}
