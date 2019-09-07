package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Req;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.StockInfoReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.entity.StockInfo;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/stock/")
@CrossOrigin 
public class StockController {
	private static Logger logger = LoggerFactory.getLogger(StockController.class) ; 
	
	@PostMapping("load")
    @ApiOperation(value = "加载库存", notes = "")
    public Resp<StockInfoRespDto> load(@RequestBody Req<StockInfoReqDto> req) {
	//public Resp<LoginRespDto> login(HttpServletRequest request) {
		//String userName = request.getParameter("userName");
 		logger.info("stock....load..........{}",JSON.toJSON(req) );
 		StockInfo sInfo1 = new StockInfo();
 		sInfo1.setPo("0708030310");
 		sInfo1.setSku("44088219");
 		sInfo1.setInboundNo("20190813");
 		sInfo1.setCustomsMeterialNo("Nb07080303");
 		sInfo1.setStockGw(new BigDecimal("89.8"));
 		sInfo1.setOriginCountry("中国");
 		sInfo1.setSupplierName("中外运");
 		sInfo1.setSo("020160");
 		sInfo1.setRcvdDate("20190806");
 		sInfo1.setRcvdCtns(10);
 		sInfo1.setRcvdPcs(10);
 		sInfo1.setMerchName("Sn021045");
 		sInfo1.setItemsPerBox(18);
 		
 		StockInfo sInfo2 = new StockInfo();
 		sInfo2.setPo("0708030311");
 		sInfo2.setSku("44088219");
 		sInfo2.setInboundNo("20190813");
 		sInfo2.setCustomsMeterialNo("Nb07080303");
 		sInfo2.setStockGw(new BigDecimal("89.8"));
 		sInfo2.setOriginCountry("中国");
 		sInfo2.setSupplierName("中外运");
 		sInfo2.setSo("020160");
 		sInfo2.setRcvdDate("20190806");
 		sInfo2.setRcvdCtns(10);
 		sInfo2.setRcvdPcs(10);
 		sInfo2.setMerchName("Sn021045");
 		sInfo2.setItemsPerBox(18); 		
 		StockInfoRespDto respDto = new StockInfoRespDto();
 		List<StockInfo> sList = new ArrayList<StockInfo>();
 		sList.add(sInfo1) ;
 		sList.add(sInfo2) ;
 		respDto.setTotal(20);
 		respDto.setItems(sList);
		logger.info("login..............{}",JSON.toJSON(Resp.success("登陆成功" , respDto)) );
		return Resp.success("登陆成功" , respDto);
		
    }

	

}
