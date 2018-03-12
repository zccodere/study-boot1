package com.zccoder.boot1.ch3.higher.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 示例组合注解
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
// 组合@Configuration元注解。
@Configuration
// 组合@ComponentScan元注解。
@ComponentScan
public @interface ChangConfiguration {

    // 覆盖value参数。
    String[] value() default {};
}
