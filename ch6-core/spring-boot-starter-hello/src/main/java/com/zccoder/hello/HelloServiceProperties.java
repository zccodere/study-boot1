package com.zccoder.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @title 属性配置
 * @describe 提供默认的属性配置
 * @author zc
 * @date 2017/04/04
 **/
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
