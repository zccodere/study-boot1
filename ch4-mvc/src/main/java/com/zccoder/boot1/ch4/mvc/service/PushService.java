package com.zccoder.boot1.ch4.mvc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 服务器端推送技术服务类
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
@Service
public class PushService {

    /**
     * // 在 PushService 里产生 DeferredResult 给控制器用，通过 @Scheduled 注解的方法定时更新 DeferredResult。
     */
    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAsyncUpdate(){
        deferredResult = new DeferredResult<String>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void refresh(){
        if(deferredResult != null ){
            deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }

}
