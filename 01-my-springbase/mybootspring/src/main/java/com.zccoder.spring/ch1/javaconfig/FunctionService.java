package com.zccoder.spring.ch1.javaconfig;
/**
 * 功能类的Bean
 * @author zhangcheng
 * @version V1.0 2017.01.25
 *
 */
//此处没有使用@Service声明Bean
public class FunctionService {
    
    public String sayHello(String word){
        return "Hello "+word+"!";
    }
}
