package com.zccoder.boot1.ch11.monitor.actuator;

import org.springframework.beans.BeansException;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @title 自定义端点类
 * @describe 当SpringBoot提供的端点不能满足特殊需求时，可以自定义端点
 * // 通过@ConfigurationProperties的设置，可以在application.properties中通过endpoints.status配置端点
 * // 继承AbstractEndpoint类，AbstractEndpoint是Endpoint的接口抽象实现，当前类一定要重写invoke方法。
 * // 实现ApplicationContextAware接口可以让当前类可以访问Spring容器中的资源，即Bean
 * @author zc
 * @version 1.0 2017-10-12
 */
@ConfigurationProperties(prefix = "endpoints.status",ignoreUnknownFields = false)
public class StatusEndPoint extends AbstractEndpoint<String> implements ApplicationContextAware{

    ApplicationContext context;

    public StatusEndPoint(){
        super("status");
    }

    /**
     * // 通过重写invoke方法，返回要监控的内容
     * @return
     */
    @Override
    public String invoke() {
        StatusService statusService = context.getBean(StatusService.class);
        return "The Current Status is:"+statusService.getStatus();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
