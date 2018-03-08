package com.zccoder.boot1.ch4.mvc.config;

import com.zccoder.boot1.ch4.mvc.web.converter.DemoMessageConverter;
import com.zccoder.boot1.ch4.mvc.web.interceptor.DemoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * SpingMvc配置类
 *
 * // @Configuration标识当前类是配置类
 * // @EnableWebMvc开启SpringMVC支持，若无此句，重写WebMvcConfigurerAdapter方法无效。
 * // @EnableScheduling开启计划任务的支持
 * // @ComponentScan开启自动扫描注解
 * // 继承WebMvcConfigurerAdapter类，重写其方法可对SpringMVC进行配置。
 * Created by ZC on 2017/4/3.
 * @author ZhangCheng
 * @date 2017-04-03
 * @version V1.0
 */
@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan("com.zccoder.boot1.ch4.mvc")
public class SpringMvcConfig extends WebMvcConfigurerAdapter{

    /**
     * 配置视图解析器
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    /**
     * 配置静态资源映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // addResourceLocations指的是文件放置的目录，addResourceHandler指的是对外暴露的访问路径。
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /**
     * 配置拦截器的Bean
     * @return
     */
    @Bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }

    /**
     * 重写addInterceptors方法，注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }

    /**
     * 配置URL路径参数支持点后面的值
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }

    /**
     * 配置ViewController点击链接直接跳转页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/toupload").setViewName("upload");
        registry.addViewController("/converter").setViewName("converter");
        registry.addViewController("/sse").setViewName("sse");
        registry.addViewController("/async").setViewName("async");
    }

    /**
     * 配置文件解析器，支持文件上传
     * @return
     */
    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(1000000);
        return multipartResolver;
    }

    /**
     * 重写extendMessageConverters方法，注册HttpMessageConverter
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(demoMessageConverter());
    }

    /**
     * 配置自定义HttpMessageConverter
     * @return
     */
    @Bean
    public DemoMessageConverter demoMessageConverter(){
        return new DemoMessageConverter();
    }
}
