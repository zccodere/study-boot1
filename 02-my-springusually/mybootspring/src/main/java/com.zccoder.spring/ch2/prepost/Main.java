package com.zccoder.spring.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                PrepostConfig.class);
        
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();

    }

}
