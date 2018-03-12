package com.zccoder.boot1.ch1.base.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.25
 *
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("add");
    };
}
