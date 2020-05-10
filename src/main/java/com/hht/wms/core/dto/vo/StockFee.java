package com.hht.wms.core.dto.vo;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Data;

/**
 * 进仓费用
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.entity
 * @date 2019/9/22 2:50
 * @Copyright © 2019-2020 ****有限公司
 */
@Data
public class StockFee {
	
	
	
	//客户ID
	private String custId ; 
	
	//项目名称
	private String projectId ;
	
	//进仓日期
	private String rcvdDate ;
	
	private String po ; 
	
	private String item;

    /**
               * 入仓落货纸号
     */
    private String so;
    
    /**
     * 入仓编号
     * 表字段 : stock_info.inbound_no
     */
    private String inboundNo;
	
	
    /**
     * 车牌号
     * 表字段 : front_desk_charge.car_num
     */
    private String carNum;
	
    /**
     * 柜号
     */
    private String cntrNo;
    
    //入仓总箱数
    private Integer rcvdCtns;

    //入仓总体积
    private BigDecimal boxAllVolumeActul;
    
    //入仓报关费
    private BigDecimal customsDeclarationFee;

    //续页费
    private BigDecimal continuationSheetFee ; 

    //入闸费
    private BigDecimal enterGateFee;
    
    //装卸单价
    private BigDecimal unloadUnitPrice;

    //卸货费
    private BigDecimal unloadFee;

    //混装费
    private BigDecimal assortedPackingFee;
    
    //加班费
    private BigDecimal overtimeFee;

    //删单费
    private BigDecimal delBillFee;
    
    //查货/商检费
    private BigDecimal commercialInspectionFee;
    
    //运输费
    private BigDecimal trafficFee;    
    
    //押车费
    private BigDecimal pledgeCarFee;      
    
    //代垫费
    private BigDecimal paymentInAdvanceFee;  
    
    //代垫税费
    private BigDecimal paymentInAdvanceTaxFee;  
    
    //费用合计
    private BigDecimal total;  

    /**
               * 总库存箱数
     */
    private BigDecimal stockCtns;

    /**
               *  总库存体积
     */
    private BigDecimal stockVolume;
    
    
    

}
