package com.devTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor(Map<String, String> map){
        map.put("errorMsg", "拦截器方法执行成功!!");
        System.out.println("controller执行了...");
        return "error";
    }
}
