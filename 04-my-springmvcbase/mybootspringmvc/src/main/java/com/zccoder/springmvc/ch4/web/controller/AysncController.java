package com.zccoder.springmvc.ch4.web.controller;

import com.zccoder.springmvc.ch4.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 服务器端推送技术演示控制器
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
@Controller
public class AysncController {

    @Autowired
    // 定时任务，定时更新 DeferredResult。
    private PushService pushService;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredResult(){
        // 返回给客户端 DeferredResult。
        return pushService.getAsyncUpdate();
    }
}
