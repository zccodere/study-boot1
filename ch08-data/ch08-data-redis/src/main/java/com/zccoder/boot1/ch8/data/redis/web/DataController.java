package com.zccoder.boot1.ch8.data.redis.web;

import com.zccoder.boot1.ch8.data.redis.dao.PersonDao;
import com.zccoder.boot1.ch8.data.redis.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 控制器
 * @describe 控制器
 * @author zc
 * @date 2017/08/10
 **/
@RestController
public class DataController {

    @Autowired
    private PersonDao personDao;

    /**
     * // 演示设置字符及对象
     */
    @RequestMapping("/set")
    public void set(){
        Person person =new Person("1","zc",22);
        personDao.save(person);
        personDao.stringRedisTemplateDemo();;
    }

    /**
     * // 演示获得字符
     * @return
     */
    @RequestMapping("/getString")
    public String getString(){
        return personDao.getString();
    }

    /**
     * // 演示获得对象
     * @return
     */
    @RequestMapping("/getPerson")
    public Person getPerson(){
        return personDao.getPerson();
    }
}
