package com.hht.wms.core.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		
		if(excelFile.isEmpty()) {
			return Resp.fail("文件为空");
		}
		
		 Workbook wb  = new XSSFWorkbook(excelFile.getInputStream());   
		//遍历Sheet页
		for(int sheet=0; sheet < wb.getNumberOfSheets(); sheet++){
			Sheet s = wb.getSheetAt(sheet);
			System.out.println(s.getSheetName());
		}
		Sheet ss = wb.getSheetAt(1);
		   //得到行的迭代器  
        Iterator<Row> rowIterator = ss.iterator();  
        int rowCount=0;
        //循环每一行
       while (rowIterator.hasNext()){
    	   System.out.print("第"+(rowCount++)+"行  ");
           //得到一行对象  
           Row row = rowIterator.next();  
           //得到列对象 
           Iterator<Cell> cellIterator = row.cellIterator();  
           int columnCount=0; 
           //循环每一列
           while (cellIterator.hasNext()){
           //System.out.print("第"+(columnCount++)+"列:  ");
               //得到单元格对象
               Cell cell = cellIterator.next();
       		   String cellValue = "";

       		// 判断数据的类型
       		   switch (cell.getCellType()) {
       		   	case NUMERIC: // 数字
    			cell.setCellType(CellType.STRING);
    			cellValue = cell.getStringCellValue();
    			break;
       		   	case STRING: // 字符串
    			cell.setCellType(CellType.STRING);
    			cellValue = cell.getStringCellValue();
    			break;
       			case BOOLEAN: // Boolean
       				cell.setCellType(CellType.STRING);
       				cellValue = cell.getStringCellValue();
       				break;
       			case FORMULA: // 公式
       				cell.setCellType(CellType.STRING);
       				cellValue = cell.getStringCellValue();
       				break;
       			case BLANK: // 空值
       				cellValue = "";
       				break;
       			case ERROR: // 故障
       				cellValue = "非法字符";
       				break;
       			default:
       				cellValue = "未知类型";
       				break;
       		   }
       		   if("报关单行号".equals(cellValue)) {
       			   System.out.println("cellValue===" + row.getRowNum());
       			   
       		   }
           }
    	   
        }

		
		
	    System.out.println("filename===upload=====" );
	    String fileName = excelFile.getOriginalFilename();
	    System.out.println("filename========" + fileName);
//		ExcelUtils.
		return Resp.success("uploadStock");
	}
	

}
