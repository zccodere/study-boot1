package com.zccoder.springboot.domain;

/**
 * 浏览器向服务端发送的消息用此类接受。
 * Created by ZC on 2017/4/4.
 */
public class WiselyMessage {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
