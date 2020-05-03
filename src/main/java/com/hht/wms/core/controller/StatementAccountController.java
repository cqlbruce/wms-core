package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.List;

import org.assertj.core.util.Lists;
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
import com.hht.wms.core.dto.ShippedFeeExportReqDto;
import com.hht.wms.core.dto.ShippedFeeExportRespDto;
import com.hht.wms.core.dto.ShippedFeeQueryReqDto;
import com.hht.wms.core.dto.ShippedFeeQueryRespDto;
import com.hht.wms.core.dto.ShippedGoodsQueryRespDto;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.dto.StockFeeExportReqDto;
import com.hht.wms.core.dto.StockFeeExportRespDto;
import com.hht.wms.core.dto.StockFeeQueryReqDto;
import com.hht.wms.core.dto.StockFeeQueryRespDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.dto.vo.ShippedFee;
import com.hht.wms.core.dto.vo.ShippedGoods;
import com.hht.wms.core.dto.vo.StockFee;
import com.hht.wms.core.service.ShippedInfoService;
import com.hht.wms.core.service.StockInfoService;

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
    

    @SuppressWarnings("unchecked")
	@PostMapping("loadStockFee")
    @ApiOperation(value = "入仓费用查询", notes = "")
    public Resp<StockFeeQueryRespDto> loadStock(@RequestBody StockFeeQueryReqDto reqDto) {
        logger.info("入仓费用查询.........{}", JSON.toJSON(reqDto) );
//
//        List<StockFee> stockFeeList = Lists.newArrayList();
//        StockFee stockFee = new StockFee();
//        stockFee.setStockDate("2019/7/4");
//        stockFee.setCar("粤BG558U");
//        stockFee.setSo("S10SZX1927006");
//        stockFee.setStockCtns(new BigDecimal("591"));
//        stockFee.setStockVolume(new BigDecimal("15.36"));
//        stockFeeList.add(stockFee);
//
//        StockFee stockFee1 = new StockFee();
//        stockFee1.setStockDate("2019/7/6");
//        stockFee1.setCar("粤BG558U");
//        stockFee1.setSo("S10SZX1917015");
//        stockFee1.setStockCtns(new BigDecimal("201"));
//        stockFee1.setStockVolume(new BigDecimal("2.56"));
//        stockFeeList.add(stockFee1);
//
//        StockFee stockFee2 = new StockFee();
//        stockFee2.setStockDate("2019/7/10");
//        stockFee2.setCar("粤BU97C9");
//        stockFee2.setSo("S10SZX1927055");
//        stockFee2.setStockCtns(new BigDecimal("999"));
//        stockFee2.setStockVolume(new BigDecimal("215.36"));
//        stockFeeList.add(stockFee2);
//
        StockFeeQueryRespDto respDto = new StockFeeQueryRespDto();
//        respDto.setTotal(3);
//        respDto.setItems(stockFeeList);

        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("exportStockFee")
    @ApiOperation(value = "入仓费用导出", notes = "")
    public Resp<StockFeeExportRespDto> exportStockFee(@RequestBody StockFeeExportReqDto reqDto) {
        logger.info("入仓费用导出..........{}", JSON.toJSON(reqDto) );
//
//        List<StockFee> stockFeeList = Lists.newArrayList();
//        StockFee stockFee = new StockFee();
//        stockFee.setStockDate("2019/7/4");
//        stockFee.setCar("粤BG558U");
//        stockFee.setSo("S10SZX1927006");
//        stockFee.setStockCtns(new BigDecimal("591"));
//        stockFee.setStockVolume(new BigDecimal("15.36"));
//        stockFeeList.add(stockFee);
//
//        StockFee stockFee1 = new StockFee();
//        stockFee1.setStockDate("2019/7/6");
//        stockFee1.setCar("粤BG558U");
//        stockFee1.setSo("S10SZX1917015");
//        stockFee1.setStockCtns(new BigDecimal("201"));
//        stockFee1.setStockVolume(new BigDecimal("2.56"));
//        stockFeeList.add(stockFee1);
//
//        StockFee stockFee2 = new StockFee();
//        stockFee2.setStockDate("2019/7/10");
//        stockFee2.setCar("粤BU97C9");
//        stockFee2.setSo("S10SZX1927055");
//        stockFee2.setStockCtns(new BigDecimal("999"));
//        stockFee2.setStockVolume(new BigDecimal("215.36"));
//        stockFeeList.add(stockFee2);
//
//        StockFee stockFee3 = new StockFee();
//        stockFee3.setStockDate("2019/7/17");
//        stockFee3.setCar("粤B1Y61A");
//        stockFee3.setSo("S10SZX1927015");
//        stockFee3.setStockCtns(new BigDecimal("217"));
//        stockFee3.setStockVolume(new BigDecimal("5.03"));
//        stockFeeList.add(stockFee3);

        StockFeeExportRespDto respDto = new StockFeeExportRespDto();
//        respDto.setItems(stockFeeList);

        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("loadShippedFee")
    @ApiOperation(value = "出仓费用查询", notes = "")
    public Resp<ShippedFeeQueryRespDto> loadShippedFee(@RequestBody ShippedFeeQueryReqDto reqDto) {
        logger.info("出仓费用查询.........{}", JSON.toJSON(reqDto) );
//
//        List<ShippedFee> shippedFeeList = Lists.newArrayList();
//        ShippedFee shippedFee = new ShippedFee();
//        shippedFee.setShippedDate("2019/7/4");
//        shippedFee.setShptNo("CKAS19070401");
//        shippedFee.setClp("SPS190422");
//        shippedFee.setCar("粤BG558U（客拖）");
//        shippedFee.setRoute("中海仓-平湖外运仓");
//        shippedFee.setCabinetType("3T");
//        shippedFee.setShippedCtns(new BigDecimal("913"));
//        shippedFee.setShippedVolume(new BigDecimal("6.27"));
//        shippedFeeList.add(shippedFee);
//
//        ShippedFee shippedFee1 = new ShippedFee();
//        shippedFee1.setShippedDate("2019/7/5");
//        shippedFee1.setShptNo("CKAS19070444");
//        shippedFee1.setClp("SPS191422");
//        shippedFee1.setCar("粤BG568U（客拖）");
//        shippedFee1.setRoute("中海仓-平湖外运仓");
//        shippedFee1.setCabinetType("3T");
//        shippedFee1.setShippedCtns(new BigDecimal("913"));
//        shippedFee1.setShippedVolume(new BigDecimal("6.27"));
//        shippedFeeList.add(shippedFee1);
//
//        ShippedFee shippedFee2 = new ShippedFee();
//        shippedFee2.setShippedDate("2019/7/6");
//        shippedFee2.setShptNo("CKAS19070402");
//        shippedFee2.setClp("SPS190423");
//        shippedFee2.setCar("粤BG558U（客拖1）");
//        shippedFee2.setRoute("中海仓-平湖外运仓1");
//        shippedFee2.setCabinetType("3T");
//        shippedFee2.setShippedCtns(new BigDecimal("913"));
//        shippedFee2.setShippedVolume(new BigDecimal("6.27"));
//        shippedFeeList.add(shippedFee2);

        ShippedFeeQueryRespDto respDto = new ShippedFeeQueryRespDto();
//        respDto.setTotal(3);
//        respDto.setItems(shippedFeeList);

        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("exportShippedFee")
    @ApiOperation(value = "出仓费用导出", notes = "")
    public Resp<ShippedFeeExportRespDto> exportShippedFee(@RequestBody ShippedFeeExportReqDto reqDto) {
        logger.info("出仓费用导出.........{}", JSON.toJSON(reqDto) );
//
//        List<ShippedFee> shippedFeeList = Lists.newArrayList();
//        ShippedFee shippedFee = new ShippedFee();
//        shippedFee.setShippedDate("2019/7/4");
//        shippedFee.setShptNo("CKAS19070401");
//        shippedFee.setClp("SPS190422");
//        shippedFee.setCar("粤BG558U（客拖）");
//        shippedFee.setRoute("中海仓-平湖外运仓");
//        shippedFee.setCabinetType("3T");
//        shippedFee.setShippedCtns(new BigDecimal("913"));
//        shippedFee.setShippedVolume(new BigDecimal("6.27"));
//        shippedFeeList.add(shippedFee);
//
//        ShippedFee shippedFee1 = new ShippedFee();
//        shippedFee1.setShippedDate("2019/7/5");
//        shippedFee1.setShptNo("CKAS19070444");
//        shippedFee1.setClp("SPS191422");
//        shippedFee1.setCar("粤BG568U（客拖）");
//        shippedFee1.setRoute("中海仓-平湖外运仓");
//        shippedFee1.setCabinetType("3T");
//        shippedFee1.setShippedCtns(new BigDecimal("913"));
//        shippedFee1.setShippedVolume(new BigDecimal("6.27"));
//        shippedFeeList.add(shippedFee1);
//
//        ShippedFee shippedFee2 = new ShippedFee();
//        shippedFee2.setShippedDate("2019/7/6");
//        shippedFee2.setShptNo("CKAS19070402");
//        shippedFee2.setClp("SPS190423");
//        shippedFee2.setCar("粤BG558U（客拖1）");
//        shippedFee2.setRoute("中海仓-平湖外运仓1");
//        shippedFee2.setCabinetType("3T");
//        shippedFee2.setShippedCtns(new BigDecimal("913"));
//        shippedFee2.setShippedVolume(new BigDecimal("6.27"));
//        shippedFeeList.add(shippedFee2);
//
//        ShippedFee shippedFee3 = new ShippedFee();
//        shippedFee3.setShippedDate("2019/7/15");
//        shippedFee3.setShptNo("CKAS19070412");
//        shippedFee3.setClp("SPS190433");
//        shippedFee3.setCar("粤BG558E（客拖）");
//        shippedFee3.setRoute("中海仓-平湖外运仓");
//        shippedFee3.setCabinetType("3T");
//        shippedFee3.setShippedCtns(new BigDecimal("913"));
//        shippedFee3.setShippedVolume(new BigDecimal("6.27"));
//        shippedFeeList.add(shippedFee3);

        ShippedFeeExportRespDto respDto = new ShippedFeeExportRespDto();
//        respDto.setItems(shippedFeeList);

        return Resp.success("查询成功", respDto);
    }

    @SuppressWarnings("unchecked")
	@PostMapping("loadStockGoods")
    @ApiOperation(value = "进仓货物查询", notes = "")
    public Resp<StockInfoRespDto> loadStockGoods(@RequestBody StockInfoQueryReqDto reqDto) {
        logger.info("进仓货物查询.........{}", JSON.toJSON(reqDto) );

//        StockInfoQueryReqDto queryDto = new StockInfoQueryReqDto();
//        queryDto.setPo(reqDto.getPo());
//        queryDto.setSo(reqDto.getSo());
//        queryDto.setSize(reqDto.getLimit());
//        queryDto.setPage(reqDto.getPage());
        
        StockInfoRespDto respDto = stockInfoService.loadStock(reqDto);
        return Resp.success("查询成功", respDto);

//        
//        
//        List<StockGoods> stockGoodsList = Lists.newArrayList();
//
//        StockGoods stockGoods = new StockGoods();
//        stockGoods.setRcvdDate("2018/7/2");
//        stockGoods.setInboundNo("KAS18070201");
//        stockGoods.setSo("S10SZX1826002");
//        stockGoods.setPo("KG-ARI-1808-00019-00285");
//        stockGoods.setSku("42609926");
//        stockGoods.setStockPcs(new BigDecimal("6"));
//        stockGoods.setStockVolume(new BigDecimal("0.046"));
//        stockGoodsList.add(stockGoods);
//
//        StockGoods stockGoods1 = new StockGoods();
//        stockGoods1.setRcvdDate("2018/7/2");
//        stockGoods1.setInboundNo("KAS18070201");
//        stockGoods1.setSo("S10SZX1826002");
//        stockGoods1.setPo("KG-ARI-1808-00019-00285");
//        stockGoods1.setSku("42609926");
//        stockGoods1.setStockPcs(new BigDecimal("6"));
//        stockGoods1.setStockVolume(new BigDecimal("0.046"));
//        stockGoodsList.add(stockGoods1);
//
//        StockGoods stockGoods2 = new StockGoods();
//        stockGoods2.setRcvdDate("2018/7/2");
//        stockGoods2.setInboundNo("KAS18070201");
//        stockGoods2.setSo("S10SZX1826002");
//        stockGoods2.setPo("KG-ARI-1808-00019-00285");
//        stockGoods2.setSku("42609926");
//        stockGoods2.setStockPcs(new BigDecimal("6"));
//        stockGoods2.setStockVolume(new BigDecimal("0.046"));
//        stockGoodsList.add(stockGoods2);
//
//        StockGoodsQueryRespDto respDto = new StockGoodsQueryRespDto();
//        respDto.setTotal(stockGoodsList.size());
//        respDto.setItems(stockGoodsList);

    }

    @SuppressWarnings("unchecked")
	@PostMapping("exportStockGoods")
    @ApiOperation(value = "存仓货物导出", notes = "")
    public Resp<StockInfoRespDto> exportStockGoods(@RequestBody StockInfoQueryReqDto reqDto) {
        logger.info("存仓货物导出.........{}", JSON.toJSON(reqDto) );
        StockInfoRespDto respDto = stockInfoService.loadStock(reqDto);
        return Resp.success("查询成功", respDto);
        
//        List<StockGoods> stockGoodsList = Lists.newArrayList();
//        StockGoods stockGoods = new StockGoods();
//        stockGoods.setRcvdDate("2018/7/2");
//        stockGoods.setInboundNo("KAS18070201");
//        stockGoods.setSo("S10SZX1826002");
//        stockGoods.setPo("KG-ARI-1808-00019-00285");
//        stockGoods.setSku("42609926");
//        stockGoods.setStockPcs(new BigDecimal("6"));
//        stockGoods.setStockVolume(new BigDecimal("0.046"));
//        stockGoods.setOverStockDate("2019/7/1");
//        stockGoods.setOverStockDays(31);
//        stockGoods.setOverStockFee(new BigDecimal("2.01"));
//        stockGoods.setBillsBeginDate(reqDto.getBillsBeginDate());
//        stockGoods.setBillsEndDate(reqDto.getBillsEndDate());
//        stockGoods.setOverStockUnitPrice(reqDto.getOverStockUnitPrice());
//        stockGoodsList.add(stockGoods);
//
//
//        StockGoods stockGoods1 = new StockGoods();
//        stockGoods1.setRcvdDate("2018/7/2");
//        stockGoods1.setInboundNo("KAS18070201");
//        stockGoods1.setSo("S10SZX1826002");
//        stockGoods1.setPo("KG-ARI-1808-00019-00285");
//        stockGoods1.setSku("42609926");
//        stockGoods1.setStockPcs(new BigDecimal("6"));
//        stockGoods1.setStockVolume(new BigDecimal("0.046"));
//        stockGoods1.setOverStockDate("2019/7/1");
//        stockGoods1.setOverStockDays(31);
//        stockGoods1.setOverStockFee(new BigDecimal("2.01"));
//        stockGoods1.setBillsBeginDate(reqDto.getBillsBeginDate());
//        stockGoods1.setBillsEndDate(reqDto.getBillsEndDate());
//        stockGoods1.setOverStockUnitPrice(reqDto.getOverStockUnitPrice());
//        stockGoodsList.add(stockGoods1);
//
//        StockGoods stockGoods2 = new StockGoods();
//        stockGoods2.setRcvdDate("2018/7/2");
//        stockGoods2.setInboundNo("KAS18070201");
//        stockGoods2.setSo("S10SZX1826002");
//        stockGoods2.setPo("KG-ARI-1808-00019-00285");
//        stockGoods2.setSku("42609926");
//        stockGoods2.setStockPcs(new BigDecimal("6"));
//        stockGoods2.setStockVolume(new BigDecimal("0.046"));
//        stockGoods2.setOverStockDate("2019/7/1");
//        stockGoods2.setOverStockDays(31);
//        stockGoods2.setOverStockFee(new BigDecimal("2.01"));
//        stockGoods2.setBillsBeginDate(reqDto.getBillsBeginDate());
//        stockGoods2.setBillsEndDate(reqDto.getBillsEndDate());
//        stockGoods2.setOverStockUnitPrice(reqDto.getOverStockUnitPrice());
//        stockGoodsList.add(stockGoods2);
//
//        StockGoods stockGoods3 = new StockGoods();
//        stockGoods3.setRcvdDate("2018/7/2");
//        stockGoods3.setInboundNo("KAS18070201");
//        stockGoods3.setSo("S10SZX1826002");
//        stockGoods3.setPo("KG-ARI-1808-00019-00285");
//        stockGoods3.setSku("42609926");
//        stockGoods3.setStockPcs(new BigDecimal("6"));
//        stockGoods3.setStockVolume(new BigDecimal("0.046"));
//        stockGoods3.setOverStockDate("2019/7/1");
//        stockGoods3.setOverStockDays(31);
//        stockGoods3.setOverStockFee(new BigDecimal("2.01"));
//        stockGoods3.setBillsBeginDate(reqDto.getBillsBeginDate());
//        stockGoods3.setBillsEndDate(reqDto.getBillsEndDate());
//        stockGoods3.setOverStockUnitPrice(reqDto.getOverStockUnitPrice());
//        stockGoodsList.add(stockGoods3);
//
//        StockGoodsQueryRespDto respDto = new StockGoodsQueryRespDto();
//        respDto.setItems(stockGoodsList);

    }

    @SuppressWarnings("unchecked")
	@PostMapping("loadShippedGoods")
    @ApiOperation(value = "出仓货物查询", notes = "")
    public Resp<ShippedInfoRespDto> loadShippedGoods(@RequestBody ShippedInfoReqDto reqDto) {
        logger.info("出仓货物查询.........{}", JSON.toJSON(reqDto) );
        
        ShippedInfoRespDto respDto = shippedInfoService.queryList(reqDto);
        
        return Resp.success("查询成功", respDto);
        
//        List<ShippedGoods> shippedGoodsList = Lists.newArrayList();
//
//        ShippedGoods shippedGoods = new ShippedGoods();
//        shippedGoods.setRcvdDate("2018/7/2");
//        shippedGoods.setInboundNo("KAS18070201");
//        shippedGoods.setSo("S10SZX1826002");
//        shippedGoods.setPo("KG-ARI-1808-00019-00285");
//        shippedGoods.setSku("42609926");
//        shippedGoods.setStockPcs(new BigDecimal("6"));
//        shippedGoods.setStockVolume(new BigDecimal("0.046"));
//        shippedGoods.setShippedNo("SPS190422T010SZX917JKT9");
//        shippedGoods.setShippedOrderDate("2019/7/4");
//        shippedGoodsList.add(shippedGoods);
//
//        ShippedGoods shippedGoods1 = new ShippedGoods();
//        shippedGoods1.setRcvdDate("2018/7/2");
//        shippedGoods1.setInboundNo("KAS18070201");
//        shippedGoods1.setSo("S10SZX1826002");
//        shippedGoods1.setPo("KG-ARI-1808-00019-00285");
//        shippedGoods1.setSku("42609926");
//        shippedGoods1.setStockPcs(new BigDecimal("6"));
//        shippedGoods1.setStockVolume(new BigDecimal("0.046"));
//        shippedGoods1.setShippedNo("SPS190422T010SZX917JKT9");
//        shippedGoods1.setShippedOrderDate("2019/7/4");
//        shippedGoodsList.add(shippedGoods1);
//
//        ShippedGoodsQueryRespDto respDto = new ShippedGoodsQueryRespDto();
//        respDto.setTotal(shippedGoodsList.size());
//        respDto.setItems(shippedGoodsList);

    }

    @SuppressWarnings("unchecked")
	@PostMapping("exportShippedGoods")
    @ApiOperation(value = "出仓货物导出", notes = "")
    public Resp<ShippedInfoRespDto> exportShippedGoods(@RequestBody ShippedInfoReqDto reqDto) {
        logger.info("出仓货物导出.........{}", JSON.toJSON(reqDto) );
        ShippedInfoRespDto respDto = shippedInfoService.queryList(reqDto);
        return Resp.success("查询成功", respDto);
//        
//        List<ShippedGoods> shippedGoodsList = Lists.newArrayList();
//
//        ShippedGoods shippedGoods = new ShippedGoods();
//        shippedGoods.setRcvdDate("2018/7/2");
//        shippedGoods.setInboundNo("KAS18070201");
//        shippedGoods.setSo("S10SZX1826002");
//        shippedGoods.setPo("KG-ARI-1808-00019-00285");
//        shippedGoods.setSku("42609926");
//        shippedGoods.setStockPcs(new BigDecimal("6"));
//        shippedGoods.setStockVolume(new BigDecimal("0.046"));
//        shippedGoods.setShippedNo("SPS190422T010SZX917JKT9");
//        shippedGoods.setShippedOrderDate("2019/7/4");
//        shippedGoods.setBillsBeginDate(reqDto.getBillsBeginDate());
//        shippedGoods.setBillsEndDate(reqDto.getBillsEndDate());
//        shippedGoods.setOverStockUnitPrice(reqDto.getOverStockUnitPrice());
//        shippedGoodsList.add(shippedGoods);
//
//        ShippedGoods shippedGoods1 = new ShippedGoods();
//        shippedGoods1.setRcvdDate("2018/7/2");
//        shippedGoods1.setInboundNo("KAS18070201");
//        shippedGoods1.setSo("S10SZX1826002");
//        shippedGoods1.setPo("KG-ARI-1808-00019-00285");
//        shippedGoods1.setSku("42609926");
//        shippedGoods1.setStockPcs(new BigDecimal("6"));
//        shippedGoods1.setStockVolume(new BigDecimal("0.046"));
//        shippedGoods1.setShippedNo("SPS190422T010SZX917JKT9");
//        shippedGoods1.setShippedOrderDate("2019/7/4");
//        shippedGoods.setBillsBeginDate(reqDto.getBillsBeginDate());
//        shippedGoods.setBillsEndDate(reqDto.getBillsEndDate());
//        shippedGoods.setOverStockUnitPrice(reqDto.getOverStockUnitPrice());
//        shippedGoodsList.add(shippedGoods1);
//
//        ShippedGoodsQueryRespDto respDto = new ShippedGoodsQueryRespDto();
//        respDto.setItems(shippedGoodsList);
//        return Resp.success("查询成功", respDto);
    }
}
