package com.hht.wms.core.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.hht.wms.core.entity.FrontDeskCharge;

import lombok.Data;

/**
 **入仓费用查询
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:00
 * @Copyright © 2019-2020 ****有限公司
 */
@Data
public class StockFeeQueryReqDto {
	
	
	//客户ID
	private String custId ; 
	
	//项目名称
	private String projectId ;
	
	//进仓日期
	private String rcvdDate ;
	
	//入仓落纸号
	private String so ; 
	
	//车牌号
	private String carNum ; 
	
	//柜号 
	private String cntrNo;
	
	//实收箱数
	private int rcvdCtns ;
	
	//实收总体积
    private BigDecimal boxAllVolumeActul;
    
    //入仓报关费
    private BigDecimal customsDeclarationFee;
    
    //续页费
    private BigDecimal continuationSheetFee;
    
    //入闸费
    private BigDecimal enterGateFee;
    
    //装卸单价
    private BigDecimal unloadUnitPrice;
    
    //卸货费
    private BigDecimal unloadFee;
    
    //混装费
    private BigDecimal assortedPackingFee ;
    
    //加班费
    private BigDecimal overtimeFee;
    
    //删单费
    private BigDecimal delBillFee ; 
    
    //查货/商检费
    private BigDecimal commercialInspectionFee;
    
    //运输费
    private BigDecimal trafficFee ; 

    //押车费
    private BigDecimal pledgeCarFee;
    
    //代垫费
    private BigDecimal paymentInAdvanceFee;
    
    //代垫税费
    private BigDecimal paymentInAdvanceTaxFee;

    
    //合计
    private BigDecimal total ; 
    
    private String beginDate;

    private String endDate;

    private int page ;

    private int limit ;

}
