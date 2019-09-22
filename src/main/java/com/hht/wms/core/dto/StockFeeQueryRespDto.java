package com.hht.wms.core.dto;

import com.hht.wms.core.entity.StockFee;
import com.hht.wms.core.entity.StockInfo;

import java.util.List;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 2:58
 * @Copyright © 2019-2020 ****有限公司
 */
public class StockFeeQueryRespDto {
    private int total ;

    List<StockFee> items ;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<StockFee> getItems() {
        return items;
    }

    public void setItems(List<StockFee> items) {
        this.items = items;
    }
}
