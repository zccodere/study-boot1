package com.zccoder.spring.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        
        //先将活动的Profile设置为prod
        context.getEnvironment().setActiveProfiles("dev");
        
        //后置注册Bean配置类，不然会报Bean未定义的错误。
        context.register(ProfileConfig.class);
        
        //刷新容器
        context.refresh();
        
        DemoBean demoBean = context.getBean(DemoBean.class);
        
        System.out.println(demoBean.getContent());
        
        context.close();

    }

}
