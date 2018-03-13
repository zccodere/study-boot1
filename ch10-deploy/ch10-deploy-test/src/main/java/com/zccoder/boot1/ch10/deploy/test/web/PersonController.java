package com.zccoder.boot1.ch10.deploy.test.web;

import com.zccoder.boot1.ch10.deploy.test.dao.PersonRepository;
import com.zccoder.boot1.ch10.deploy.test.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title 控制器
 * @describe 个人信息控制器类
 * @author zc
 * @version 1.0 2017-10-10
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll(){
        return personRepository.findAll();
    }

}
