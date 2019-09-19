package com.hht.wms.core.dao;

import com.hht.wms.core.entity.ShippedInfo;
import com.hht.wms.core.entity.ShippedInfoExample;
import java.util.List;

public interface ShippedInfoMapper {
    /**
     *  根据主键删除数据库的记录,shipped_info
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     *  新写入数据库记录,shipped_info
     *
     * @param record
     */
    int insert(ShippedInfo record);

    /**
     *  动态字段,写入数据库记录,shipped_info
     *
     * @param record
     */
    int insertSelective(ShippedInfo record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,shipped_info
     *
     * @param example
     */
    List<ShippedInfo> selectByExample(ShippedInfoExample example);

    /**
     *  根据指定主键获取一条数据库记录,shipped_info
     *
     * @param id
     */
    ShippedInfo selectByPrimaryKey(String id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,shipped_info
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ShippedInfo record);

    /**
     *  根据主键来更新符合条件的数据库记录,shipped_info
     *
     * @param record
     */
    int updateByPrimaryKey(ShippedInfo record);
}