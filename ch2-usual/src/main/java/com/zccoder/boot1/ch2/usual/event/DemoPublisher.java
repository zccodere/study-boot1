package com.zccoder.boot1.ch2.usual.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
@Component
public class DemoPublisher {

    /**
     * // 注入ApplicationContext用来发布事件。
     */
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        // 使用ApplicationContext的publishEvent方法来发布。
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
