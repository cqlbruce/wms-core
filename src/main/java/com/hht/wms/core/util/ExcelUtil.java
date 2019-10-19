package com.hht.wms.core.util;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.ClassPathResource;
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
	
	
	  /** 
	    * 得到一个已有的工作薄的POI对象 
	    * @return 
	    */  
    public static XSSFWorkbook returnWorkBookGivenFileHandle(String excelPath) {  

    	ClassPathResource classPathResource = new ClassPathResource(excelPath);
        XSSFWorkbook wb = null;  
        FileInputStream fis = null;  
        try {  
            if (classPathResource != null) {  
                InputStream inputStream = classPathResource.getInputStream();
                wb = new XSSFWorkbook(inputStream);  
            }  
        } catch (Exception e) {  
        	e.printStackTrace();
        	return null ; 
        } finally {  
            if (fis != null) {  
                try {  
                    fis.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return wb;  
    }  
	    
    /** 
     * 保存工作薄 
     * @param wb 
     */  
    public static byte[] saveExcel(XSSFWorkbook wb , String excelPath) {
        FileOutputStream fileOut = null;  
        try {  
            fileOut = new FileOutputStream(excelPath);  
            wb.write(fileOut);  
            fileOut.flush();
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally {
        	try {
        		if(null != fileOut) {
                	fileOut.close();  
        		}
        	}catch(Exception e) {
                e.printStackTrace();  
        	}
        }
        return null ; 
    }  
    
    /** 
     * 找到需要插入的行数，并新建一个POI的row对象 
     * @param sheet 
     * @param rowIndex 
     * @return 
     */  
    public static XSSFRow createRow(XSSFSheet sheet, Integer rowIndex) {  
         XSSFRow row = null;  
//         if (sheet.getRow(rowIndex) != null) {  
         int lastRowNo = sheet.getLastRowNum();  
         sheet.shiftRows(rowIndex, lastRowNo, 3);  
//         }  
         row = sheet.createRow(rowIndex);  
         return row;  
     }      
}
