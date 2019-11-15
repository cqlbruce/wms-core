package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.StockAbstractQueryReqDto;
import com.hht.wms.core.dto.StockAbstractQueryRespDto;
import com.hht.wms.core.dto.StockInfoModifyReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.StockAbstractService;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.ExcelUtil;
import com.hht.wms.core.util.NumberUtil;
import com.hht.wms.core.util.SnowFlakeUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/stock/")
@CrossOrigin 
public class StockController {
	private static Logger logger = LoggerFactory.getLogger(StockController.class) ; 
	
	@Autowired
	private StockAbstractService stockAbstractService ; 
	
	@Autowired
	private StockInfoService stockInfoService ; 
	
	@SuppressWarnings("unchecked")
	@PostMapping("load")
    @ApiOperation(value = "加载库存", notes = "")
	public Resp<StockInfoRespDto> loadStock(@RequestBody StockInfoQueryReqDto reqDto) {
 		logger.info("stock....load..........{}",JSON.toJSON(reqDto) );
		return Resp.success("加载库存成功" , stockInfoService.loadStock(reqDto));
    }

	
	@SuppressWarnings("unchecked")
	@PostMapping("add")
    @ApiOperation(value = "库存新增", notes = "")
	public Resp<StockInfoRespDto> addStock(@RequestBody StockInfo reqDto) throws Exception{
 		logger.info("addStock..............{}",JSON.toJSON(reqDto) );
 		List<StockInfo> stockList = new ArrayList<StockInfo>();
 		reqDto.setId(SnowFlakeUtil.getNextId());
 		//申报总价
 		reqDto.setDeclaTotalPrice(reqDto.getDeclaUnitPrice().multiply(new BigDecimal(reqDto.getRcvdPcs())));
 		stockList.add(reqDto);
 		stockInfoService.addStock(stockList);
		return Resp.success("库存新增成功");
    }	
	
	@SuppressWarnings("unchecked")
	@PostMapping("abstract/query")
    @ApiOperation(value = "库存概要信息查询", notes = "")
	public Resp<StockAbstractQueryRespDto> abstractQuery(@RequestBody StockAbstractQueryReqDto reqDto) {
		logger.info("-----StockAbstractController---query--req--{}",reqDto);
		StockAbstractQueryRespDto respDto = stockAbstractService.queryList(reqDto);
		return Resp.success("库存概要信息查询成功" , respDto );
	}	
		
	
	@SuppressWarnings("rawtypes")
	@PostMapping("update")
    @ApiOperation(value = "修改库存信息", notes = "")
	public Resp modifyStockInfo(@RequestBody StockInfoModifyReqDto reqDto) {
 		logger.info("modifyStockInfo..............{}",JSON.toJSON(reqDto) );
 		
 		StockInfo info = new StockInfo() ; 
 		BeanUtils.copyProperties(reqDto, info);
 		
		//实测单箱体积 = 长 * 宽 * 高
 		info.setBoxPerVolumeActul(info.getBoxHighActul().multiply(info.getBoxLengthActul()).multiply(info.getBoxWidthActul()));
 		info.setBoxAllVolumeActul(info.getBoxPerVolumeActul().multiply(new BigDecimal(info.getStockPcs())));
 		info.setStockVolume(info.getBoxPerVolumeActul().multiply(new BigDecimal(info.getStockPcs())));
 		
 		//单箱毛重
// 		reqDto.setGwPerBoxActul(NumberUtil.strToBigDecimal(reqDto.getGwPerBoxActul()));
 		//实收总毛重
 		info.setGwAllActul(info.getGwPerBoxActul().multiply(new BigDecimal(info.getStockPcs())));
 		info.setStockGw(info.getGwPerBoxActul().multiply(new BigDecimal(info.getStockPcs())));
 		
 		info.setDeclaTotalPrice(info.getDeclaUnitPrice().multiply(new BigDecimal(info.getStockPcs())));
 		
 		stockInfoService.updateStock(info);
		return Resp.success("修改成功");
    }	
	
	@Deprecated
	@PostMapping("outbound")
    @ApiOperation(value = "出库", notes = "")
	public Resp<?> outbound(@RequestBody OutboundReqDto reqDto) {
 		logger.info("outbound..............{}",JSON.toJSON(reqDto) );
// 		stockInfoService.outbound(reqDto);	
		return Resp.success("出库成功");
    }		
	
	
	@SuppressWarnings("deprecation")
	@PostMapping("/upload")
    @ApiOperation(value = "上传excl", notes = "")
	public Resp<?> fileUploadStock(@RequestParam("excelFile") MultipartFile excelFile , @RequestParam("inboundNo") String inboundNo ,@RequestParam("custId") String custId)  throws Exception {
	    String fileName = excelFile.getOriginalFilename();
 		logger.info("fileUpload..............fileName={}..inboundNo={}...custId={}",fileName,inboundNo,custId );
		if(excelFile.isEmpty()) {
			return Resp.fail("文件为空");
		}
		List<StockInfo> stockInfoList = new ArrayList<StockInfo>();
		Workbook wb  = new XSSFWorkbook(excelFile.getInputStream());   
		try{
			Sheet ss = wb.getSheetAt(2);
			
			//获取入仓单号
//			String inboundNo = "";
//			Row row1 = ss.getRow(23);
//			if(null!=row1&&null!=row1.getCell(1)) {
//				inboundNo = ExcelUtil.getCellValue(row1.getCell(1));
//			}
			//从25行开始
			for(int i=25 ; i<ss.getLastRowNum();i++) {
				Row row = ss.getRow(i);
	       	   	if(null==row||null == row.getCell(0)) {
	       	   		break ; 
	       	   	}
	       	   	//如果第0列为空，则直接返回
	       	   	row.getCell(0).setCellType(CellType.STRING);
	       	   	if(StringUtils.isEmpty(row.getCell(0).getStringCellValue())) {
	       	   		continue ; 
	       	   	}	       	   
	       	   	StockInfo info = new StockInfo();
	       	   	
	       	   	info.setInboundNo(inboundNo);
	       	   	info.setCustId(custId);
	       	   	
	       	   	//第一列SO
	       	   	info.setSo(ExcelUtil.getCellValue(row.getCell(1)));
	       	   	//第四列PO
	       	   	info.setPo(ExcelUtil.getCellValue(row.getCell(4)));
	       	   	//第五列sku item
	       	   	info.setItem(ExcelUtil.getCellValue(row.getCell(5)));
//	       	    info.setId(id);
	       	   	//第9列 箱数-实收箱数
	       	   	int rcvdCtns = Integer.parseInt(ExcelUtil.getCellValue(row.getCell(9)));
	       	   	info.setRcvdCtns(rcvdCtns);
	       	   	//第11列 数量-实收件数 -- 成交数量
	       	   	int rcvdPcs = Integer.parseInt(ExcelUtil.getCellValue(row.getCell(11))) ;
	       	   	info.setRcvdPcs(rcvdPcs);
	       	   	//第10列 每箱数量 -- 计算，excel表有些为空
//	       	   	info.setItemsPerBox(rcvdPcs/rcvdCtns);           	   
	       	   	//第12列 单位 PCS -- 成交单位
	       	    info.setTransactionUnit(ExcelUtil.getCellValue(row.getCell(12)));
           	   
	       	   	//第15列 长 
	       	   	info.setBoxLengthActul(new BigDecimal("0"));
	       	   	//16列 宽
	       	   	info.setBoxWidthActul(new BigDecimal("0"));
	       	   	//17列 高
	       	   	info.setBoxHighActul(new BigDecimal("0"));
	       	   	//18 体积 CBM
	       	   	
	       	   	//19 体积计算单位 
           	   
	       	   	//20 车牌 --
	       	    info.setCarNum(ExcelUtil.getCellValue(row.getCell(20)));
	       	    
	       	    //21 混装编号
	       	    
           	   
	       	   	//22 海关编码 
	       	    info.setCustomsNo(ExcelUtil.getCellValue(row.getCell(22)));
           	   
	       	   	//23商检代码
	       	   	info.setCustomsMerchNo(ExcelUtil.getCellValue(row.getCell(23)));
	       	   	//24 报关品名 --
	       	    info.setProductName(ExcelUtil.getCellValue(row.getCell(24)));
           	   
	       	   	//25 申报要素 --
           	   
	       	   	//26 申报数量  与 第11列 数量有什么区别
           	   
	       	   	//27 申报单位 
	       	   	info.setDeclaUnit(ExcelUtil.getCellValue(row.getCell(27)));
	       	   	//28 申报单价
	       	   	info.setDeclaUnitPrice(NumberUtil.strToBigDecimal(ExcelUtil.getCellValue(row.getCell(28))));
	       	   	//29 申报价值 申报总价
	       	   	info.setDeclaTotalPrice(NumberUtil.strToBigDecimal(ExcelUtil.getCellValue(row.getCell(29))));
	       	   	//30 申报币种
	       	   	info.setDeclaCurrency(ExcelUtil.getCellValue(row.getCell(30)));
	       	   	//31 第一法定数量
	       	   	int legalCount = Integer.parseInt(ExcelUtil.getCellValue(row.getCell(31)));
	       	    info.setFirstLegalCount(legalCount);
	       	   	//32 第一法定单位
	       	    info.setFirstUnitMeasurement(ExcelUtil.getCellValue(row.getCell(32)));
	       	    
	       	   	//33 第二法定数量
	       	    int secondLegalCount = Integer.parseInt(ExcelUtil.getCellValue(row.getCell(33)));
	       	    info.setSecondLegalCount(secondLegalCount);
           	   
	       	   	//34 第二法定单位
	       	    info.setSecondUnitMeasurement(ExcelUtil.getCellValue(row.getCell(34)));
           	   
	       	   	//35 总毛重
           	   
	       	   	//36 总净重
	       	    info.setCustsDeclaAllWeigh(NumberUtil.strToBigDecimal(ExcelUtil.getCellValue(row.getCell(36))));
	       	   	//37 出口国别 最终目的国
	       	    info.setDestCountry(ExcelUtil.getCellValue(row.getCell(37)));
	       	   	//38 手册备案序号--
           	   
	       	   	//41 重量单位
           	   
	       	   	//42 体积单位
           	   
	       	   	// 43 原产国
           	   
	       	   	//44 境内货源地
           	   
	       	   	//45 产地代码
           	   
	       	   	// 46 备注
	       	 	info.setId(SnowFlakeUtil.getNextId());
	       	 	info.setGwPerBoxActul(new BigDecimal("0"));
	       	   	stockInfoList.add(info);
	        }
		}catch(Exception e) {
        	logger.error("库存文件导入出错"  , e );
			return Resp.fail("库存文件导入出错");
        }finally{
			wb.close();
		}
		logger.info("excl文件解析成功,导入数据==={}",JSON.toJSON(stockInfoList));
		try {
			stockInfoService.addStock(stockInfoList);
		}catch(Exception e) {
			logger.error("fileUploadStock has an errors " , e);
			return Resp.fail(e.getMessage());
		}
		return Resp.success("uploadStock");
	}
	

}
