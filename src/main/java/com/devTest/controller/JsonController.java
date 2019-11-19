package com.devTest.controller;

import com.devTest.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/jsonTest")
public class JsonController {

    /**
     *  ajax异步请求响应测试
     */
    @RequestMapping("/ajaxTest")
    public void ajaxTest(@RequestBody String body,
                         HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
        System.out.println("ajax请求执行...");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        System.out.println(body);
    }

    /**
     *  jackson自动转换bean为json返回
     *  @ResponseBody 返回javaBean对象
     */
    @RequestMapping("/jacksonTest")
    public @ResponseBody Account jacksonTest(@RequestBody Account account){
        System.out.println("执行jacksonTest方法");
        System.out.println(account);
        account.setUsername("modify username");
        account.setMoney(12.00);
        return account;
    }
}
