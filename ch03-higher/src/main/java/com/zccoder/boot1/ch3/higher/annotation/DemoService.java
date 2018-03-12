package com.zccoder.boot1.ch3.higher.annotation;

import org.springframework.stereotype.Service;

/**
 * 演示服务Bean
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }
}
