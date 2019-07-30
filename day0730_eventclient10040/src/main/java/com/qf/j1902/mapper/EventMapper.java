package com.qf.j1902.mapper;


import com.qf.j1902.pojo.Event;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* Created by Mybatis Generator 2019/07/23
*/
@Mapper
public interface EventMapper {
    List<Event> findAll();

    int deleteByPrimaryKey(Integer eventId);

    int insert(Event record);

    int insertSelective(Event record);

    Event selectByPrimaryKey(Integer eventId);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);
}