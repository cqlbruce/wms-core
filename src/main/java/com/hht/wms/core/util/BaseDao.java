package com.hht.wms.core.util;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface BaseDao<T> extends BaseMapper<T>{
	
	
    /**
     * 查询实体集合
     *
     * @param map Map
     * @return List<T>
     */
    List<T> queryList(Map<String, Object> map);
    
    /**
     * 查询总数
     *
     * @param map Map
     * @return int
     */
    int queryTotal(Map<String, Object> map);
	

}
