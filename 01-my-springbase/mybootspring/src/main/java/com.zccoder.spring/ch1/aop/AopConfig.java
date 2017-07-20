package com.zccoder.spring.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.25
 *
 */
@Configuration
@ComponentScan("com.study.highlight.ch1.aop")
// 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持。
@EnableAspectJAutoProxy
public class AopConfig {

}
