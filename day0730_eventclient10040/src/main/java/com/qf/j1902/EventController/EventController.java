package com.qf.j1902.EventController;

import com.github.pagehelper.PageInfo;

import com.qf.j1902.pojo.Event;
import com.qf.j1902.service.EventService;
import org.apache.ibatis.ognl.DynamicSubscript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

/**
 * Created by 18209 on 2019/7/23.
 */
@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/eventList",method = RequestMethod.GET)
    public List<Event> active(@RequestParam(value="page",defaultValue = "1") Integer page,
                         @RequestParam(value="size",defaultValue = "3") Integer pageSize,
                                     Model model){
        System.out.println(page+",and,"+pageSize);
        List<Event> all = eventService.findAll(page, pageSize);
        System.out.println(all);

        return all;
    }

    @RequestMapping("/acdetal{id}")
    public Event acdetal(@PathVariable("id") Integer id){
        System.out.println(id);
        Event event = eventService.selectByPrimaryKey(id);

        return event;
    }
}
