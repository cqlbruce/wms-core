package com.hht.wms.core.dao;

import com.hht.wms.core.entity.SupplierInfo;
import com.hht.wms.core.entity.SupplierInfoExample;
import java.util.List;

public interface SupplierInfoMapper {
    /**
     *  根据主键删除数据库的记录,supplier_info
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     *  新写入数据库记录,supplier_info
     *
     * @param record
     */
    int insert(SupplierInfo record);

    /**
     *  动态字段,写入数据库记录,supplier_info
     *
     * @param record
     */
    int insertSelective(SupplierInfo record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,supplier_info
     *
     * @param example
     */
    List<SupplierInfo> selectByExample(SupplierInfoExample example);

    /**
     *  根据指定主键获取一条数据库记录,supplier_info
     *
     * @param id
     */
    SupplierInfo selectByPrimaryKey(String id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,supplier_info
     *
     * @param record
     */
    int updateByPrimaryKeySelective(SupplierInfo record);

    /**
     *  根据主键来更新符合条件的数据库记录,supplier_info
     *
     * @param record
     */
    int updateByPrimaryKey(SupplierInfo record);
}