package com.hht.wms.core.controller;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.service.ShippedInfoService;
import com.hht.wms.core.util.ExcelUtil;
import com.hht.wms.core.util.SnowFlakeUtil;

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
		return Resp.success("出仓数据查询成功" , shippedInfoService.queryList(reqDto));
    }

	
	@PostMapping("/upload")
    @ApiOperation(value = "导入excl,批量出仓", notes = "")
	public Resp<?> fileUploadShipped(@RequestParam("excelFile") MultipartFile excelFile)  throws Exception {
	    String fileName = excelFile.getOriginalFilename();
 		logger.info("...fileUploadShipped...............{}",fileName );
		if(excelFile.isEmpty()) {
			return Resp.fail("文件为空");
		}
		List<OutboundReqDto> outList = new ArrayList<OutboundReqDto>();
		Workbook wb  = new XSSFWorkbook(excelFile.getInputStream());   
		try{
			Sheet ss = wb.getSheetAt(0);
			Row row1 = ss.getRow(0);
			String clp = "";
			if(null!=row1&&null!=row1.getCell(1)) {
				//出仓单号
				clp = ExcelUtil.getCellValue(row1.getCell(1)) ;
			}
			//从25行开始
			for(int i=2 ; i<ss.getLastRowNum();i++) {
				Row row = ss.getRow(i);
	       	   	if(null==row||null == row.getCell(0)) {
	       	   		break ; 
	       	   	}
	       	   	//如果第0列为空，则直接返回
	       	   	row.getCell(0).setCellType(CellType.STRING);
	       	   	if(StringUtils.isEmpty(row.getCell(0).getStringCellValue())) {
	       	   		continue ; 
	       	   	}	       	   
				OutboundReqDto outboundReqDto = new OutboundReqDto(); 
				outboundReqDto.setClp(clp);
				outboundReqDto.setId(SnowFlakeUtil.getNewNextId());
				outboundReqDto.setPo(ExcelUtil.getCellValue(row.getCell(0)));
				outboundReqDto.setSo(ExcelUtil.getCellValue(row.getCell(1)));
				outboundReqDto.setSku(ExcelUtil.getCellValue(row.getCell(2)));
	       	   	int pcs = Integer.parseInt(ExcelUtil.getCellValue(row.getCell(3))) ;
	       	   	outboundReqDto.setPcs(pcs);
	       	   	outList.add(outboundReqDto);
	        }

		}finally{
			wb.close();
		}
		if(CollectionUtils.isNotEmpty(outList)) {
			for(OutboundReqDto reqDto:outList){
				shippedInfoService.outbound(reqDto);	
			}
		}
		return Resp.success("uploadStock");
	}
	
	@RequestMapping("download")
    @ApiOperation(value = "出仓数据导出", notes = "")
	public byte[] shippedInfodownload(@RequestBody ShippedInfoReqDto reqDto) {
 		logger.info("......shippedInfoReqDto..............{}",JSON.toJSON(reqDto) );
 		
 		ShippedInfoRespDto shippedInfoDto =  shippedInfoService.queryList(reqDto) ;
 		if(CollectionUtils.isEmpty(shippedInfoDto.getItems())) {
 			return null ; 
 		}
 		//从第二行插进入
 		int startInsertRow = 2 ; 
 		String shipInfoTemplate= "fileTemplate/shipInfoTemplate.xlsx"; 
 		String shipInfoUrl = "A:/temp/aa.xlsx" ;
// 		String shipInfoUrl = new StringBuffer("/data/app/file/wms-core/shipInfo")
//			.append(reqDto.getShippedNo())
//			.append(DateUtil.getNowTime(DateUtil.FULL_DATETIME_FORMAT))
//			.append(".xlsx")
//			.toString();
 		XSSFWorkbook wb = ExcelUtil.returnWorkBookGivenFileHandle(shipInfoTemplate); 
        XSSFSheet sheet = wb.getSheetAt(0);  
        List<ShippedInfo> siList = shippedInfoDto.getItems() ; 
        int declaCountAll = 0 ; 
        int pcsAll = 0 ; 
        BigDecimal gwAll = BigDecimal.ZERO;
        BigDecimal allWeighAll = BigDecimal.ZERO;
        BigDecimal volumeAll = BigDecimal.ZERO;
        
        for(int i=0 ; i<siList.size() ; i++) {
 			ShippedInfo shipInfo = (ShippedInfo)siList.get(i) ; 
 	        XSSFRow row = sheet.createRow(i+startInsertRow);  
 	        //生成列
 	        row.createCell((short) 0).setCellValue(shipInfo.getShippedDate());//入仓还是出仓日期？
 	        row.createCell((short) 1).setCellValue("");//供应商信息
 	        row.createCell((short) 2).setCellValue(shipInfo.getSo()); 	        
 	        row.createCell((short) 3).setCellValue(shipInfo.getCustomsMeterialNo());//物料号
 	        row.createCell((short) 4).setCellValue(shipInfo.getCustomsMerchNo());//海关编码 	        
 	        row.createCell((short) 5).setCellValue("");//货物名称
 	        int declaCount = shipInfo.getDeclaCount()==null? 0 : shipInfo.getDeclaCount() ;
 	        declaCountAll += declaCount ;
 	        row.createCell((short) 6).setCellValue(declaCount);//申报数量     
 	        row.createCell((short) 7).setCellValue(shipInfo.getDeclaUnit());//申报单位
 	        int pcs = shipInfo.getShippedPcs() ;
 	        pcsAll += pcs ; 
 	        row.createCell((short) 8).setCellValue(shipInfo.getShippedPcs());//件数   
 	        row.createCell((short) 9).setCellValue("");//包装单位
 	        BigDecimal gw = shipInfo.getShippedGw() ;
 	        gwAll = gwAll.add(gw);
 	        row.createCell((short) 10).setCellValue(gw.toString());//出仓毛重       
 	        
 	        BigDecimal allWeigh = shipInfo.getShippedAllWeigh() ;
 	        allWeighAll = allWeighAll.add(allWeigh);
 	        row.createCell((short) 11).setCellValue(allWeigh.toString());//净重
 	        BigDecimal volume = shipInfo.getShippedVolume() ;
 	        volumeAll = volumeAll.add(volume);
 	        row.createCell((short) 12).setCellValue(volume.toString());//体积        
 	        row.createCell((short) 13).setCellValue(shipInfo.getDeclaTotalPrice().toString());//价值
 	        row.createCell((short) 14).setCellValue(shipInfo.getDeclaCurrency());//币种        
        }
        
        int rowNum = sheet.getLastRowNum() ;
	    XSSFRow row1 = sheet.createRow(rowNum+1);  
	    row1.createCell((short) 5).setCellValue("合计：");//入仓还是出仓日期？
	    row1.createCell((short) 6).setCellValue(declaCountAll);
	    row1.createCell((short) 8).setCellValue(pcsAll);
	    row1.createCell((short) 10).setCellValue(gwAll.toString());
	    row1.createCell((short) 11).setCellValue(allWeighAll.toString());
	    row1.createCell((short) 13).setCellValue(volumeAll.toString());
	    
	    XSSFRow row2 = sheet.createRow(rowNum+3);  
	    row2.createCell((short) 0).setCellValue("柜号：");//入仓还是出仓日期？
	    row2.createCell((short) 3).setCellValue("柜重：");//入仓还是出仓日期？
	    
	    XSSFRow row3 = sheet.createRow(rowNum+5);
	    row3.createCell((short) 0).setCellValue("封条：");//入仓还是出仓日期？

	    
//	    row1.createCell((short) 5).setCellValue("合计：");//入仓还是出仓日期？
//	    Cell cell6 = row1.createCell((short) 6);
//	    .setCellStyle(CellType.FORMULA).setCellFormula("SUM(G3:G"+rowNum+")");
//	    cell6.setCellType(CellType.FORMULA);
//	    cell6.setCellFormula("SUM(G3:G"+rowNum+")");
//	    Cell cell8 = row1.createCell((short) 8);
//	    cell8.setCellType(CellType.FORMULA);
//	    cell8.setCellFormula("SUM(I3:I"+rowNum+")");
//	    row1.createCell((short) 10).setCellFormula("SUM(K3:K"+rowNum+")");
//	    row1.createCell((short) 11).setCellFormula("SUM(L3:L"+rowNum+")");
//	    row1.createCell((short) 13).setCellFormula("SUM(N3:N"+rowNum+")");
//		cell.setCellType(XSSFCell.CELL_TYPE_FORMULA);
//		cell.setCellFormula("SUM(C2:C3)");

	    wb.setForceFormulaRecalculation(true);
        ExcelUtil.saveExcel(wb,shipInfoUrl);
        
        FileInputStream inputStream = null ; 
        ByteArrayOutputStream bos = null ; 
        try {
            inputStream = new FileInputStream(shipInfoUrl);
            bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int len;
            while((len = inputStream.read(b)) != -1) {
                bos.write(b, 0, len);
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }finally {
        	try {
            	inputStream.close();
            	bos.close();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        return bos.toByteArray();
    }
	
	
}
