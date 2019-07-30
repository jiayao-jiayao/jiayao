package com.qf.j1902.controller;

import com.aliyuncs.exceptions.ClientException;
import com.qf.j1902.pojo.User;
import com.qf.j1902.service.UserService;
import com.qf.j1902.utils.SmsUtil;
import com.qf.j1902.vo.RegUser;
import com.qf.j1902.vo.UserVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by 18209 on 2019/7/30.
 */
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    //处理登录
    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    public  String DengluView(UserVo userVo , Model model){
        User user = userService.getUsersByName(userVo.getUsername());
        System.out.println(user.getLoginName());
        if (user!=null){
            if (user.getLoginPwd().equals(userVo.getPassword())){
                model.addAttribute("user",user);
                return "success";
            }

        }
        return "notfound";
    }

    @RequestMapping(value = "/userreg",method = RequestMethod.POST)
    //处理注册
    public  String DengluView(RegUser regUser , HttpSession session, Model model){
//        从session中取出验证码code
        Integer code = (Integer) session.getAttribute("code");
//        System.out.println("code:"+code);
//       System.out.println("reg:"+regUser.getYzCode());
// 判断输入框验证码是否正确

        if (code.equals(regUser.getYzCode())){
            User u = new User();
            u.setLoginName(regUser.getLoginName());
            u.setLoginPwd(regUser.getLoginPwd());
            u.setPhone(regUser.getPhoneNum());
            u.setTrueName(regUser.getLoginName());
            u.setStatus(1);
            u.setAddress("");
            u.setHead("img/cbkmz.png");
//            调用service业务接口注册在数据库中
            boolean b = userService.addUser(u);
            System.out.println(b);
        }

        return "success";
    }

    @RequestMapping(value = "reg2",method = RequestMethod.POST)
    //接收ajax请求发送手机验证码发送
    public  String yanZheng(@RequestParam("phone") String phone, HttpSession session) throws ClientException {
//        System.out.println(phone);
        Integer newcode= SmsUtil.setNewcode();
        session.setAttribute("code",newcode);
        String code = Integer.toString(newcode);
        SmsUtil.sendSms(phone,code);

        return "success";
    }

}

