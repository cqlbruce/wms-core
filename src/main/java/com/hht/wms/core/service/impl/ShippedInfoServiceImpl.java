package com.hht.wms.core.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
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
import com.hht.wms.core.dto.ShippedStatisticsRespDto;
import com.hht.wms.core.dto.vo.ShippedInfoVo;
import com.hht.wms.core.entity.ShippedAbstractInfo;
import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.ShippedAbstractService;
import com.hht.wms.core.service.ShippedInfoService;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.DateUtil;
import com.hht.wms.core.util.SnowFlakeUtil;

@Service
public class ShippedInfoServiceImpl extends ServiceImpl<ShippedInfoDao, ShippedInfo> implements ShippedInfoService{

	private static Logger logger = LoggerFactory.getLogger(ShippedInfoServiceImpl.class) ; 
	
	@Autowired
	private StockInfoService stockInfoService ; 
	
	@Autowired
	private ShippedAbstractService shippedAbstractService ; 
	
	@Override
	public List<ShippedInfo> queryListByClp(String clp) {
		return baseMapper.queryListByClp(clp);
	}
	
	
	@Override
	public List<ShippedInfoVo>  queryList(ShippedInfoReqDto reqDto) {
		logger.info("---ShippedInfoServiceImpl---reqDto-----{}",JSON.toJSON(reqDto));
		List<ShippedInfoVo> list =  baseMapper.queryList(reqDto);
		return list ;
	}
	

	
	@Override
	public ShippedInfoRespDto queryByPage(ShippedInfoReqDto reqDto) {
		logger.info("---ShippedInfoServiceImpl---reqDto-----{}",JSON.toJSON(reqDto));
		ShippedInfoRespDto respDto = new ShippedInfoRespDto();
		int total = baseMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<ShippedInfoVo> list =  baseMapper.queryByPage(reqDto);
		respDto.setItems(list);
		return respDto ;
	}
	
	@Override
	@Transactional
	public int outbound(OutboundReqDto reqDto) throws Exception{
		//------查询 对应库存
		List<StockInfo> stockInfoList = stockInfoService.queryByThreeElemet(reqDto.getSo(), reqDto.getPo(), reqDto.getItem());
		if(CollectionUtils.isEmpty(stockInfoList)) {
			logger.error("出仓失败，对应的库存信息不存在 {} " , JSON.toJSON(reqDto));
			throw new Exception("出仓失败，对应的库存信息不存在");
		}
		List<ShippedAbstractInfo> shippedAbstractInfoList = new ArrayList<ShippedAbstractInfo>();
		for(StockInfo stockInfo : stockInfoList) {
			logger.info("库存扣减前===={}",JSON.toJSON(stockInfo));
			//------扣减库存 计算
			//本次出仓箱数
//			BigDecimal shippedCtns = new BigDecimal(reqDto.getPcs()).divide(new BigDecimal(stockInfo.getItemsPerBox()), 2 , RoundingMode.HALF_DOWN);
			BigDecimal shippedCtns = reqDto.getCtns() ; 
			//本次出仓毛重
//			BigDecimal shippedGw = new BigDecimal(reqDto.getPcs()).multiply(stockInfo.getGwPerBoxActul()) ;
//			BigDecimal shippedGw = reqDto.getGw();
			BigDecimal shippedGw = shippedCtns.multiply(stockInfo.getGwPerBoxActul());
			//本次出仓净重
			BigDecimal shippedWeigh = new BigDecimal(reqDto.getPcs()).multiply(stockInfo.getCustsDeclaPieceWeigh()) ;
			//本次出仓体积
//			BigDecimal shippedVolume = new BigDecimal(reqDto.getPcs()).multiply(stockInfo.getBoxPerVolumeActul()) ;
//			BigDecimal shippedVolume = reqDto.getVolume();
			BigDecimal shippedVolume = shippedCtns.multiply(stockInfo.getBoxPerVolumeActul());
			
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
			BigDecimal stockCtns = stockInfo.getStockCtns().subtract(shippedCtns) ;
//			if(stockCtns.compareTo(BigDecimal.ZERO)<0) {
//				logger.error("出仓失败，库存箱数为负数{} " , stockCtns);
//				throw new Exception("出仓失败，库存箱数为负数");
//			}
			stockInfo.setStockCtns(stockCtns);
			//总库存件数
			int stockPcs = stockInfo.getStockPcs()-reqDto.getPcs() ; 
			if(stockPcs < 0) {
				logger.error("出仓失败，库存件数为负数{} " , stockPcs);
				throw new Exception("出仓失败，库存件数为负数,出仓单号:" + stockInfo.getInboundNo() + "...Po:"+ stockInfo.getPo() +"...item:" 
				+ stockInfo.getItem() + "...So:" + stockInfo.getSo() + "...库存PCS: " + stockInfo.getStockPcs() + "...待出仓PCS:" + reqDto.getPcs());
			}			
			stockInfo.setStockPcs(stockPcs);
			//总库存毛重
			BigDecimal stockGw = stockInfo.getStockGw().subtract(shippedGw) ; 
//			if(stockGw.compareTo(BigDecimal.ZERO)<0) {
//				logger.error("出仓失败，总库存毛重为负数{} " , stockGw);
//				throw new Exception("出仓失败，总库存毛重为负数");
//			}			
			stockInfo.setStockGw(stockGw);
			//总库存净重
			BigDecimal stockWeigh = stockInfo.getStockWeigh().subtract(shippedWeigh);
//			if(stockWeigh.compareTo(BigDecimal.ZERO)<0) {
//				logger.error("出仓失败，总库存净重为负数{} " , stockWeigh);
//				throw new Exception("出仓失败，总库存净重为负数");
//			}				
			stockInfo.setStockWeigh(stockWeigh);
			//总库存体积
			BigDecimal stockVolume = stockInfo.getStockVolume().subtract(shippedVolume);
//			if(stockVolume.compareTo(BigDecimal.ZERO)<0) {
//				logger.error("出仓失败，总库存体积为负数{} " , stockVolume);
//				throw new Exception("出仓失败，总库存体积为负数");
//			}				
			stockInfo.setStockVolume(stockVolume);
			stockInfo.setCreateTime(null);
			stockInfo.setUpdateTime(null);
			logger.info("库存扣减==后===={}",JSON.toJSON(stockInfo));
			//库存扣减后更新
			stockInfoService.updateStock(stockInfo) ;
			//------生成出库记录
			ShippedInfo shippedInfo = new ShippedInfo();
			BeanUtils.copyProperties(stockInfo, shippedInfo);
			shippedInfo.setClp(reqDto.getClp());
			shippedInfo.setShippedPcs(reqDto.getPcs());
			shippedInfo.setShippedCtns(shippedCtns);
			shippedInfo.setShippedGw(shippedGw);
			shippedInfo.setShippedDate(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
			shippedInfo.setShippedOrderDate(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
			shippedInfo.setShippedVolume(shippedVolume);
			shippedInfo.setShippedAllWeigh(shippedWeigh);
//			一、申报单位为 千克
//		    	出仓 成交数量 = PCS * 单件净重
//		    	出仓 成交单位: 千克
//		            二、申报单位为 非千克
//		                        出仓 成交数量 = PCS 
//		                        出仓 成交单位 = 申报单位
			if("千克".equals(stockInfo.getDeclaUnit())) {
				shippedInfo.setDeclaCount(new BigDecimal(reqDto.getPcs()).multiply(stockInfo.getCustsDeclaPieceWeigh()));
			}else {
				shippedInfo.setDeclaCount(new BigDecimal(reqDto.getPcs()));
			}
			
			shippedInfo.setCreateTime(null);
			shippedInfo.setPieceWeigh(stockInfo.getCustsDeclaPieceWeigh());
			shippedInfo.setCustomsMerchNo(stockInfo.getCustomsMerchNo());
			shippedInfo.setMerchName(stockInfo.getProductName());
			shippedInfo.setUpdateTime(null);
			shippedInfo.setId(SnowFlakeUtil.getNextId());
			logger.info("shippedInfo1======={}",JSON.toJSON(shippedInfo));
			//成交总价
			shippedInfo.setDeclaTotalPrice(shippedInfo.getDeclaUnitPrice().multiply(new BigDecimal(reqDto.getPcs())));
			logger.info("shippedInfo2======={}",JSON.toJSON(shippedInfo));
			
       	   	//出仓总批次
       	   	ShippedAbstractInfo saInfo = new ShippedAbstractInfo();
       	   	saInfo.setClp(shippedInfo.getClp());
       	   	saInfo.setCustId(stockInfo.getCustId());
       	   	saInfo.setShippedDate(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
       	   	shippedAbstractInfoList.add(saInfo);
       	   	
			baseMapper.insert(shippedInfo);
		}
		shippedAbstractService.addByShipped(shippedAbstractInfoList);	
		
 		return 1;
	}


	@Override
	public void batchUpdate(List<ShippedInfo> list) {
		baseMapper.batchUpdate(list);
	}


	@Override
	public ShippedStatisticsRespDto shippedStatics(String shippedDate) {
		// TODO Auto-generated method stub
		return baseMapper.shippedStatics(shippedDate);
	}


}
