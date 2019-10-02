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
     * 落货纸号码
     * 表字段 : front_desk_charge.so
     */
    private String so;

    /**
     * 收据编码
     * 表字段 : front_desk_charge.receipt_no
     */
    private String receiptNo;

    /**
     * 客户名称
     * 表字段 : front_desk_charge.cust_name
     */
    private String custName;

    /**
     * 工厂名称
     * 表字段 : front_desk_charge.factory
     */
    private String factory;

    /**
     * 收费日期
     * 表字段 : front_desk_charge.tran_date
     */
    private String tranDate;

    /**
     * 项目名称
     * 表字段 : front_desk_charge.project_name
     */
    private String projectName;

    /**
     * 一车几单
     * 表字段 : front_desk_charge.bill_one_car
     */
    private Integer billOneCar;

    /**
     * 车牌号
     * 表字段 : front_desk_charge.car_num
     */
    private String carNum;

    /**
     * 支付方式  0 现金 1 微信支付
     * 表字段 : front_desk_charge.pay_type
     */
    private String payType;

    /**
     * 结算方式
     * 表字段 : front_desk_charge.settlement_type
     */
    private String settlementType;

    /**
     * 代收款合计
     * 表字段 : front_desk_charge.rec_amt
     */
    private BigDecimal recAmt;

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
     * 获取 落货纸号码 字段:front_desk_charge.so
     *
     * @return front_desk_charge.so, 落货纸号码
     */
    public String getSo() {
        return so;
    }

    /**
     * 设置 落货纸号码 字段:front_desk_charge.so
     *
     * @param so the value for front_desk_charge.so, 落货纸号码
     */
    public void setSo(String so) {
        this.so = so;
    }

    /**
     * 获取 收据编码 字段:front_desk_charge.receipt_no
     *
     * @return front_desk_charge.receipt_no, 收据编码
     */
    public String getReceiptNo() {
        return receiptNo;
    }

    /**
     * 设置 收据编码 字段:front_desk_charge.receipt_no
     *
     * @param receiptNo the value for front_desk_charge.receipt_no, 收据编码
     */
    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
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
     * 获取 工厂名称 字段:front_desk_charge.factory
     *
     * @return front_desk_charge.factory, 工厂名称
     */
    public String getFactory() {
        return factory;
    }

    /**
     * 设置 工厂名称 字段:front_desk_charge.factory
     *
     * @param factory the value for front_desk_charge.factory, 工厂名称
     */
    public void setFactory(String factory) {
        this.factory = factory;
    }

    /**
     * 获取 收费日期 字段:front_desk_charge.tran_date
     *
     * @return front_desk_charge.tran_date, 收费日期
     */
    public String getTranDate() {
        return tranDate;
    }

    /**
     * 设置 收费日期 字段:front_desk_charge.tran_date
     *
     * @param tranDate the value for front_desk_charge.tran_date, 收费日期
     */
    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
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
     * 获取 一车几单 字段:front_desk_charge.bill_one_car
     *
     * @return front_desk_charge.bill_one_car, 一车几单
     */
    public Integer getBillOneCar() {
        return billOneCar;
    }

    /**
     * 设置 一车几单 字段:front_desk_charge.bill_one_car
     *
     * @param billOneCar the value for front_desk_charge.bill_one_car, 一车几单
     */
    public void setBillOneCar(Integer billOneCar) {
        this.billOneCar = billOneCar;
    }

    /**
     * 获取 车牌号 字段:front_desk_charge.car_num
     *
     * @return front_desk_charge.car_num, 车牌号
     */
    public String getCarNum() {
        return carNum;
    }

    /**
     * 设置 车牌号 字段:front_desk_charge.car_num
     *
     * @param carNum the value for front_desk_charge.car_num, 车牌号
     */
    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    /**
     * 获取 支付方式  0 现金 1 微信支付 字段:front_desk_charge.pay_type
     *
     * @return front_desk_charge.pay_type, 支付方式  0 现金 1 微信支付
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置 支付方式  0 现金 1 微信支付 字段:front_desk_charge.pay_type
     *
     * @param payType the value for front_desk_charge.pay_type, 支付方式  0 现金 1 微信支付
     */
    public void setPayType(String payType) {
        this.payType = payType;
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
     * 获取 代收款合计 字段:front_desk_charge.rec_amt
     *
     * @return front_desk_charge.rec_amt, 代收款合计
     */
    public BigDecimal getRecAmt() {
        return recAmt;
    }

    /**
     * 设置 代收款合计 字段:front_desk_charge.rec_amt
     *
     * @param recAmt the value for front_desk_charge.rec_amt, 代收款合计
     */
    public void setRecAmt(BigDecimal recAmt) {
        this.recAmt = recAmt;
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