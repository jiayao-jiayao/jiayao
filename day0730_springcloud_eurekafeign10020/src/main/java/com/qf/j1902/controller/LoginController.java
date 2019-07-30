package com.qf.j1902.controller;

import com.qf.j1902.pojo.User;
import com.qf.j1902.service.LoginService;
import com.qf.j1902.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 18209 on 2019/7/30.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    public  String DengluView(UserVo userVo , Model model){
        String result = loginService.loginFetch(userVo.getUsername(), userVo.getPassword());

        return "index";
    }
}
