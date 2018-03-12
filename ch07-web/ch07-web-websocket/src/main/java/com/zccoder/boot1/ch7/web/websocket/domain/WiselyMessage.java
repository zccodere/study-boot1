package com.zccoder.boot1.ch7.web.websocket.domain;

/**
 * @title POJO类
 * @describe 浏览器向服务端发送的消息用此类接受。
 * @author zc
 * @date 2017/04/04
 **/
public class WiselyMessage {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
