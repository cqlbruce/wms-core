package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.dto.vo.StockFee;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:09
 * @Copyright © 2019-2020 ****有限公司
 */
public class StockFeeExportRespDto {

    List<StockFee> items ;

    public List<StockFee> getItems() {
        return items;
    }

    public void setItems(List<StockFee> items) {
        this.items = items;
    }
}
