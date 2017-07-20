package com.zccoder.spring.ch3.fortest;

/**
 * 业务代码-测试
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
public class TestBean {

    private String content;
    
    public TestBean(String content) {
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
