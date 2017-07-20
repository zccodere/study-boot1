package com.zccoder.spring.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.26
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ElConfig.class);
        
        ElConfig resourceService = context.getBean(ElConfig.class);
        
        resourceService.outputResource();

        context.close();

    }

}
