package com.qf.j1902.service;

import com.qf.j1902.pojo.Event;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by 18209 on 2019/7/30.
 */
@Service
@FeignClient("cloud-zuul")
public interface EventService {
    @RequestMapping("event-client/eventList")
    public List<Event> eventList(@RequestParam(value="page",defaultValue = "1") Integer page,
                                 @RequestParam(value="size",defaultValue = "3") Integer pageSize);
}
