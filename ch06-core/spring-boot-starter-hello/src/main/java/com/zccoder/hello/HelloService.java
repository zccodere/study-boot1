package com.zccoder.hello;

/**
 * @title 服务类
 * @describe 判断依据类
 * @author zc
 * @date 2017/04/04
 **/
public class HelloService {

    private String msg;

    public String sayHello(){
        return "Hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
