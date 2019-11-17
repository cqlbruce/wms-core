package com.hht.wms.core.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class StockInfoModifyReqDto {
	
    /**
     * 主键 id
     * 表字段 : stock_info.id
     */
    private String id;
    /**
     * 入仓编号
     * 表字段 : stock_info.inbound_no
     */
    private String inboundNo;
    /**
     * 入仓落货纸号
     * 表字段 : stock_info.so
     */
    private String so;
    /**
     * 客户采购订单号
     * 表字段 : stock_info.po
     */
    private String po;
    /**
     * 货物款号 asn-item
     * 表字段 : stock_info.sku
     */
    private String item;
    /**
     * 实收箱数
     * 表字段 : stock_info.rcvd_ctns
     */
    private Integer rcvdCtns;

    /**
     * 单箱毛重
     * 表字段 : stock_info.gw_per_box_actul
     */
    private BigDecimal gwPerBoxActul;

    /**
     * 实测外箱长L
     * 表字段 : stock_info.box_length_actul
     */
    private BigDecimal boxLengthActul;

    /**
     * 实测外箱宽W
     * 表字段 : stock_info.box_width_actul
     */
    private BigDecimal boxWidthActul;

    /**
     * 实测外箱高H
     * 表字段 : stock_info.box_high_actul
     */
    private BigDecimal boxHighActul;

    /**
     * 仓库位置
     * 表字段 : stock_info.warehouse_position
     */
    private String warehousePosition;
    
    private String remark ; 

  
}
