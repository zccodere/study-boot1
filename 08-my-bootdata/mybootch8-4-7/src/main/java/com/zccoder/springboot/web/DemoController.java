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

    // 测试回滚情况
    @RequestMapping("/rollback")
    public Person rollback(Person person){
        return demoService.savePersonWithRollBack(person);
    }

    // 测试不回滚情况
    @RequestMapping("/norollback")
    public Person noRollback(Person person){
        return demoService.savePersonWithoutRollBack(person);
    }
}
