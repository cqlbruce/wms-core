package com.hht.wms.core.dao;

import java.util.List;

import com.hht.wms.core.dto.StockInfoQueryReqDto;
import com.hht.wms.core.entity.StockInfo;
import com.hht.wms.core.entity.StockInfoExample;

public interface StockInfoMapper {
    /**
     *  根据主键删除数据库的记录,stock_info
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     *  新写入数据库记录,stock_info
     *
     * @param record
     */
    int insert(StockInfo record);

    /**
     *  动态字段,写入数据库记录,stock_info
     *
     * @param record
     */
    int insertSelective(StockInfo record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,stock_info
     *
     * @param example
     */
    List<StockInfo> selectByExample(StockInfoExample example);

    /**
     *  根据指定主键获取一条数据库记录,stock_info
     *
     * @param id
     */
    StockInfo selectByPrimaryKey(String id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,stock_info
     *
     * @param record
     */
    int updateByPrimaryKeySelective(StockInfo record);

    /**
     *  根据主键来更新符合条件的数据库记录,stock_info
     *
     * @param record
     */
    int updateByPrimaryKey(StockInfo record);
    
    List<StockInfo> queryList(StockInfoQueryReqDto reqDto);
    
    int selectCount(StockInfoQueryReqDto reqDto);
    
    
}