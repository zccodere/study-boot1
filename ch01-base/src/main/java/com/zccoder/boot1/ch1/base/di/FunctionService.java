package com.zccoder.boot1.ch1.base.di;

import org.springframework.stereotype.Service;

/**
 * 功能类的Bean
 * // 使用@Service注解声明当前FunctionService类是一个Spring管理的一个Bean。
 * // 其中，使用@Component、@Service、@Repository和@Controller是等效的，可根据需要选用
 * @author zhangcheng
 * @version V1.0 2017.01.25
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "hello" + word + "!";
    }
}
