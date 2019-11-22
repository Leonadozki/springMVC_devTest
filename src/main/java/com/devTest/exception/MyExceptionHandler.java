package com.devTest.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysException exception = null;
        // 判断是否为自定义异常
        if (e instanceof SysException){
            exception = (SysException) e;
        }
        // 创建modelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        // 获取异常信息
        modelAndView.addObject("errorMsg", exception.getMessage());
        modelAndView.addObject("logMsg", exception.getStackTrace());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
