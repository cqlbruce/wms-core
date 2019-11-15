package com.hht.wms.core.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hht.wms.core.dao.FrontDeskChargeDao;
import com.hht.wms.core.dao.StockAbstractInfoDao;
import com.hht.wms.core.dao.StockInfoDao;
import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.dto.StockInfoRespDto;
import com.hht.wms.core.dto.vo.ThreeElement;
import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.entity.StockAbstractInfo;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.service.FrontDeskChargeService;
import com.hht.wms.core.service.StockInfoService;
import com.hht.wms.core.util.DateUtil;

@Service
public class StockInfoServiceImpl extends ServiceImpl<StockInfoDao, StockInfo> implements StockInfoService{
	
	private static Logger logger = LoggerFactory.getLogger(StockInfoServiceImpl.class) ; 

	
	@Autowired
	private StockAbstractInfoDao stockAbstractInfoDao ; 
	
	@Autowired
	private FrontDeskChargeService frontDeskChargeService ; 
	
	@Autowired
	private FrontDeskChargeDao frontDeskChargeMapper ; 


	@Override
	public StockInfoRespDto loadStock(StockInfoQueryReqDto reqDto) {
		logger.info("---StockInfoServiceImpl---loadStock-----{}",JSON.toJSON(reqDto));
		StockInfoRespDto respDto = new StockInfoRespDto();
		int total = baseMapper.selectCount(reqDto);
		if(total==0) {
			respDto.setTotal(0);
			return respDto ;
		}
		respDto.setTotal(total);
		int beginSize = (reqDto.getPage()-1) * reqDto.getSize() ; 
		reqDto.setBeginSize(beginSize);
		List<StockInfo> list =  baseMapper.queryList(reqDto);
		respDto.setItems(list);
		return respDto ;
	}

	@Override
	@Transactional
	public int addStock(List<StockInfo> stockInfoList) throws Exception{
		int i = 0 ; 
		List<StockAbstractInfo> abstractInfoList = new ArrayList<StockAbstractInfo>(); 
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

			if(null == info.getBoxLengthActul()||null==info.getBoxWidthActul()||null == info.getBoxHighActul()||null ==info.getGwPerBoxActul()) {
				info.setStatus("0");
			}else {
				info.setStatus("1");
			}
			
			info.setShippedCtns(BigDecimal.ZERO);
			info.setShippedGw(BigDecimal.ZERO);
			info.setShippedPcs(0);
			info.setShippedVolume(BigDecimal.ZERO);
			info.setShippedWeigh(BigDecimal.ZERO);
			
			logger.info("add stock info ==========={} " , JSON.toJSON(info) );
			//增加库存记录
			FrontDeskCharge charge = frontDeskChargeMapper.selectByInboundNo(info.getInboundNo());
			if(null != charge) {
				info.setCarNum(charge.getCarNum());
			}
			i+=baseMapper.insert(info);
			
			
			StockAbstractInfo stockAbstractInfo = new StockAbstractInfo();
//			stockAbstractInfo.setId(SnowFlakeUtil.getNewNextId());
			stockAbstractInfo.setCustId(info.getCustId());
			stockAbstractInfo.setInboundNo(info.getInboundNo());
			stockAbstractInfo.setCarNum(info.getCarNum());
			
			//更新总条目，这里关键是总条目的状态，状态与所有明细状态有关系  insertOrUpdate。
			abstractInfoList.add(stockAbstractInfo);
			
			//更新前台收费信息，注意事务测试 , 不一定存在，存在则更新 
			frontDeskChargeService.updateByInboundNo(info);
		}
		stockAbstractInfoDao.insertOrUpdate(abstractInfoList);

		return i;
	}

	@Override
	public int updateStock(StockInfo info) {
		logger.info("stockInfo============{}" , JSON.toJSON(info));
		if(null == info.getBoxLengthActul()||null==info.getBoxWidthActul()||null == info.getBoxHighActul()||null ==info.getGwPerBoxActul()) {
			info.setStatus("0");
		}else {
			info.setStatus("1");
		}
		int i = baseMapper.updateById(info);
		return i;
	}
	
	public List<StockInfo> queryByThreeElemet(String so , String po , String item) {
		ThreeElement te = new ThreeElement();
		te.setPo(po);
		te.setItem(item);
		te.setSo(so);
//		StockInfo stockInfo = 
		return baseMapper.queryByThreeElemet(te);
	}


	
}
