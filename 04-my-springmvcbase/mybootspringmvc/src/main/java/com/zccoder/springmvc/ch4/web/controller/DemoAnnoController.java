package com.zccoder.springmvc.ch4.web.controller;

import com.zccoder.springmvc.ch4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 注解演示控制器
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
// @Controller注解声明此类是一个控制器
@Controller
// @RequestMapping("/anno")映射此类的访问路径是/anno。
@RequestMapping("/anno")
public class DemoAnnoController {

    // 此方法未标识注路径，因此使用类级别的路径/anno；produces可定制返回的response的媒体类型和字符集，或需要返回值是json对象，
    // 则设置produces="application/json;charset=UTF-8"，在后面的章节我们会演示此项特性。
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    // 演示可接受HttpServletRequest作为参数，当然也可以接受HttpServletResponse作为参数。此处的@ResponseBody用在返回值前面。
    public @ResponseBody String index(HttpServletRequest request){
        return "url:" + request.getRequestURI() + " can access";
    }

    // 演示接受路径参数，并在方法参数前结合@PathVariable使用，访问路径为/anno/pathvar/xx。
    @RequestMapping(value="/pathvar/{str}",produces="text/plain;charset=UTF-8")
    // @ResponseBody也可以用在方法上。
    @ResponseBody
    public String demoPathVar(@PathVariable String str,HttpServletRequest request){
        return "url:" + request.getRequestURI() + " can access,str: "+str;
    }

    // 演示常规的request参数获取，访问路径为/anno/requestParam?id=1。
    @RequestMapping(value="/requestParam",produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String passRequestParam(Integer id,HttpServletRequest request){
        return "url:" + request.getRequestURI() + " can access,id: "+id;
    }

    // 演示解释参数到对象，访问路径为/anno/obj?id=1&name=xx。
    @RequestMapping(value="/obj",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request){
        return "url:" + request.getRequestURI() + " can access,obj.id: "+obj.getId()+" obj.name:"+obj.getName();
    }

    // 演示映射不同的路径到相同的方法，访问路径为/anno/name1或/anno/name2。
    @RequestMapping(value={"/name1","/name2"},produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String remove(HttpServletRequest request){
        return "url:" + request.getRequestURI() + " can access";
    }

}
