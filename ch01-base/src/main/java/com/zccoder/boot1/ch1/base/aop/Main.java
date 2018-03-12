package com.zccoder.boot1.ch1.base.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 *
 * @author zhangcheng
 * @version V1.0 2017.01.25
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();

    }

}
