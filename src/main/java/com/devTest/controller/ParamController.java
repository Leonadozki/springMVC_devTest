package com.devTest.controller;

import com.devTest.domain.Element;
import com.devTest.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/param")
@SessionAttributes({"msg"})
public class ParamController {

    /**
     * 普通入参测试
     *  前端参数名不一致时@RequestParam指定
     */
    @RequestMapping("/testParam")
    public String testParam(@RequestParam(name = "name") String username,
                            String password){
        System.out.println("用户名： "+ username);
        System.out.println("密码： "+ password);
        return "success";
    }

    /**
     * @param
     * @return 单个实体类绑定
     */
    @RequestMapping("/testUser")
    public String testUser(@RequestBody String body){
        System.out.println(body);
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

    /**
     *  测试pathVariable、RequestHeader注解
     *  作用：获取url中传递的参数值
     */
    @RequestMapping("/testPathVariable/{tid}")
    public String testPathVariable(@PathVariable(name = "tid") String id,
                                   @RequestHeader(value = "User-Agent") String header){
        System.out.println("参数ID：" + id);
        System.out.println("header：" + header);
        return "success";
    }

    /**
     *  测试获取cookie值
     *  ps：测试过程不管登录与否都能获取到前端传递的jsessionid
     */
    @RequestMapping("/testCookies")
    public String testCookie(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println(cookieValue);
        return "success";
    }

    /**
     *  测试session域存值
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        model.addAttribute("msg", "big boot");
        return "success";
    }

    /**
     *  session域取值测试
     *  注： 先往域存值，才能取到对应值
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println( modelMap.get("msg") );
        return "success";
    }

    /**
     *  测试void手动写转发
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid执行了");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        return;
    }
}
