package com.zccoder.boot1.ch3.higher.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 计划任务执行类
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
@Service
public class SchedulerTaskService {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    /**
     * // 通过@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行。
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次" + DATE_FORMAT.format(new Date()));
    }

    /**
     * // 使用cron属性可按照指定时间执行，本例指的是每天11点28分执行；cron是UNIX和类UNIX(Linux)系统下的定时任务。
     */
    @Scheduled(cron = "0 32 14 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间" + DATE_FORMAT.format(new Date()) + "执行");
    }
}
