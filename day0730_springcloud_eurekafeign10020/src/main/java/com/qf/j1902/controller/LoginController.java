package com.qf.j1902.controller;

import com.qf.j1902.pojo.User;
import com.qf.j1902.service.LoginService;
import com.qf.j1902.vo.RegUser;
import com.qf.j1902.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 18209 on 2019/7/30.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("reg")
    public String reg(){
        return "reg";
    }
    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    public  String DengluView(UserVo userVo , Model model){
        System.out.println(userVo);
        int result = loginService.loginFetch(userVo.getUsername(), userVo.getPassword());
        System.out.println(result);
        if (result==200){
            model.addAttribute("username",userVo.getUsername());
            return "index";//登录成功
        }else {
            return "login";
        }
    }
    @RequestMapping(value = "/userreg",method = RequestMethod.POST)
    public String userreg(RegUser regUser){
        System.out.println(regUser);
        int i = loginService.adduser(regUser.getLoginName(),regUser.getLoginPwd(),regUser.getPhoneNum(),regUser.getYzCode());
        System.out.println(i);
        if (i == 200){
            return "login";
        }else {
            return "reg";
        }

    }
    @RequestMapping(value = "reg2",method = RequestMethod.POST)
    @ResponseBody
    public String yanzhengma(@RequestParam("phone") String phone){
        System.out.println(phone);
        String s = loginService.yanzhengma(phone);
        return s;

    }

}
