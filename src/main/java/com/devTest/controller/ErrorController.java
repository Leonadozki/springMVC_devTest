package com.devTest.controller;

import com.devTest.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {

    /**
     *  自定义异常测试
     */
    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("测试异常测试类...");
        try {
            int i = 1 / 0;
        }catch (Exception e){
            e.printStackTrace();
            throw new SysException("Oops，计算产生异常了...");
        }
        return "success";
    }
}
