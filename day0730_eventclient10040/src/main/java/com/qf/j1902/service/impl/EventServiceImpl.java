package com.qf.j1902.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1902.mapper.EventMapper;
import com.qf.j1902.pojo.Event;
import com.qf.j1902.service.EventService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


@Service
public class EventServiceImpl implements EventService {

    @Resource
    private EventMapper eventMapper;

    @Override
    public List<Event> findAll(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        List<Event> all = eventMapper.findAll();
        //PageInfo<Event> info = new PageInfo<>(all);
        return all;
    }

    public int deleteByPrimaryKey(Integer eventId){
        return eventMapper.deleteByPrimaryKey(eventId);
    }

    public int insert(Event record){
        return eventMapper.insert(record);
    }

    public int insertSelective(Event record){
        return eventMapper.insertSelective(record);
    }

    public Event selectByPrimaryKey(Integer eventId){
        return eventMapper.selectByPrimaryKey(eventId);
    }

    public int updateByPrimaryKeySelective(Event record){
        return eventMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Event record){
        return eventMapper.updateByPrimaryKey(record);
    }

}
