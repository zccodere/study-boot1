package com.zccoder.boot1.ch9.enterprise.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @title 配置类
 * @describe SpringMVC配置
 * @author zc
 * @version 1.0 2017-09-22
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 注册访问/login转向login.html页面
        registry.addViewController("/login").setViewName("login");
    }
}
