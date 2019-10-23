package com.hht.wms.core.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hht.wms.core.dao.ShippedInfoDao;
import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.ShippedInfoReqDto;
import com.hht.wms.core.dto.ShippedInfoRespDto;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.ShippedInfoService;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.DateUtil;
import com.hht.wms.core.util.SnowFlakeUtil;

@Service
public class ShippedInfoServiceImpl extends ServiceImpl<ShippedInfoDao, ShippedInfo> implements ShippedInfoService{

	private static Logger logger = LoggerFactory.getLogger(ShippedInfoServiceImpl.class) ; 
	
	@Autowired
	private StockInfoService stockInfoService ; 
	
	@Override
	public ShippedInfoRespDto queryList(ShippedInfoReqDto reqDto) {
		logger.info("ShippedInfoServiceImpl ---reqDto-----{}",JSON.toJSON(reqDto));
		ShippedInfoRespDto respDto = new ShippedInfoRespDto();
		int total = baseMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<ShippedInfo> list =  baseMapper.queryList(reqDto);
		respDto.setItems(list);
		return respDto ;
	}
	
	@Override
	@Transactional
	public int outbound(OutboundReqDto reqDto) throws Exception{
		//------查询 对应库存
		StockInfo stockInfo = stockInfoService.queryByThreeElemet(reqDto.getSo(), reqDto.getPo(), reqDto.getSku());
		if(null == stockInfo) {
			logger.error("出仓失败，对应的库存信息不存在 {} " , JSON.toJSON(reqDto));
			throw new Exception("出仓失败，对应的库存信息不存在");
		}
		logger.info("库存扣减前===={}",JSON.toJSON(stockInfo));
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
		stockInfo.setShippedPcs(stockInfo.getShippedPcs() + reqDto.getPcs());
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
		stockInfo.setCreateTime(null);
		stockInfo.setUpdateTime(null);
		logger.info("库存扣减==后===={}",JSON.toJSON(stockInfo));
		//库存扣减后更新
		stockInfoService.updateStock(stockInfo) ;
		//------生成出库记录
		ShippedInfo shippedInfo = new ShippedInfo();
		BeanUtils.copyProperties(stockInfo, shippedInfo);
		shippedInfo.setShippedNo(reqDto.getClp());
		shippedInfo.setShippedPcs(reqDto.getPcs());
		shippedInfo.setShippedCtns(shippedCtns);
		shippedInfo.setShippedGw(shippedGw);
		shippedInfo.setShippedDate(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
		shippedInfo.setShippedVolume(shippedVolume);
		shippedInfo.setShippedAllWeigh(shippedWeigh);
		shippedInfo.setCreateTime(null);
		shippedInfo.setUpdateTime(null);
		shippedInfo.setId(SnowFlakeUtil.getNextId());
		logger.info("shippedInfo1======={}",JSON.toJSON(shippedInfo));
		//成交总价
		shippedInfo.setDeclaTotalPrice(shippedInfo.getDeclaUnitPrice().multiply(new BigDecimal(reqDto.getPcs())));
		logger.info("shippedInfo2======={}",JSON.toJSON(shippedInfo));
 		return baseMapper.insert(shippedInfo);
	}	

}
