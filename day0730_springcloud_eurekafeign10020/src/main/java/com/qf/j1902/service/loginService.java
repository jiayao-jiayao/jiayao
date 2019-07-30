package com.qf.j1902.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Service
@FeignClient("cloud-zuul")
public interface loginService {
    @RequestMapping("eureka-client/login")
    public String loginFetch(@RequestParam("username")String name);
}
