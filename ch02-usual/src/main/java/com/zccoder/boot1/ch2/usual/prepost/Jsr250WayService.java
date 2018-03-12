package com.zccoder.boot1.ch2.usual.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用JSR250形式的Bean
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
public class Jsr250WayService {

    /**
     * // @PostConstruct,在构造函数执行完之后执行。
     */
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public Jsr250WayService() {
        System.out.println("初始化构造函数-Jsr250WayService");
    }

    /**
     * // @PreDestroy，在Bean销毁之前执行
     */
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }
}
