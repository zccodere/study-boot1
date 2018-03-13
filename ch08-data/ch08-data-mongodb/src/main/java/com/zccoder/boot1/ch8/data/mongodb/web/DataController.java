package com.zccoder.boot1.ch8.data.mongodb.web;

import com.zccoder.boot1.ch8.data.mongodb.dao.PersonRepository;
import com.zccoder.boot1.ch8.data.mongodb.domain.Location;
import com.zccoder.boot1.ch8.data.mongodb.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @title 控制器
 * @describe 控制器
 * @author zc
 * @date 2017/08/10
 **/
@RestController
public class DataController {

    @Autowired
    PersonRepository personRepository;

    /**
     * // 测试保存数据
     * @return
     */
    @RequestMapping("/save")
    public Person save(){
        Person p = new Person("zc",22);
        Collection<Location> locations = new LinkedHashSet<Location>();
        Location loc1 = new Location("重庆","2017");
        Location loc2 = new Location("合川","2016");
        Location loc3 = new Location("上海","2015");
        Location loc4 = new Location("北京","2014");
        locations.add(loc1);
        locations.add(loc2);
        locations.add(loc3);
        locations.add(loc4);
        p.setLocations(locations);
        return personRepository.save(p);
    }

    /**
     *  // 测试方法名查询
     * @param name
     * @return
     */
    @RequestMapping("/q1")
    public Person q1(String name){
        return personRepository.findByName(name);
    }

    /**
     * // 测试@Query查询
     * @param age
     * @return
     */
    @RequestMapping("/q2")
    public List<Person> q2(Integer age){
        return personRepository.withQueryFindByAge(age);
    }
}
