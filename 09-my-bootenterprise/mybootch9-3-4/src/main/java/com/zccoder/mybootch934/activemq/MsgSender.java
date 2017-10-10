package com.zccoder.mybootch934.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @title 消息发送及目的地定义类
 * @describe Spring Boot为我们提供了CommandLineRunner接口，用于程序启动后执行的代码，通过重写其run方法执行
 * @author zc
 * @version 1.0 2017-10-08
 */
@Component
public class MsgSender implements CommandLineRunner{

    // 注入Spring Boot配置好的JmsTemplate的Bean
    @Autowired
    JmsTemplate jmsTemplate;

    @Override
    public void run(String... strings) throws Exception {
        // 通过JmsTemplate的send方法向 my-destination 目的地发送Msg消息，这里也等于在消息代理上定义了一个目的地叫my-destination
        jmsTemplate.send("my-destination",new Msg());
    }
}
