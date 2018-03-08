package com.zccoder.boot1.ch1.base.javaconfig;
/**
 * 功能类的Bean
 * //此处没有使用@Service声明Bean
 * @author zhangcheng
 * @version V1.0 2017.01.25
 */
public class FunctionService {
    
    public String sayHello(String word){
        return "Hello "+word+"!";
    }
}
