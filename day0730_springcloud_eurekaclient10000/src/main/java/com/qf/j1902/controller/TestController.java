package com.qf.j1902.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 18209 on 2019/7/30.
 */
@RestController
public class TestController {
    @RequestMapping("login")
    public String login(@RequestParam("username") String name){
        System.out.println("name = " + name);
        return "login";
    }
}
