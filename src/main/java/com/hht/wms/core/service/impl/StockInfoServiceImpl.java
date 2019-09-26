package com.hht.wms.core.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hht.wms.core.dao.ShippedInfoMapper;
import com.hht.wms.core.dao.StockInfoMapper;
import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.DateUtil;
import com.hht.wms.core.util.NumberUtil;
import com.hht.wms.core.util.StrUtil;

@Service
public class StockInfoServiceImpl implements StockInfoService{
	
	
	@Autowired
	private StockInfoMapper stockInfoMapper ; 
	
	@Autowired
	private ShippedInfoMapper shippedInfoMapper ; 

	@Override
	public List<StockInfo> loadStock(StockInfoQueryReqDto reqDto) {
		
		List<StockInfo> stockInfo = stockInfoMapper.queryList(reqDto);
		return stockInfoMapper.queryList(reqDto);
	}

	@Override
	public int addStock(List<StockInfo> stockInfoList) {
		for(StockInfo info : stockInfoList) {
			
			//收货日期
			info.setRcvdDate(DateUtil.getNowTime(DateUtil.AMR_ARS_DATE_FORMAT));
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
	@Transactional
	public int outbound(OutboundReqDto reqDto) {
		
		//------查询 对应库存
		String id = StrUtil.getStockInfoId(reqDto.getSo(), reqDto.getPo(), reqDto.getSku());
		StockInfo stockInfo = stockInfoMapper.selectByPrimaryKey(id);
		
		//------扣减库存 计算
		
		//本次出仓箱数
		BigDecimal shippedCtns = new BigDecimal(reqDto.getPcs()).divide(new BigDecimal(stockInfo.getItemsPerBox()), 2 , RoundingMode.HALF_DOWN);
		//本次出仓毛重
		BigDecimal shippedGw = new BigDecimal(reqDto.getPcs()).multiply(stockInfo.getGwPerBoxActul()) ;
		//本次出仓净重
		BigDecimal shippedWeigh = new BigDecimal(reqDto.getPcs()).multiply(stockInfo.getCustsDeclaPieceWeigh()) ;
		//本次出仓体积
		BigDecimal shippedVolume = new BigDecimal(reqDto.getPcs()).multiply(stockInfo.getBoxPerVolumeActul()) ;
		
		
		//总出仓箱数
		stockInfo.setShippedCtns(stockInfo.getShippedCtns().add(shippedCtns));
		//总出仓件数
		stockInfo.setShippedPcs(reqDto.getPcs());
		//总出仓毛重
		stockInfo.setShippedGw(stockInfo.getShippedGw().add(shippedGw));
		//总出仓净重
		stockInfo.setShippedWeigh(stockInfo.getShippedWeigh().add(shippedWeigh));
		//总出仓体积
		stockInfo.setShippedVolume(stockInfo.getShippedVolume().add(shippedVolume));
		//总库存箱数
		stockInfo.setStockCtns(stockInfo.getStockCtns().subtract(shippedCtns));
		//总库存件数
		stockInfo.setStockPcs(stockInfo.getStockPcs()-reqDto.getPcs());
		//总库存毛重
		stockInfo.setStockGw(stockInfo.getStockGw().subtract(shippedGw));
		//总库存净重
		stockInfo.setStockWeigh(stockInfo.getStockWeigh().subtract(shippedWeigh));
		//总库存体积
		stockInfo.setStockVolume(stockInfo.getStockVolume().subtract(shippedVolume));
		
		//库存扣减后更新
		stockInfoMapper.updateByPrimaryKeySelective(stockInfo) ;
		
		//------生成出库记录
		ShippedInfo shippedInfo = new ShippedInfo();
		BeanUtils.copyProperties(stockInfo, shippedInfo);
		shippedInfo.setShippedNo(reqDto.getClp());
		shippedInfo.setShippedPcs(reqDto.getPcs());
		shippedInfo.setShippedCtns(shippedCtns);
		shippedInfo.setShippedGw(shippedGw);
		shippedInfo.setShippedVolume(shippedVolume);
		//成交总价
		shippedInfo.setDeclaTotalPrice(shippedInfo.getDeclaUnitPrice().multiply(new BigDecimal(reqDto.getPcs())));
		shippedInfoMapper.insertSelective(shippedInfo);	
		return 1;
	}

	
	
	
	
}
