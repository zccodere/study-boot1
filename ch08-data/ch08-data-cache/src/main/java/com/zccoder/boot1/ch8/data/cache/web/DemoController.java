package com.zccoder.boot1.ch8.data.cache.web;

import com.zccoder.boot1.ch8.data.cache.domain.Person;
import com.zccoder.boot1.ch8.data.cache.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 控制器
 * @describe 控制器
 * @author zc
 * @date 2017/08/09
 **/
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/put")
    public Person put(Person person){
        return demoService.save(person);
    }

    @RequestMapping("/able")
    public Person able(Person person){
        return demoService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id){
        demoService.remove(id);
        return "ok";
    }
}
