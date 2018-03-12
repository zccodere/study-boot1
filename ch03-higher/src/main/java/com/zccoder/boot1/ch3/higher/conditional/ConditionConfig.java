package com.zccoder.boot1.ch3.higher.conditional;

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

    /**
     * // 通过@Conditional注解，符合Windows条件则实例化WindowsListService。
     * @return
     */
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListServiceImpl();
    }

    /**
     * // 通过@Conditional注解，符合Linux条件则实例化LinuxListService。
     * @return
     */
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListServiceImpl();
    }
}
