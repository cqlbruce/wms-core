package com.hht.wms.core.dto;

import com.hht.wms.core.entity.ShippedFee;

import java.util.List;

/**
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:53
 * @Copyright © 2019-2020 ****有限公司
 */
public class ShippedFeeExportRespDto {

    List<ShippedFee> items ;

    public List<ShippedFee> getItems() {
        return items;
    }

    public void setItems(List<ShippedFee> items) {
        this.items = items;
    }
}
