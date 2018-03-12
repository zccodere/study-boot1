package com.zccoder.boot1.ch1.base.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 * // 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持。
 * @author zhangcheng
 * @version V1.0 2017.01.25
 */
@Configuration
@ComponentScan("com.zccoder.boot1.ch1.base.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
