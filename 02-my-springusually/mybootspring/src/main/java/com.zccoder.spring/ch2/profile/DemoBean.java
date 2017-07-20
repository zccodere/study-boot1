package com.zccoder.spring.ch2.profile;

/**
 * 示例Bean
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class DemoBean {

    private String content;

    public DemoBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
