package com.zccoder.spring.ch3.aware;

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
                AwareConfig.class);

        AwareService awareService = context.getBean(AwareService.class);

        awareService.outputResult();

        context.close();

    }

}
