package com.hht.wms.core.entity;

import java.util.Date;

/**
 * 
 * supplier_info
 *
 * @author hansh
 *
 * @mbg.generated
 */
public class SupplierInfo {
    /**
     * 主键id
     * 表字段 : supplier_info.id
     */
    private String id;

    /**
     * 客户名称
     * 表字段 : supplier_info.cust_name
     */
    private String custName;

    /**
     * 项目名称
     * 表字段 : supplier_info.project_name
     */
    private String projectName;

    /**
     * 供应商名称
     * 表字段 : supplier_info.supplier_name
     */
    private String supplierName;

    /**
     * 创建时间
     * 表字段 : supplier_info.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * 表字段 : supplier_info.update_time
     */
    private Date updateTime;

    /**
     * 获取 主键id 字段:supplier_info.id
     *
     * @return supplier_info.id, 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 主键id 字段:supplier_info.id
     *
     * @param id the value for supplier_info.id, 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 客户名称 字段:supplier_info.cust_name
     *
     * @return supplier_info.cust_name, 客户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置 客户名称 字段:supplier_info.cust_name
     *
     * @param custName the value for supplier_info.cust_name, 客户名称
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 获取 项目名称 字段:supplier_info.project_name
     *
     * @return supplier_info.project_name, 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置 项目名称 字段:supplier_info.project_name
     *
     * @param projectName the value for supplier_info.project_name, 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取 供应商名称 字段:supplier_info.supplier_name
     *
     * @return supplier_info.supplier_name, 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置 供应商名称 字段:supplier_info.supplier_name
     *
     * @param supplierName the value for supplier_info.supplier_name, 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 获取 创建时间 字段:supplier_info.create_time
     *
     * @return supplier_info.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:supplier_info.create_time
     *
     * @param createTime the value for supplier_info.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:supplier_info.update_time
     *
     * @return supplier_info.update_time, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:supplier_info.update_time
     *
     * @param updateTime the value for supplier_info.update_time, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}