package com.zccoder.springmvc.ch4.web.controller;

import com.zccoder.springmvc.ch4.domain.DemoObj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义HttpMessageConverter演示控制器
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
@Controller
public class ConverterController {

    private static final Logger logger = LoggerFactory.getLogger(ConverterController.class);

    @RequestMapping(value = "/convert",produces = {"application/x-zccoder"})
    // 指定返回的媒体类型为我们自定义的媒体类型application/x-zccoder
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj demoObj){
        logger.info("DemoObj:id={},name={}",demoObj.getId(),demoObj.getName());
        logger.debug("==========>convert<==========");

        return demoObj;
    }

}
