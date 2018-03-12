package com.zccoder.boot1.ch7.web.websocket.domain;

/**
 * @title POJO类
 * @describe 服务端向浏览器发送的此类的消息
 * @author zc
 * @date 2017/04/04
 **/
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
