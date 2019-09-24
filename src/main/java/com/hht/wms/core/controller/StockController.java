package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
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
import com.hht.wms.core.dto.StockInfoModifyReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.ExcelUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/stock/")
@CrossOrigin 
public class StockController {
	private static Logger logger = LoggerFactory.getLogger(StockController.class) ; 
	
	@Autowired
	private StockInfoService stockInfoService ; 
	
	@SuppressWarnings("unchecked")
	@PostMapping("load")
    @ApiOperation(value = "加载库存", notes = "")
	public Resp<StockInfoRespDto> loadStock(@RequestBody StockInfoQueryReqDto reqDto) {
 		logger.info("stock....load..........{}",JSON.toJSON(reqDto) );
 		List<StockInfo> stockInfoList = stockInfoService.loadStock(reqDto) ;
 		StockInfoRespDto respDto = new StockInfoRespDto();
 		if(CollectionUtils.isEmpty(stockInfoList)) {
 			respDto.setTotal(0);
 		}else {
 	 		respDto.setItems(stockInfoList);
 	 		respDto.setTotal(stockInfoList.size());
 		}
		return Resp.success("加载库存成功" , respDto);
    }

	
	@SuppressWarnings("unchecked")
	@PostMapping("add")
    @ApiOperation(value = "库存新增", notes = "")
	public Resp<StockInfoRespDto> addStock(@RequestBody StockInfo reqDto) {
 		logger.info("addStock..............{}",JSON.toJSON(reqDto) );
 		List<StockInfo> stockList = new ArrayList<StockInfo>();
 		stockList.add(reqDto);
 		stockInfoService.addStock(stockList);
		return Resp.success("库存新增成功");
    }	
	
	@SuppressWarnings("rawtypes")
	@PostMapping("modify")
    @ApiOperation(value = "修改库存信息", notes = "")
	public Resp modifyStockInfo(@RequestBody StockInfo reqDto) {
 		logger.info("modifyStockInfo..............{}",JSON.toJSON(reqDto) );
 		stockInfoService.updateStock(reqDto);
		return Resp.success("修改成功");
    }	
	
	@PostMapping("outbound")
    @ApiOperation(value = "出库", notes = "")
	public Resp outbound(@RequestBody OutboundReqDto reqDto) {
 		logger.info("outbound..............{}",JSON.toJSON(reqDto) );

	
		return Resp.success("出库成功");
    }		
	
	
	@PostMapping("/fileUpload")
    @ApiOperation(value = "上传excl", notes = "")
	public Resp uploadStock(@RequestParam("excelFile") MultipartFile excelFile)  throws Exception {
	    String fileName = excelFile.getOriginalFilename();
 		logger.info("fileUpload..............{}",fileName );
		if(excelFile.isEmpty()) {
			return Resp.fail("文件为空");
		}
		Workbook wb  = new XSSFWorkbook(excelFile.getInputStream());   
		try{
			Sheet ss = wb.getSheetAt(1);
			List<StockInfo> stockInfoList = new ArrayList<StockInfo>();
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
           	   //第一列SO
           	   info.setSo(ExcelUtil.getCellValue(row.getCell(1)));
           	   //第四列PO
           	   info.setPo(ExcelUtil.getCellValue(row.getCell(4)));
           	   //第五列sku item
           	   info.setSku(ExcelUtil.getCellValue(row.getCell(5)));
           	   //第9列 箱数-实收箱数
           	   int rcvdCtns = Integer.parseInt(ExcelUtil.getCellValue(row.getCell(9)));
           	   info.setRcvdCtns(rcvdCtns);
           	   //第11列 数量-实收件数
           	   int rcvdPcs = Integer.parseInt(ExcelUtil.getCellValue(row.getCell(11))) ;
           	   info.setRcvdPcs(rcvdPcs);
           	   //第10列 每箱数量 -- 计算，excel表有些为空
           	   info.setItemsPerBox(rcvdPcs/rcvdCtns);           	   
           	   //第12列 单位 PCS 
           	   
           	   //第15列 长 
           	   
           	   //16列 宽
           	   
           	   //17列 高
           	   
           	   //18 体积 CBM
           	   
           	   //19 体积计算单位 
           	   
           	   //20 车牌 --
           	   
           	   //22 海关编码 
           	   
           	   //23商检代码
           	   
           	   //24 报关品名 --
           	   
           	   //25 申报要素 --
           	   
           	   //26 申报数量  与 第11列 数量有什么区别
           	   
           	   //27 申报单位 
           	   
           	   //28 申报单价
           	   
           	   //29 申报价值
           	   
           	   //30 申报币种
           	   
           	   //31 第一法定数量
           	   
           	   //32 第一法定单位
           	   
           	   //33 第二法定数量
           	   
           	   //34 第二法定单位
           	   
           	   //35 总毛重
           	   
           	   //36 总净重
           	   
           	   //37 出口国别
           	   
           	   //38 手册备案序号--
           	   
           	   //41 重量单位
           	   
           	   //42 体积单位
           	   
           	   // 43 原产国
           	   
           	   //44 境内货源地
           	   
           	   //45 产地代码
           	   
           	   // 46 备注
           	   
           	   
           	   
           	   
	       	   for(int j=1 ; j<row.getRowNum() ; j++) {
	       		   
	       		   
	       	   }
	       	   
	          System.out.print("第"+(i)+"行 不为空  ");
	          System.out.println("第0列" + row.getCell(0));
	          System.out.println("第1列" + row.getCell(1));
	          //得到列对象
	          Iterator<Cell> cellIterator = row.cellIterator(); 
	               int columnCount=0; 
	               //循环每一列            	
	               while (cellIterator.hasNext()){
	                   //System.out.print("第"+(columnCount++)+"列:  ");
	                       //得到单元格对象
	                       Cell cell = cellIterator.next();
	               		   String cellValue = "";
	               		
	                   }
	        }
		}finally{
			wb.close();
		}
		return Resp.success("uploadStock");
	}
	

}
