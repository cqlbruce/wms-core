package com.hht.wms.core.dao;

import com.hht.wms.core.entity.UserInfo;
import com.hht.wms.core.entity.UserInfoExample;
import java.util.List;

public interface UserInfoMapper {
    /**
     *  根据主键删除数据库的记录,user_info
     *
     * @param userId
     */
    int deleteByPrimaryKey(String userId);

    /**
     *  新写入数据库记录,user_info
     *
     * @param record
     */
    int insert(UserInfo record);

    /**
     *  动态字段,写入数据库记录,user_info
     *
     * @param record
     */
    int insertSelective(UserInfo record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,user_info
     *
     * @param example
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     *  根据指定主键获取一条数据库记录,user_info
     *
     * @param userId
     */
    UserInfo selectByPrimaryKey(String userId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,user_info
     *
     * @param record
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     *  根据主键来更新符合条件的数据库记录,user_info
     *
     * @param record
     */
    int updateByPrimaryKey(UserInfo record);
    
    List<UserInfo> selectAll();
}