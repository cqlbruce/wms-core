package com.hht.wms.core.util;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;


public class NumberUtil {
	
	
	
	
	
	public static BigDecimal  strToBigDecimal(String str) {
		if(StringUtils.isEmpty(str)) {
			return BigDecimal.ZERO;
		}
		return new BigDecimal(str);
	}
	
	public static BigDecimal  getBigDecimal(BigDecimal decimal) {
		if(null == decimal ) {
			return BigDecimal.ZERO;
		}
		return decimal;
	}	

}
