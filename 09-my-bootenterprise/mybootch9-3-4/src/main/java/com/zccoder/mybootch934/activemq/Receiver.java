package com.zccoder.mybootch934.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @title 消息监听类
 * @describe 用于监听消息，并处理消息
 * @author zc
 * @version 1.0 2017-10-08
 */
@Component
public class Receiver {

    // @JmsListener是Spring4.1提供的一个新特性，用来简化JMS开发，只需添加一个注解，使用destination属性指定要监听的目的地，
    // 即可接收该目的地发送的消息
    @JmsListener(destination = "my-destination")
    public  void receiverMessage(String message){
        System.out.println("接收到：[" + message + "]");
    }

}
