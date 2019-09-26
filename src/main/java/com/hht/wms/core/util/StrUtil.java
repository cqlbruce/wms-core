package com.hht.wms.core.util;

public class StrUtil {
	
	
	public static String getStockInfoId(String so , String po , String sku ) {
    	return new StringBuilder().append(so == null ? "" : so).append(po==null ? "" : po).append(sku==null ? "": sku).toString() ;  
	}

}
