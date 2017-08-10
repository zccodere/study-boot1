package com.zccoder.springboot.service.impl;

import com.zccoder.springboot.dao.PersonRepository;
import com.zccoder.springboot.domain.Person;
import com.zccoder.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 业务实现
 * Created by ZC on 2017/8/9.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private PersonRepository personRepository;

    // @CachePut缓存行的或更新的数据到缓存，其中缓存名称为people，数据的key是person的id。
    @CachePut(value = "people",key="#person.id")
    @Override
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、key为："+p.getId()+" 数据做了缓存");
        return p;
    }

    // @CacheEvict从缓存people中删除key为id的数据。
    @CacheEvict(value = "people")
    @Override
    public void remove(Long id) {
        System.out.println("删除了id、key为："+id+" 的数据缓存");
        //personRepository.delete(id);
    }

    // @Cacheable缓存key为people的id数据到缓存people中
    @Cacheable(value = "people",key="#person.id")
    @Override
    public Person findOne(Person person) {
        Person p = personRepository.findOne(person.getId());
        System.out.println("为id、key为："+p.getId()+" 数据做了缓存");
        return p;
    }
}
