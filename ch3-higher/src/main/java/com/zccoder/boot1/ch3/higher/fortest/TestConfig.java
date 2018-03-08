package com.zccoder.boot1.ch3.higher.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 测试-配置类
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("from production profile");
    }
}
