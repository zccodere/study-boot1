package com.zccoder.spring.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 使用功能类的Bean
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.25
 */
@Service
// 使用@Service注解声明当前UseFunctionService类是Spring管理的一个Bean。
public class UseFunctionService {

    @Autowired
    // 使用@Autowired将FunctionService的实体Bean注入到UseFunctionService中，
    // 让UseFunctionService具备FunctionService的功能，此处使用JSR-330的@Inject注解或者JSR-250的@Resource注解是等效的。
    private FunctionService fuctionService;

    public String sayHello(String word) {
        return fuctionService.sayHello(word);
    }
}
