package com.hht.wms.core.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class StockStatisticsRespDto {
	
	
	//实时总库存体积
	private BigDecimal realTimeVolume;
	
	//实时总件数
	private int realTimePcs;
	
	//当天入库票数
	private int tickets;
	
	//当天入库总体积
	private BigDecimal veryDayVolume;
	
}
