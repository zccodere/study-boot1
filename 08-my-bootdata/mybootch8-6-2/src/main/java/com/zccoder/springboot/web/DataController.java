package com.zccoder.springboot.web;

import com.zccoder.springboot.dao.PersonDao;
import com.zccoder.springboot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 控制器
 * Created by ZC on 2017/8/10.
 */
@RestController
public class DataController {

    @Autowired
    private PersonDao personDao;

    // 演示设置字符及对象
    @RequestMapping("/set")
    public void set(){
        Person person =new Person("1","zc",22);
        personDao.save(person);
        personDao.stringRedisTemplateDemo();;
    }

    // 演示获得字符
    @RequestMapping("/getString")
    public String getString(){
        return personDao.getString();
    }

    // 演示获得对象
    @RequestMapping("/getPerson")
    public Person getPerson(){
        return personDao.getPerson();
    }
}
