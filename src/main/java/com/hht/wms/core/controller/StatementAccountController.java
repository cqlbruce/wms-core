package com.hht.wms.core.controller;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.*;
import com.hht.wms.core.entity.ShippedFee;
import com.hht.wms.core.entity.StockFee;
import io.swagger.annotations.ApiOperation;
import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value="/statement/")
@CrossOrigin 
public class StatementAccountController {
    private static Logger logger = LoggerFactory.getLogger(StatementAccountController.class) ;

    @PostMapping("loadStockFee")
    @ApiOperation(value = "入仓费用查询", notes = "")
    public Resp<StockFeeQueryRespDto> loadStock(@RequestBody StockFeeQueryReqDto reqDto) {
        logger.info("入仓费用查询.........{}", JSON.toJSON(reqDto) );

        List<StockFee> stockFeeList = Lists.newArrayList();
        StockFee stockFee = new StockFee();
        stockFee.setStockDate("2019/7/4");
        stockFee.setCar("粤BG558U");
        stockFee.setSo("S10SZX1927006");
        stockFee.setStockCtns(new BigDecimal("591"));
        stockFee.setStockVolume(new BigDecimal("15.36"));
        stockFeeList.add(stockFee);

        StockFee stockFee1 = new StockFee();
        stockFee1.setStockDate("2019/7/6");
        stockFee1.setCar("粤BG558U");
        stockFee1.setSo("S10SZX1917015");
        stockFee1.setStockCtns(new BigDecimal("201"));
        stockFee1.setStockVolume(new BigDecimal("2.56"));
        stockFeeList.add(stockFee1);

        StockFee stockFee2 = new StockFee();
        stockFee2.setStockDate("2019/7/10");
        stockFee2.setCar("粤BU97C9");
        stockFee2.setSo("S10SZX1927055");
        stockFee2.setStockCtns(new BigDecimal("999"));
        stockFee2.setStockVolume(new BigDecimal("215.36"));
        stockFeeList.add(stockFee2);

        StockFeeQueryRespDto respDto = new StockFeeQueryRespDto();
        respDto.setTotal(3);
        respDto.setItems(stockFeeList);

        return Resp.success("查询成功", respDto);
    }

    @PostMapping("exportStockFee")
    @ApiOperation(value = "入仓费用导出", notes = "")
    public Resp<StockFeeExportRespDto> exportStockFee(@RequestBody StockFeeExportReqDto reqDto) {
        logger.info("入仓费用导出..........{}", JSON.toJSON(reqDto) );

        List<StockFee> stockFeeList = Lists.newArrayList();
        StockFee stockFee = new StockFee();
        stockFee.setStockDate("2019/7/4");
        stockFee.setCar("粤BG558U");
        stockFee.setSo("S10SZX1927006");
        stockFee.setStockCtns(new BigDecimal("591"));
        stockFee.setStockVolume(new BigDecimal("15.36"));
        stockFeeList.add(stockFee);

        StockFee stockFee1 = new StockFee();
        stockFee1.setStockDate("2019/7/6");
        stockFee1.setCar("粤BG558U");
        stockFee1.setSo("S10SZX1917015");
        stockFee1.setStockCtns(new BigDecimal("201"));
        stockFee1.setStockVolume(new BigDecimal("2.56"));
        stockFeeList.add(stockFee1);

        StockFee stockFee2 = new StockFee();
        stockFee2.setStockDate("2019/7/10");
        stockFee2.setCar("粤BU97C9");
        stockFee2.setSo("S10SZX1927055");
        stockFee2.setStockCtns(new BigDecimal("999"));
        stockFee2.setStockVolume(new BigDecimal("215.36"));
        stockFeeList.add(stockFee2);

        StockFee stockFee3 = new StockFee();
        stockFee3.setStockDate("2019/7/17");
        stockFee3.setCar("粤B1Y61A");
        stockFee3.setSo("S10SZX1927015");
        stockFee3.setStockCtns(new BigDecimal("217"));
        stockFee3.setStockVolume(new BigDecimal("5.03"));
        stockFeeList.add(stockFee3);

        StockFeeExportRespDto respDto = new StockFeeExportRespDto();
        respDto.setItems(stockFeeList);

        return Resp.success("查询成功", respDto);
    }

    @PostMapping("loadShippedFee")
    @ApiOperation(value = "出仓费用查询", notes = "")
    public Resp<ShippedFeeQueryRespDto> loadShippedFee(@RequestBody ShippedFeeQueryReqDto reqDto) {
        logger.info("出仓费用查询.........{}", JSON.toJSON(reqDto) );

        List<ShippedFee> shippedFeeList = Lists.newArrayList();
        ShippedFee shippedFee = new ShippedFee();
        shippedFee.setShippedDate("2019/7/4");
        shippedFee.setShptNo("CKAS19070401");
        shippedFee.setClp("SPS190422");
        shippedFee.setCar("粤BG558U（客拖）");
        shippedFee.setRoute("中海仓-平湖外运仓");
        shippedFee.setCabinetType("3T");
        shippedFee.setShippedCtns(new BigDecimal("913"));
        shippedFee.setShippedVolume(new BigDecimal("6.27"));
        shippedFeeList.add(shippedFee);

        ShippedFee shippedFee1 = new ShippedFee();
        shippedFee1.setShippedDate("2019/7/5");
        shippedFee1.setShptNo("CKAS19070444");
        shippedFee1.setClp("SPS191422");
        shippedFee1.setCar("粤BG568U（客拖）");
        shippedFee1.setRoute("中海仓-平湖外运仓");
        shippedFee1.setCabinetType("3T");
        shippedFee1.setShippedCtns(new BigDecimal("913"));
        shippedFee1.setShippedVolume(new BigDecimal("6.27"));
        shippedFeeList.add(shippedFee1);

        ShippedFee shippedFee2 = new ShippedFee();
        shippedFee2.setShippedDate("2019/7/6");
        shippedFee2.setShptNo("CKAS19070402");
        shippedFee2.setClp("SPS190423");
        shippedFee2.setCar("粤BG558U（客拖1）");
        shippedFee2.setRoute("中海仓-平湖外运仓1");
        shippedFee2.setCabinetType("3T");
        shippedFee2.setShippedCtns(new BigDecimal("913"));
        shippedFee2.setShippedVolume(new BigDecimal("6.27"));
        shippedFeeList.add(shippedFee2);

        ShippedFeeQueryRespDto respDto = new ShippedFeeQueryRespDto();
        respDto.setTotal(3);
        respDto.setItems(shippedFeeList);

        return Resp.success("查询成功", respDto);
    }

    @PostMapping("exportShippedFee")
    @ApiOperation(value = "出仓费用导出", notes = "")
    public Resp<ShippedFeeExportRespDto> exportShippedFee(@RequestBody ShippedFeeExportReqDto reqDto) {
        logger.info("出仓费用导出.........{}", JSON.toJSON(reqDto) );

        List<ShippedFee> shippedFeeList = Lists.newArrayList();
        ShippedFee shippedFee = new ShippedFee();
        shippedFee.setShippedDate("2019/7/4");
        shippedFee.setShptNo("CKAS19070401");
        shippedFee.setClp("SPS190422");
        shippedFee.setCar("粤BG558U（客拖）");
        shippedFee.setRoute("中海仓-平湖外运仓");
        shippedFee.setCabinetType("3T");
        shippedFee.setShippedCtns(new BigDecimal("913"));
        shippedFee.setShippedVolume(new BigDecimal("6.27"));
        shippedFeeList.add(shippedFee);

        ShippedFee shippedFee1 = new ShippedFee();
        shippedFee1.setShippedDate("2019/7/5");
        shippedFee1.setShptNo("CKAS19070444");
        shippedFee1.setClp("SPS191422");
        shippedFee1.setCar("粤BG568U（客拖）");
        shippedFee1.setRoute("中海仓-平湖外运仓");
        shippedFee1.setCabinetType("3T");
        shippedFee1.setShippedCtns(new BigDecimal("913"));
        shippedFee1.setShippedVolume(new BigDecimal("6.27"));
        shippedFeeList.add(shippedFee1);

        ShippedFee shippedFee2 = new ShippedFee();
        shippedFee2.setShippedDate("2019/7/6");
        shippedFee2.setShptNo("CKAS19070402");
        shippedFee2.setClp("SPS190423");
        shippedFee2.setCar("粤BG558U（客拖1）");
        shippedFee2.setRoute("中海仓-平湖外运仓1");
        shippedFee2.setCabinetType("3T");
        shippedFee2.setShippedCtns(new BigDecimal("913"));
        shippedFee2.setShippedVolume(new BigDecimal("6.27"));
        shippedFeeList.add(shippedFee2);

        ShippedFee shippedFee3 = new ShippedFee();
        shippedFee3.setShippedDate("2019/7/15");
        shippedFee3.setShptNo("CKAS19070412");
        shippedFee3.setClp("SPS190433");
        shippedFee3.setCar("粤BG558E（客拖）");
        shippedFee3.setRoute("中海仓-平湖外运仓");
        shippedFee3.setCabinetType("3T");
        shippedFee3.setShippedCtns(new BigDecimal("913"));
        shippedFee3.setShippedVolume(new BigDecimal("6.27"));
        shippedFeeList.add(shippedFee3);

        ShippedFeeExportRespDto respDto = new ShippedFeeExportRespDto();
        respDto.setItems(shippedFeeList);

        return Resp.success("查询成功", respDto);
    }
}
