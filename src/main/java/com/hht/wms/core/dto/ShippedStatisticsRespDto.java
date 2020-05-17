package com.hht.wms.core.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ShippedStatisticsRespDto {
	
	
	//当天出仓总车数
	private int veryDayCarCount;
	
	//当天出仓总体积
	private BigDecimal veryDayShippedVolume;
	
	//当月出仓总体积
	private BigDecimal currentMonthShippedVolume;
	

}
