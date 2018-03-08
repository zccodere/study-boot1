package com.zccoder.boot1.ch3.higher.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                DemoConfig.class);

        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();

    }

}
