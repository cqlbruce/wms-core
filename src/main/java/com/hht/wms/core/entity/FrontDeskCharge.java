package com.hht.wms.core.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * front_desk_charge
 *
 * @author hansh
 *
 * @mbg.generated
 */
public class FrontDeskCharge {
    /**
     * 主键id
     * 表字段 : front_desk_charge.id
     */
    private String id;

    /**
     * 入仓编号
     * 表字段 : front_desk_charge.inbound_no
     */
    private String inboundNo;

    /**
     * 客户名称
     * 表字段 : front_desk_charge.cust_name
     */
    private String custName;

    /**
     * 项目名称
     * 表字段 : front_desk_charge.project_name
     */
    private String projectName;

    /**
     * 车牌号
     * 表字段 : front_desk_charge.plate_num
     */
    private String plateNum;

    /**
     * 结算方式
     * 表字段 : front_desk_charge.settlement_type
     */
    private String settlementType;

    /**
     * 入闸费
     * 表字段 : front_desk_charge.enter_gate_fee
     */
    private BigDecimal enterGateFee;

    /**
     * 报关费
     * 表字段 : front_desk_charge.customs_declaration_fee
     */
    private BigDecimal customsDeclarationFee;

    /**
     * 创建日期
     * 表字段 : front_desk_charge.create_date
     */
    private String createDate;

    /**
     * 创建时间
     * 表字段 : front_desk_charge.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : front_desk_charge.update_time
     */
    private Date updateTime;

    /**
     * 获取 主键id 字段:front_desk_charge.id
     *
     * @return front_desk_charge.id, 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 主键id 字段:front_desk_charge.id
     *
     * @param id the value for front_desk_charge.id, 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 入仓编号 字段:front_desk_charge.inbound_no
     *
     * @return front_desk_charge.inbound_no, 入仓编号
     */
    public String getInboundNo() {
        return inboundNo;
    }

    /**
     * 设置 入仓编号 字段:front_desk_charge.inbound_no
     *
     * @param inboundNo the value for front_desk_charge.inbound_no, 入仓编号
     */
    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    /**
     * 获取 客户名称 字段:front_desk_charge.cust_name
     *
     * @return front_desk_charge.cust_name, 客户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置 客户名称 字段:front_desk_charge.cust_name
     *
     * @param custName the value for front_desk_charge.cust_name, 客户名称
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 获取 项目名称 字段:front_desk_charge.project_name
     *
     * @return front_desk_charge.project_name, 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置 项目名称 字段:front_desk_charge.project_name
     *
     * @param projectName the value for front_desk_charge.project_name, 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取 车牌号 字段:front_desk_charge.plate_num
     *
     * @return front_desk_charge.plate_num, 车牌号
     */
    public String getPlateNum() {
        return plateNum;
    }

    /**
     * 设置 车牌号 字段:front_desk_charge.plate_num
     *
     * @param plateNum the value for front_desk_charge.plate_num, 车牌号
     */
    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    /**
     * 获取 结算方式 字段:front_desk_charge.settlement_type
     *
     * @return front_desk_charge.settlement_type, 结算方式
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * 设置 结算方式 字段:front_desk_charge.settlement_type
     *
     * @param settlementType the value for front_desk_charge.settlement_type, 结算方式
     */
    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    /**
     * 获取 入闸费 字段:front_desk_charge.enter_gate_fee
     *
     * @return front_desk_charge.enter_gate_fee, 入闸费
     */
    public BigDecimal getEnterGateFee() {
        return enterGateFee;
    }

    /**
     * 设置 入闸费 字段:front_desk_charge.enter_gate_fee
     *
     * @param enterGateFee the value for front_desk_charge.enter_gate_fee, 入闸费
     */
    public void setEnterGateFee(BigDecimal enterGateFee) {
        this.enterGateFee = enterGateFee;
    }

    /**
     * 获取 报关费 字段:front_desk_charge.customs_declaration_fee
     *
     * @return front_desk_charge.customs_declaration_fee, 报关费
     */
    public BigDecimal getCustomsDeclarationFee() {
        return customsDeclarationFee;
    }

    /**
     * 设置 报关费 字段:front_desk_charge.customs_declaration_fee
     *
     * @param customsDeclarationFee the value for front_desk_charge.customs_declaration_fee, 报关费
     */
    public void setCustomsDeclarationFee(BigDecimal customsDeclarationFee) {
        this.customsDeclarationFee = customsDeclarationFee;
    }

    /**
     * 获取 创建日期 字段:front_desk_charge.create_date
     *
     * @return front_desk_charge.create_date, 创建日期
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 设置 创建日期 字段:front_desk_charge.create_date
     *
     * @param createDate the value for front_desk_charge.create_date, 创建日期
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间 字段:front_desk_charge.create_time
     *
     * @return front_desk_charge.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:front_desk_charge.create_time
     *
     * @param createTime the value for front_desk_charge.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:front_desk_charge.update_time
     *
     * @return front_desk_charge.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:front_desk_charge.update_time
     *
     * @param updateTime the value for front_desk_charge.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}