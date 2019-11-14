package com.devTest.controller;

import com.devTest.domain.Element;
import com.devTest.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 普通入参测试
     */
    @RequestMapping("/testParam")
    public String testParam(String username, String password){
        System.out.println("用户名： "+ username);
        System.out.println("密码： "+ password);
        return "success";
    }

    /**
     * @param user
     * @return 单个实体类绑定
     */
    @RequestMapping("/testUser")
    public String testUser(User user){
        System.out.println(user);
        return "success";
    }

    /**
     *  测试集合类参数绑定
     */
    @RequestMapping("/testList")
    public String testList(Element element){
        System.out.println(element);
        return "success";
    }

    /**
     *  测试类型转换问题
     */
    @RequestMapping("/testClassCast")
    public String testClassCast(User user){
        System.out.println(user);
        return "success";
    }

    /**
     *  测试获取servlet原生API
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("cookies： " + request.getCookies());
        System.out.println("ContentType： " + response.getContentType());
        return "success";
    }
}
