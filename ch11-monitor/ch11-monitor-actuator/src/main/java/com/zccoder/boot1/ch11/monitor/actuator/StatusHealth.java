package com.zccoder.boot1.ch11.monitor.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @title 自定HealthIndicator
 * @describe 当SpringBoot提供的端点不能满足特殊需求时，可以自定义端点
 * // 实现HealthIndicator接口并重写health()方法
 * @author zc
 * @version 1.0 2017-10-12
 */
@Component
public class StatusHealth implements HealthIndicator{

    public static final String IS_RUNNING = "running";
    @Autowired
    StatusService statusService;

    @Override
    public Health health() {
        String status = statusService.getStatus();
        // 当status的值为非running时构造失败
        if(status == null || !IS_RUNNING.equals(status)){
            return Health.down().withDetail("Error","Not Running").build();
        }
        // 其余情况运行成功
        return Health.up().build();
    }
}
