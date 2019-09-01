package com.hht.wms.core.dao;

import com.hht.wms.core.entity.FrontDeskCharge;
import com.hht.wms.core.entity.FrontDeskChargeExample;
import java.util.List;

public interface FrontDeskChargeMapper {
    /**
     *  根据主键删除数据库的记录,front_desk_charge
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     *  新写入数据库记录,front_desk_charge
     *
     * @param record
     */
    int insert(FrontDeskCharge record);

    /**
     *  动态字段,写入数据库记录,front_desk_charge
     *
     * @param record
     */
    int insertSelective(FrontDeskCharge record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,front_desk_charge
     *
     * @param example
     */
    List<FrontDeskCharge> selectByExample(FrontDeskChargeExample example);

    /**
     *  根据指定主键获取一条数据库记录,front_desk_charge
     *
     * @param id
     */
    FrontDeskCharge selectByPrimaryKey(String id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,front_desk_charge
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FrontDeskCharge record);

    /**
     *  根据主键来更新符合条件的数据库记录,front_desk_charge
     *
     * @param record
     */
    int updateByPrimaryKey(FrontDeskCharge record);
}