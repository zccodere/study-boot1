package com.zccoder.mybootch923.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * @title Job监听
 * @describe 监听器实现JobExecutionListener接口，并重写其beforeJob和afterJob方法
 * @author zc
 * @version 1.0 2017-09-26
 */
public class CsvJobListener implements JobExecutionListener{

    long startTime;
    long endTime;

    @Override
    public void beforeJob(JobExecution jobExecution) {
        startTime = System.currentTimeMillis();
        System.out.println("任务处理开始");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        endTime = System.currentTimeMillis();
        System.out.println("任务处理结束");
        System.out.println("耗时："+(endTime-startTime)+"ms");
    }
}
