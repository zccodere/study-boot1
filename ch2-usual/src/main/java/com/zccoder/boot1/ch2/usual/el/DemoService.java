package com.zccoder.boot1.ch2.usual.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 需被注入的Bean
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.25
 */
@Service
public class DemoService {

    /**
     * // 此处为注入普通字符串
     */
    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

}
