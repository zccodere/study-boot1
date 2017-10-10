package com.zccoder.mybootch913.domain;

/**
 * @title 传值对象类
 * @describe 用来测试不同用户的数据展示
 * @author zc
 * @version 1.0 2017-09-22
 */
public class Msg {

    private String title;

    private String content;

    private String etraInfo;

    public Msg(String title, String content, String etraInfo) {
        this.title = title;
        this.content = content;
        this.etraInfo = etraInfo;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", etraInfo='" + etraInfo + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEtraInfo() {
        return etraInfo;
    }

    public void setEtraInfo(String etraInfo) {
        this.etraInfo = etraInfo;
    }
}
