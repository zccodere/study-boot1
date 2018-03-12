package com.zccoder.boot1.ch3.higher.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 运行
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class Main {

    public static final int TEST_NUM = 10;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context
                .getBean(AsyncTaskService.class);

        for (int i = 0; i < TEST_NUM; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

        context.close();

    }

}
