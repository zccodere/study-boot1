package com.zccoder.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类型安全的Bean
 * Created by ZC on 2017/4/4.
 */
@Component
@ConfigurationProperties(prefix = "reader")
public class ReaderSettings {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
