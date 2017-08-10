package com.zccoder.springboot.service.impl;

import com.zccoder.springboot.dao.PersonRepository;
import com.zccoder.springboot.domain.Person;
import com.zccoder.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 业务实现
 * Created by ZC on 2017/8/9.
 */
@Service
public class DemoServiceImpl implements DemoService {

    // 可以直接注入我们的PersonRepository的Bean。
    @Autowired
    private PersonRepository personRepository;

    // 使用@Transactional注解的rollbackFor属性，指定特定异常时，数据回滚。
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);

        if(person.getName().equals("汪云飞")){
            // 硬编码手动触发异常
            throw new IllegalArgumentException("汪云飞已存在，数据将回滚");
        }

        return p;
    }

    // 使用@Transactional注解的noRollbackFor属性，指定特定异常时，数据不回滚。
    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);
        if(person.getName().equals("汪云飞")){
            throw new IllegalArgumentException("汪云飞已存在，数据将不会回滚");
        }

        return p;
    }
}
