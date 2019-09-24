package com.hht.wms.core.util;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class ExcelUtil {
	
	
	
	/**
	 * @param cell
	 * @return 返回cell String类型值
	 */
	public static String getCellValue(Cell cell) {
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
		return cellValue ; 
	}
	
	
	public static void read(MultipartFile excelFile) throws Exception{
		
		if(excelFile.isEmpty()) {
			return ;
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

	}
	
	

}
