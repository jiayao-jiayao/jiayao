package com.qf.j1902.controller;

import com.qf.j1902.pojo.User;

import com.qf.j1902.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2019/7/25.
 */
@RestController
public class LoginController {
@RequestMapping("login")
    public String login(@RequestParam("username") String name){
    System.out.println("name = " + name);
    return "login";
}
  }


