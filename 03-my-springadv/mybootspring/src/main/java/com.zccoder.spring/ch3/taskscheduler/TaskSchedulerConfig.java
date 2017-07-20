package com.zccoder.spring.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 配置类
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
@Configuration
@ComponentScan("com.zccoder.spring.ch3.taskscheduler")
// 通过@EnableScheduling注解开启对计划任务的支持。
@EnableScheduling
public class TaskSchedulerConfig {

}
