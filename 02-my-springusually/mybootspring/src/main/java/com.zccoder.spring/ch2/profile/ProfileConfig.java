package com.zccoder.spring.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Profile配置
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
@Configuration
public class ProfileConfig {

    @Bean
    // Profile为dev时实例化devDemoBean。
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("from development profile");
    }

    @Bean
    // Profile为prod时实例化prodDemoBean。
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }

}
