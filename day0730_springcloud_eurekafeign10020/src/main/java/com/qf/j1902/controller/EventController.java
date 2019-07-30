package com.qf.j1902.controller;
import com.qf.j1902.pojo.Event;
import com.qf.j1902.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * Created by 18209 on 2019/7/23.
 */
@Controller
public class EventController {
    @Autowired
    private EventService eventService;
    @RequestMapping(value = "/active",method = RequestMethod.GET)
    public String active(@RequestParam(value="page",defaultValue = "1") Integer page,
                         @RequestParam(value="size",defaultValue = "3") Integer pageSize,
                                     Model model){
        System.out.println(page+"---"+pageSize);
        List<Event> events = eventService.eventList(page, pageSize);
        System.out.println("feign::"+events);
        model.addAttribute("events", events);
        return "active";
    }

    @RequestMapping("/acdetal{id}")
    public String acdetal(@PathVariable("id") Integer id,Model model){

        return "acdetal";
    }
}
