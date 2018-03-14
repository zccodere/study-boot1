package com.zccoder.boot1.ch12.cloud.person.controller;


import java.util.List;

import com.zccoder.boot1.ch12.cloud.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zccoder.boot1.ch12.cloud.person.dao.PersonRepository;

/**
 * @title Rest接口
 * @describe 暴露服务
 * @author zc
 * @version 1.0 2017-10-14
 */
@RestController
public class PersonController {
	
    @Autowired
    PersonRepository personRepository;

    @PostMapping("/save")
    public List<Person> savePerson(@RequestBody String  personName) {
    	Person p = new Person(personName);
    	personRepository.save(p);
    	List<Person> people = personRepository.findAll(new PageRequest(0, 10)).getContent();
        return people;
    }

}
