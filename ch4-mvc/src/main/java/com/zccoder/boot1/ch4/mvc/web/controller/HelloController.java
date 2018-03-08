package com.zccoder.boot1.ch4.mvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 简单控制器
 * // 利用@Controller注解声明是一个控制器。
 * Created by ZC on 2017/4/3.
 * @author ZhangCheng
 * @date 2017-04-03
 * @version V1.0
 */
@Controller
public class HelloController {

    /**
     * // 利用@RequestMapping配置URL和方法之间的映射。
     * @return
     */
    @RequestMapping(value={"/index","/",""})
    public String hello(){
        // 通过上面ViewResolver的Bean配置，返回值为index，说明我们的页面放置在路径为/WEB-INF/classes/views/index.jsp
        return "index";
    }

}
