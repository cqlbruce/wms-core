package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.Date;
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
 		logger.info("stock....load..........{}",JSON.toJSON(reqDto) );
 		ShippedInfo sInfo1 = new ShippedInfo();
 		sInfo1.setPo("0708030310");
 		sInfo1.setSku("44088219");
 		sInfo1.setInboundNo("20190813");
 		sInfo1.setCustomsMeterialNo("Nb07080303");
 		sInfo1.setOriginCountry("中国");
 		sInfo1.setSo("020160");
 		sInfo1.setInboundNo("020160");
 		sInfo1.setCustomsMeterialNo("020160");
 		sInfo1.setShippedOrderDate("020160");
 		sInfo1.setShippedDate("020160");
 		sInfo1.setShippedNo("020160");
 		sInfo1.setWarehousePosition("020160");
 		sInfo1.setShippedCtns(new BigDecimal("80"));
 		sInfo1.setShippedPcs(80);
 		sInfo1.setShippedGw(new BigDecimal("80"));
 		sInfo1.setShippedVolume(new BigDecimal("80"));
 		sInfo1.setCustomsMerchNo("020160");
 		sInfo1.setMerchName("020160");
 		sInfo1.setDeclaCount(80);
 		sInfo1.setDeclaUnit("020160");
 		sInfo1.setDeclaUnitPrice(new BigDecimal("80"));
 		sInfo1.setDeclaTotalPrice(new BigDecimal("80"));
 		sInfo1.setDeclaCurrency("020160");
 		sInfo1.setOriginCountry("020160");
 		sInfo1.setDestCountry("020160");
 		sInfo1.setPieceWeigh(new BigDecimal("80"));
 		sInfo1.setShippedAllWeigh(new BigDecimal("80"));
 		sInfo1.setSupervisionConditions("020160");
 		sInfo1.setCreateTime(new Date());
 		sInfo1.setUpdateTime(new Date());
 		
 	    ShippedInfo sInfo2 = new ShippedInfo();
 	 	sInfo2.setPo("0708030310");
 	 	sInfo2.setSku("44088219");
 	 	sInfo2.setInboundNo("20190813");
 	 	sInfo2.setCustomsMeterialNo("Nb07080303");
 	 	sInfo2.setOriginCountry("中国");
 	 	sInfo2.setSo("020160");
 	 	sInfo2.setInboundNo("020160");
 	 	sInfo2.setCustomsMeterialNo("020160");
 	 	sInfo2.setShippedOrderDate("020160");
 	 	sInfo2.setShippedDate("020160");
 	 	sInfo2.setShippedNo("020160");
 	 	sInfo2.setWarehousePosition("020160");
 	 	sInfo2.setShippedCtns(new BigDecimal("80"));
 	 	sInfo2.setShippedPcs(80);
 	 	sInfo2.setShippedGw(new BigDecimal("80"));
 	 	sInfo2.setShippedVolume(new BigDecimal("80"));
 	 	sInfo2.setCustomsMerchNo("020160");
 	 	sInfo2.setMerchName("020160");
 	 	sInfo2.setDeclaCount(80);
 	 	sInfo2.setDeclaUnit("020160");
 	 	sInfo2.setDeclaUnitPrice(new BigDecimal("80"));
 	 	sInfo2.setDeclaTotalPrice(new BigDecimal("80"));
 	 	sInfo2.setDeclaCurrency("020160");
 	 	sInfo2.setOriginCountry("020160");
 	 	sInfo2.setDestCountry("020160");
 	 	sInfo2.setPieceWeigh(new BigDecimal("80"));
 	 	sInfo2.setShippedAllWeigh(new BigDecimal("80"));
 	 	sInfo2.setSupervisionConditions("020160");
 	 	sInfo2.setCreateTime(new Date());
 	 	sInfo2.setUpdateTime(new Date());
 	 	List<ShippedInfo> sList = shippedInfoService.queryList(reqDto) ;
 		ShippedInfoRespDto respDto = new ShippedInfoRespDto();
 	 	if(CollectionUtils.isEmpty(sList)) {
 	 		respDto.setTotal(0);
 	 	}else {
 	 		sList.add(sInfo1) ;
 	 		sList.add(sInfo2) ;
 	 		respDto.setTotal(sList.size());
 	 		respDto.setItems(sList);
 	 	}
		return Resp.success("出仓数据查询成功" , respDto);
    }

	
}
