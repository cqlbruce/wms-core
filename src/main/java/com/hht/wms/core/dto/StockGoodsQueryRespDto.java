/**
 * Copyright (C), 2018-2019, 深圳惠金卓信科技有限公司
 * FileName: StockGoodsQueryRespDto
 * Author:   MG01873
 * Date:     2019/9/24 17:40
 * Description: 进仓货物查询返回DTO
 * History:
 */
package com.hht.wms.core.dto;

import com.hht.wms.core.entity.StockGoods;

import java.util.List;

/**
 * 〈进仓货物查询返回DTO〉
 *
 * @author MG01873
 * @create 2019/9/24
 * @since 1.0.0
 */
public class StockGoodsQueryRespDto {

    private int total;

    List<StockGoods> items;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<StockGoods> getItems() {
        return items;
    }

    public void setItems(List<StockGoods> items) {
        this.items = items;
    }
}