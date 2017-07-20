package com.zccoder.spring.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
@Configuration
public class ConditionConfig {

    @Bean
    // 通过@Conditional注解，符合Windows条件则实例化WindowsListService。
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    // 通过@Conditional注解，符合Linux条件则实例化LinuxListService。
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
