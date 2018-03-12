package com.zccoder.boot1.ch2.usual.prepost;

/**
 * 使用@Bean形式的Bean
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class BeanWayService {

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
