package com.zccoder.springmvc.ch4.web.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 示例拦截器
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
// 继承HandlerInterceptorAdapter类来实现自定义拦截器
public class DemoInterceptor extends HandlerInterceptorAdapter{

    // 重写preHandle方法，在请求发生前执行。
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime",startTime);
        return true;
    }

    // 重写postHandle方法，在请求完成后执行。
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long)request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为：" + new Long(endTime - startTime) + "ms");
        request.setAttribute("handlingTime",endTime - startTime);
    }
}
