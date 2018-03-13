package com.zccoder.boot1.ch8.data.transaction.web;

import com.zccoder.boot1.ch8.data.transaction.service.DemoService;
import com.zccoder.boot1.ch8.data.transaction.domain.Person;
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

    /**
     * // 测试回滚情况
     * @param person
     * @return
     */
    @RequestMapping("/rollback")
    public Person rollback(Person person){
        return demoService.savePersonWithRollBack(person);
    }

    /**
     *  // 测试不回滚情况
     * @param person
     * @return
     */
    @RequestMapping("/norollback")
    public Person noRollback(Person person){
        return demoService.savePersonWithoutRollBack(person);
    }
}
