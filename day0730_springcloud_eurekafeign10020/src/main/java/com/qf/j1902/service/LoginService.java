package com.qf.j1902.service;

import com.qf.j1902.vo.RegUser;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Service
@FeignClient("cloud-zuul")
public interface LoginService {
    @RequestMapping("eureka-client/userlogin")
    public int loginFetch(@RequestParam("username") String username,@RequestParam("password") String password);

    @RequestMapping(value = "eureka-client/userreg",method = RequestMethod.POST)
    public int adduser(@RequestParam("loginName") String loginName,@RequestParam("loginPwd") String loginPwd,
                       @RequestParam("phoneNum") String phoneNum,@RequestParam("yzCode")Integer yzCode);

    @RequestMapping(value = "eureka-client/reg2",method = RequestMethod.POST)
    public String yanzhengma(@RequestParam("phone") String phone);

}
