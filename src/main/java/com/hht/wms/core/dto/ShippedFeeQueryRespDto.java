package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.dto.vo.ShippedFee;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:51
 * @Copyright © 2019-2020 ****有限公司
 */
public class ShippedFeeQueryRespDto {

    private int total ;

    List<ShippedFee> items ;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ShippedFee> getItems() {
        return items;
    }

    public void setItems(List<ShippedFee> items) {
        this.items = items;
    }
}
