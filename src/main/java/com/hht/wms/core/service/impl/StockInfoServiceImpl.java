package com.hht.wms.core.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.dao.FrontDeskChargeMapper;
import com.hht.wms.core.dao.ShippedInfoMapper;
import com.hht.wms.core.dao.StockInfoMapper;
import com.hht.wms.core.dto.OutboundReqDto;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.entity.ThreeElement;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.DateUtil;
import com.hht.wms.core.util.SnowFlakeUtil;

@Service
public class StockInfoServiceImpl implements StockInfoService{
	
	private static Logger logger = LoggerFactory.getLogger(StockInfoServiceImpl.class) ; 

	
	@Autowired
	private StockInfoMapper stockInfoMapper ; 
	
	@Autowired
	private ShippedInfoMapper shippedInfoMapper ; 
	
	@Autowired
	private FrontDeskChargeMapper frontDeskChargeMapper ; 

	@Override
	public StockInfoRespDto loadStock(StockInfoQueryReqDto reqDto) {
		logger.info("StockInfoServiceImpl ---loadStock-----{}",JSON.toJSON(reqDto));
		StockInfoRespDto respDto = new StockInfoRespDto();
		int total = stockInfoMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<StockInfo> list =  stockInfoMapper.queryList(reqDto);
		respDto.setItems(list);
		return respDto ;
	}

	@Override
	@Transactional
	public int addStock(List<StockInfo> stockInfoList) {
		int i = 0 ; 
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
			
			info.setShippedCtns(BigDecimal.ZERO);
			info.setShippedGw(BigDecimal.ZERO);
			info.setShippedPcs(0);
			info.setShippedVolume(BigDecimal.ZERO);
			info.setShippedWeigh(BigDecimal.ZERO);
			
			logger.info("add stock info ==========={} " , JSON.toJSON(info) );
			//增加库存
			i+=stockInfoMapper.insertSelective(info);
			
			if(StringUtils.isNotEmpty(info.getInboundNo())) {
				FrontDeskCharge charge = frontDeskChargeMapper.selectByInboundNo(info.getInboundNo());
				charge.setCustName(info.getSupplierName());
				charge.setSo(info.getSo());
				charge.setFactory(info.getSupplierName());
//				charge.setCarNum(info.set);
				frontDeskChargeMapper.updateByPrimaryKeySelective(charge);
			}
		}
		return i;
	}

	@Override
	public int updateStock(StockInfo stockInfo) {
		
		logger.info("stockInfo============{}" , JSON.toJSON(stockInfo));
		int i = stockInfoMapper.updateByPrimaryKeySelective(stockInfo);
		return i;
		
	}

	@Override
	@Transactional
	public int outbound(OutboundReqDto reqDto) {
		
		//------查询 对应库存
//		String id = StrUtil.getStockInfoId(reqDto.getSo(), reqDto.getPo(), reqDto.getSku());
//		StockInfo stockInfo = stockInfoMapper.selectByPrimaryKey(id);
		ThreeElement te = new ThreeElement();
		te.setPo(reqDto.getPo());
		te.setSku(reqDto.getSku());
		te.setSo(reqDto.getSo());
		StockInfo stockInfo = stockInfoMapper.queryByThreeElemet(te);
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
		stockInfoMapper.updateByPrimaryKeySelective(stockInfo) ;
		
		//------生成出库记录
		ShippedInfo shippedInfo = new ShippedInfo();
		BeanUtils.copyProperties(stockInfo, shippedInfo);
		shippedInfo.setShippedNo(reqDto.getClp());
		shippedInfo.setShippedPcs(reqDto.getPcs());
		shippedInfo.setShippedCtns(shippedCtns);
		shippedInfo.setShippedGw(shippedGw);
		shippedInfo.setShippedDate(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
		shippedInfo.setShippedVolume(shippedVolume);
		shippedInfo.setCreateTime(null);
		shippedInfo.setUpdateTime(null);
		shippedInfo.setId(SnowFlakeUtil.getNextId());
		logger.info("shippedInfo1======={}",JSON.toJSON(shippedInfo));

		//成交总价
		shippedInfo.setDeclaTotalPrice(shippedInfo.getDeclaUnitPrice().multiply(new BigDecimal(reqDto.getPcs())));
		logger.info("shippedInfo2======={}",JSON.toJSON(shippedInfo));
		shippedInfoMapper.insertSelective(shippedInfo);	
		return 1;
	}

	
	
	
	
}
