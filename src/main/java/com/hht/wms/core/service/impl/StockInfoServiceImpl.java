package com.hht.wms.core.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hht.wms.core.dao.StockInfoMapper;
import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.DateUtil;

@Service
public class StockInfoServiceImpl implements StockInfoService{
	
	
	@Autowired
	private StockInfoMapper stockInfoMapper ; 

	@Override
	public List<StockInfo> loadStock(StockInfoQueryReqDto reqDto) {
		
		List<StockInfo> stockInfo = stockInfoMapper.queryList(reqDto);
		return stockInfoMapper.queryList(reqDto);
	}

	@Override
	public int addStock(List<StockInfo> stockInfoList) {
		for(StockInfo info : stockInfoList) {
			
			//收货日期
			info.setRcvdDate(DateUtil.getNowTime(DateUtil.AMR_NOMAL_DATE_FORMAT));
			//一箱几件
       	   	info.setItemsPerBox(info.getRcvdPcs()/info.getRcvdCtns());           	   

			//实收总毛重 = 每箱毛重 * 实收件数
			info.setGwAllActul(info.getGwPerBoxActul().multiply(new BigDecimal(info.getRcvdPcs())));
			//实测单箱体积 = 长 * 宽 * 高
			info.setBoxPerVolumeActul(info.getBoxHighActul().multiply(info.getBoxLengthActul()).multiply(info.getBoxWidthActul()));
			//实测总体积 = 实测单箱体积 * 件数
			info.setBoxAllVolumeActul(info.getBoxPerVolumeActul().multiply(new BigDecimal(info.getRcvdPcs())));
			//入仓报关单件净重 四舍五入 保留两位小数
			info.setCustsDeclaPieceWeigh(info.getCustsDeclaAllWeigh().divide(new BigDecimal(info.getRcvdPcs()), 2 , RoundingMode.HALF_DOWN));
			//总库存箱数
			info.setStockCtns(new BigDecimal(info.getRcvdCtns()));
			//总库存件数
			info.setStockPcs(info.getRcvdPcs());
			//总库存毛重
			info.setStockGw(info.getGwAllActul());
			//总库存净重
			info.setStockWeigh(info.getCustsDeclaAllWeigh());
			//总库存体积
			info.setStockVolume(info.getBoxAllVolumeActul());
			stockInfoMapper.insertSelective(info);
		}
		return 0;
	}

	@Override
	public int updateStock(StockInfo stockInfo) {
		
		int i = stockInfoMapper.updateByPrimaryKeySelective(stockInfo);

		return i;
	}

	@Override
	public int outbound(OutboundReqDto reqDto) {
		
		
		
		return 0;
	}

	
	
	
	
}
