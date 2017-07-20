package com.zccoder.spring.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.25
 */
public class Main {

    public static void main(String[] args) {
        // 使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数。
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        // 获得声明配置的UseFunctionService的Bean。
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello(" di"));
        context.close();
    }

}
