package com.hht.wms.core.dto;

/**
 **入仓费用查询
 * @author 蓝小路
 * @version V1.0
 * @Package com.hht.wms.core.dto
 * @date 2019/9/22 3:00
 * @Copyright © 2019-2020 ****有限公司
 */
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
	
//	private 
	
    private String beginDate;

    private String endDate;

    private int page ;

    private int limit ;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
