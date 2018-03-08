package com.zccoder.boot1.ch4.mvc.web.controller;

import com.zccoder.boot1.ch4.mvc.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController演示
 * // 使用@RestController，声明是控制器，并且返回数据时不需要@ResponseBody。
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    /**
     * // 返回数据的媒体类型为json。
     * @param obj
     * @return
     */
    @RequestMapping(value="/getjson",produces="application/json;charset=UTF-8")
    public DemoObj getjson(DemoObj obj){
        // 直接返回对象，对象会自动转换成json。
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }

    /**
     * // 返回数据的媒体类型为xml。
     * @param obj
     * @return
     */
    @RequestMapping(value="/getxml",produces="application/xml;charset=UTF-8")
    public DemoObj getjxml(DemoObj obj){
        // 直接返回对象，对象会自动转换为xml。
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }
}
