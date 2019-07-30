package com.qf.j1902.controller;

import com.qf.j1902.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2019/7/25.
 */
@Controller
public class LoginController {

    @Autowired
    private loginService loginService;
    //处理登录
    @RequestMapping(value = "/userlogin")
    public  String DengluView(HttpServletRequest request){
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        String password = request.getParameter("password");
        System.out.println("password = " + password);
        String s = loginService.loginFetch(username);
        return s;
    }
//    public  String DengluView(UserVo userVo  , Model model){
//        System.out.println(userVo);
//
//
//
//        try{
//            Subject subject = SecurityUtils.getSubject();//从安全管理器中获取主体对象
//        //构建令牌对象
//            UsernamePasswordToken token =
//                    new UsernamePasswordToken(userVo.getUsername(),userVo.getPassword());  //赋身份信息 、赋凭证信
//           subject.login(token);//使用主体的login方法判定用户的权限
////
////            User usersByName = userService.getUsersByName(userVo.getUsername());
////
////
//            if (subject.isAuthenticated()){  //判断是否登陆成功
////
//              return "/menu";
//            }
//        } catch (AuthenticationException e) {
//            e.printStackTrace();
//        }
//
//        return "/index";
//    }


}
