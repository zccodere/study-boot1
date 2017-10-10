package com.zccoder.mybootch934.activemq;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * @title 消息定义类
 * @describe 定义JMS发送的消息需实现MessageCreator接口，并重写其createMessage方法
 * @author zc
 * @version 1.0 2017-10-08
 */
public class Msg implements MessageCreator {

    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("测试消息");
    }
}
