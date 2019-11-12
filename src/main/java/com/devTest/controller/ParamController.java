package com.devTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username, String password){
        System.out.println("用户名： "+ username);
        System.out.println("密码： "+ password);
        return "success";
    }
}
