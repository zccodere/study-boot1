package com.zccoder.springmvc.ch4.service;

import org.springframework.stereotype.Service;

/**
 * 单元测试演示服务类
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
@Service
public class DemoService {

    public String saySomething(String name){
        return "hello " + name;
    }

}
