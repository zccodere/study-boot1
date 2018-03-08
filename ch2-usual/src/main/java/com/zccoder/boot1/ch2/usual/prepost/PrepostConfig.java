package com.zccoder.boot1.ch2.usual.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
@Configuration
@ComponentScan("com.zccoder.boot1.ch2.usual.prepost")
public class PrepostConfig {

    /**
     * // initMethod和destroyMethod指定BeanWayService类的init和destroy方法在构造之后、Bean销毁之前执行
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    Jsr250WayService jsr250WayService() {
        return new Jsr250WayService();
    }
}
