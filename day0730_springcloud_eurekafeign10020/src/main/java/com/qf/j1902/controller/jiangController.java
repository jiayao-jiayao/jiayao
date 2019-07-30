package com.qf.j1902.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class jiangController {
    @RequestMapping("tiaochu")
    public String dd(HttpServletRequest req, Model model, HttpServletResponse res) {

        return "choujiangx";
    }
    @RequestMapping("addjiang")
    @ResponseBody
    public int ssa(@RequestParam("jiangn")String jiangn){
     return 1;
    }
}
