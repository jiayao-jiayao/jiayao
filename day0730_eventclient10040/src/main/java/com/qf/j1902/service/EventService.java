package com.qf.j1902.service;

import com.github.pagehelper.PageInfo;
import com.qf.j1902.pojo.Event;


import java.util.List;

/**
 * Created by 18209 on 2019/7/24.
 */
public interface EventService {
    public List<Event> findAll(Integer page, Integer size);

    public int deleteByPrimaryKey(Integer eventId);

    public int insert(Event record);

    public int insertSelective(Event record);

    public Event selectByPrimaryKey(Integer eventId);


    public int updateByPrimaryKeySelective(Event record);


    public int updateByPrimaryKey(Event record);
}
