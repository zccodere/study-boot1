package com.zccoder.mybootch935.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @title 发送消息及目的地定义类
 * @describe 发送消息
 * @author zc
 * @version 1.0 2017-10-08
 */
@Component
public class MsgSender implements CommandLineRunner{

    // 注入Spring Boot自动配置好的RabbitTemplate
    @Autowired
    RabbitTemplate rabbitTemplate;

    // 定义目的地即队列，队列名称为my-queue
    @Bean
    public Queue myQueue(){
        return new Queue("my-queue");
    }

    @Override
    public void run(String... strings) throws Exception {
        // 通过RabbitTemplate的convertAndSend方法向队列my-queue发送消息
        rabbitTemplate.convertAndSend("my-queue","来自RabbitMQ的问候");
    }
}
