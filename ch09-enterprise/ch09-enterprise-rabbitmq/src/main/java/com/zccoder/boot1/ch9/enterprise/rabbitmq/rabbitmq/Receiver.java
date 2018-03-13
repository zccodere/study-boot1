package com.zccoder.boot1.ch9.enterprise.rabbitmq.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @title 发送监听类
 * @describe 监听消息
 * @author zc
 * @version 1.0 2017-10-08
 */
@Component
public class Receiver {

    /**
     * // 使用@RabbitListener来监听RabbitMQ的消息，通过queue属性指定要监听的目的地
     * @param message
     */
    @RabbitListener(queues = "my-queue")
    public void receiverMessage(String message){
        System.out.println("Received [" + message +"]");
    }

}
