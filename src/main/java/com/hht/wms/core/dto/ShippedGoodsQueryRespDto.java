/**
 * Copyright (C), 2018-2019, 深圳惠金卓信科技有限公司
 * FileName: ShippedGoodsQueryRespDto
 * Author:   MG01873
 * Date:     2019/9/24 18:44
 * Description:
 * History:
 */
package com.hht.wms.core.dto;

import java.util.List;

import com.hht.wms.core.entity.ShippedInfo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author MG01873
 * @create 2019/9/24
 * @since 1.0.0
 */
public class ShippedGoodsQueryRespDto {

    private int total;

    List<ShippedInfo> items;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

	public List<ShippedInfo> getItems() {
		return items;
	}

	public void setItems(List<ShippedInfo> items) {
		this.items = items;
	}


}