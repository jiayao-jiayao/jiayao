package com.qf.j1902.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-zuul")
public interface loginService {
    @RequestMapping("login-client/login")
    public String loginFetch(@RequestParam("username")String name);
}
