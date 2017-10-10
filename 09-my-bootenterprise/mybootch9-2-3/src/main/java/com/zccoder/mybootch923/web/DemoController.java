package com.zccoder.mybootch923.web;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 演示控制器类
 * @describe 手动触发批处理任务
 * @author zc
 * @version 1.0 2017-09-26
 */
@RestController
public class DemoController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job importJob;

    public JobParameters jobParameters;

    @RequestMapping("/imp")
    public String imp(String fileName) throws Exception{
        String path = fileName+".csv";
        jobParameters = new JobParametersBuilder()
                .addLong("time",System.currentTimeMillis())
                .addString("input.file.name",path)
                .toJobParameters();
        jobLauncher.run(importJob,jobParameters);
        return "OK";
    }
}
