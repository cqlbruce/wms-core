package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
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
import com.hht.wms.core.dao.ShippedFeeInfoDao;
import com.hht.wms.core.dao.StockFeeInfoDao;
import com.hht.wms.core.dto.ShippedFeeExportReqDto;
import com.hht.wms.core.dto.ShippedFeeExportRespDto;
import com.hht.wms.core.dto.ShippedFeeQueryReqDto;
import com.hht.wms.core.dto.ShippedFeeQueryRespDto;
import com.hht.wms.core.dto.ShippedFeeUpdateReqDto;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.dto.ShippedStatisticsRespDto;
import com.hht.wms.core.dto.StockFeeExportReqDto;
import com.hht.wms.core.dto.StockFeeExportRespDto;
import com.hht.wms.core.dto.StockFeeQueryReqDto;
import com.hht.wms.core.dto.StockFeeQueryRespDto;
import com.hht.wms.core.dto.StockFeeUpdateReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.dto.StockStatisticsRespDto;
import com.hht.wms.core.entity.ShippedFeeInfo;
import com.hht.wms.core.entity.StockFeeInfo;
import com.hht.wms.core.service.FeeInfoService;
import com.hht.wms.core.service.ShippedInfoService;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.SnowFlakeUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/statement/")
@CrossOrigin 
public class StatementAccountController {
    private static Logger logger = LoggerFactory.getLogger(StatementAccountController.class) ;
    
    
    @Autowired
    private StockInfoService stockInfoService ; 
    
    @Autowired
    private ShippedInfoService shippedInfoService ; 
    
    @Autowired
    private ShippedFeeInfoDao shippedFeeInfoDao ; 
    
    @Autowired
    private StockFeeInfoDao stockFeeInfoDao ;  
    
    @Autowired
    private FeeInfoService feeInfoService; 
    
    
    
    @SuppressWarnings("unchecked")
	@PostMapping("shippedStatistics")
    @ApiOperation(value = "出仓数据统计", notes = "")
    public Resp<ShippedStatisticsRespDto> shippedStatistics() {
        logger.info("出仓数据统计........");
		ShippedStatisticsRespDto respDto = new ShippedStatisticsRespDto();

    	try {
    		
//    		select sum(shipped_volume) from shipped_info where shipped_date='2019-11-17' ;
//			select count(distinct  inbound_no) from stock_info where rcvd_date='20191209'; 
    		respDto.setVeryDayCarCount(8);
    		respDto.setVeryDayShippedVolume(new BigDecimal("9.0"));
    		
    	}catch(Exception e) {
    		logger.error("出仓数据统计异常");
    	}
        return Resp.success("修改成功", respDto);
    }        
    
    
    @SuppressWarnings("unchecked")
	@PostMapping("stockStatistics")
    @ApiOperation(value = "入仓数据统计", notes = "")
    public Resp<StockStatisticsRespDto> stockStatistics() {
        logger.info("入仓统计........}" );
        StockStatisticsRespDto respDto = new StockStatisticsRespDto();
    	try {
    		//select sum(stock_volume) from stock_info where rcvd_date='20191209'; 
    		//select count(1) from stock_info where rcvd_date='20191209'; 
    		//select count(distinct  inbound_no) from stock_info where rcvd_date='20191209'; 
    		respDto.setRealTimePcs(8);
    		respDto.setRealTimeVolume(new BigDecimal("9.0"));
    		respDto.setTickets(9);
    		respDto.setVeryDayVolume(new BigDecimal("9.0"));
    		
    	}catch(Exception e) {
    		logger.error("入仓数据统计异常");
    	}
        return Resp.success("修改成功", respDto);
    }    
    
    
    @SuppressWarnings("unchecked")
	@PostMapping("shippedFeeUpdate")
    @ApiOperation(value = "出仓费用修改", notes = "")
    public Resp<?> stockFeeUpdate(@RequestBody ShippedFeeUpdateReqDto reqDto) {
        logger.info("出仓费用修改.........{}", JSON.toJSON(reqDto) );
    	List<ShippedFeeInfo> list = new ArrayList<ShippedFeeInfo>();
    	try {
        	ShippedFeeInfo sfi = new ShippedFeeInfo();
        	sfi.setId(SnowFlakeUtil.getNextId());
        	BeanUtils.copyProperties(reqDto, sfi);
        	list.add(sfi);
        	shippedFeeInfoDao.insertOrUpdate(list);
    	}catch(Exception e) {
    		logger.error("出仓费用修改");
    	}

        return Resp.success("修改成功", "");
    }

    
    @SuppressWarnings("unchecked")
	@PostMapping("stockFeeUpdate")
    @ApiOperation(value = "入仓费用修改", notes = "")
    public Resp<?> shippedFeeUpdate(@RequestBody StockFeeUpdateReqDto reqDto) {
        logger.info("入仓费用修改.........{}", JSON.toJSON(reqDto) );
    	List<StockFeeInfo> list = new ArrayList<StockFeeInfo>();
    	try {
        	StockFeeInfo sfi = new StockFeeInfo();
        	sfi.setId(SnowFlakeUtil.getNextId());
        	BeanUtils.copyProperties(reqDto, sfi);
        	list.add(sfi);
        	stockFeeInfoDao.insertOrUpdate(list);
    	}catch(Exception e) {
    		logger.error("入仓费用修改异常!");
    	}

        return Resp.success("修改成功", "");
    }    
    
    @SuppressWarnings("unchecked")
	@PostMapping("loadStockFee")
    @ApiOperation(value = "入仓费用查询", notes = "")
    public Resp<StockFeeQueryRespDto> loadStockFee(@RequestBody StockFeeQueryReqDto reqDto) {
        logger.info("入仓费用查询.........{}", JSON.toJSON(reqDto) );
        StockFeeQueryRespDto respDto = feeInfoService.stockFeeInfoQueryByPage(reqDto);
        logger.info("入仓费用查询.........{}", JSON.toJSON(respDto) );
        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("exportStockFee")
    @ApiOperation(value = "入仓费用导出", notes = "")
    public Resp<StockFeeExportRespDto> exportStockFee(@RequestBody StockFeeExportReqDto reqDto) {
        logger.info("入仓费用导出..........{}", JSON.toJSON(reqDto) );
        StockFeeExportRespDto respDto = new StockFeeExportRespDto();
        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("loadShippedFee")
    @ApiOperation(value = "出仓费用查询", notes = "")
    public Resp<ShippedFeeQueryRespDto> loadShippedFee(@RequestBody ShippedFeeQueryReqDto reqDto) {
        logger.info("出仓费用查询.........{}", JSON.toJSON(reqDto) );
        ShippedFeeQueryRespDto respDto = feeInfoService.shippedFeeInfoQueryByPage(reqDto);
        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("exportShippedFee")
    @ApiOperation(value = "出仓费用导出", notes = "")
    public Resp<ShippedFeeExportRespDto> exportShippedFee(@RequestBody ShippedFeeExportReqDto reqDto) {
        logger.info("出仓费用导出.........{}", JSON.toJSON(reqDto) );
        ShippedFeeExportRespDto respDto = new ShippedFeeExportRespDto();
        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("loadStockGoods")
    @ApiOperation(value = "进仓货物查询", notes = "")
    public Resp<StockInfoRespDto> loadStockGoods(@RequestBody StockInfoQueryReqDto reqDto) {
        logger.info("进仓货物查询.........{}", JSON.toJSON(reqDto) );
        StockInfoRespDto respDto = stockInfoService.loadStock(reqDto);
        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("exportStockGoods")
    @ApiOperation(value = "存仓货物导出", notes = "")
    public Resp<StockInfoRespDto> exportStockGoods(@RequestBody StockInfoQueryReqDto reqDto) {
        logger.info("存仓货物导出.........{}", JSON.toJSON(reqDto) );
        StockInfoRespDto respDto = stockInfoService.loadStock(reqDto);
        return Resp.success("查询成功", respDto);
        
    }

    @SuppressWarnings("unchecked")
	@PostMapping("loadShippedGoods")
    @ApiOperation(value = "出仓货物查询", notes = "")
    public Resp<ShippedInfoRespDto> loadShippedGoods(@RequestBody ShippedInfoReqDto reqDto) {
        logger.info("出仓货物查询.........{}", JSON.toJSON(reqDto) );
        ShippedInfoRespDto respDto = shippedInfoService.queryList(reqDto);
        return Resp.success("查询成功", respDto);
     
    }

    @SuppressWarnings("unchecked")
	@PostMapping("exportShippedGoods")
    @ApiOperation(value = "出仓货物导出", notes = "")
    public Resp<ShippedInfoRespDto> exportShippedGoods(@RequestBody ShippedInfoReqDto reqDto) {
        logger.info("出仓货物导出.........{}", JSON.toJSON(reqDto) );
        ShippedInfoRespDto respDto = shippedInfoService.queryList(reqDto);
        return Resp.success("查询成功", respDto);
    }
}
