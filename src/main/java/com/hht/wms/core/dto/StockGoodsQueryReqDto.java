/**
 * Copyright (C), 2018-2019, 深圳惠金卓信科技有限公司
 * FileName: StockGoodsQueryReqDto
 * Author:   MG01873
 * Date:     2019/9/24 17:39
 * Description: 进仓货物查询请求
 * History:
 */
package com.hht.wms.core.dto;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈进仓货物查询请求〉
 *
 * @author MG01873
 * @create 2019/9/24
 * @since 1.0.0
 */
@Data
public class StockGoodsQueryReqDto {

    private int page;

    private int limit;
    
	private String item ;
	
	private String inbundNo ;     

    private String beginDate;

    private String endDate;

    private String so;

    private String po;

}