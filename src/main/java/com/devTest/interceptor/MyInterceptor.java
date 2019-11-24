package com.devTest.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  自定义拦截器实现类
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     *  拦截器预处理方法
     *  return true放行，false不放行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("testInterceptor前置方法执行了...");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        return true;
    }

    /**
     * 拦截器后置处理方法
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("testInterceptor后置方法执行了...");

    }

    /**
     *  拦截器最终处理方法
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("testInterceptor最终方法执行了...");
    }
}
