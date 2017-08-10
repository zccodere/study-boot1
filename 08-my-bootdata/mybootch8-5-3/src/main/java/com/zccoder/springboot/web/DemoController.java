package com.zccoder.springboot.web;

import com.zccoder.springboot.domain.Person;
import com.zccoder.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 * Created by ZC on 2017/8/9.
 */
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
