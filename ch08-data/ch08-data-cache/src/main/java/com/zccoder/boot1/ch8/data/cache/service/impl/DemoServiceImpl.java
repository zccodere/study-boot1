package com.zccoder.boot1.ch8.data.cache.service.impl;

import com.zccoder.boot1.ch8.data.cache.domain.Person;
import com.zccoder.boot1.ch8.data.cache.dao.PersonRepository;
import com.zccoder.boot1.ch8.data.cache.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @title 业务实现
 * @describe 业务实现
 * @author zc
 * @date 2017/08/09
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private PersonRepository personRepository;

    /**
     * // @CachePut缓存行的或更新的数据到缓存，其中缓存名称为people，数据的key是person的id。
     * @param person
     * @return
     */
    @CachePut(value = "people",key="#person.id")
    @Override
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、key为："+p.getId()+" 数据做了缓存");
        return p;
    }

    /**
     * // @CacheEvict从缓存people中删除key为id的数据。
     * @param id
     */
    @CacheEvict(value = "people")
    @Override
    public void remove(Long id) {
        System.out.println("删除了id、key为："+id+" 的数据缓存");
        //personRepository.delete(id);
    }

    /**
     * // @Cacheable缓存key为people的id数据到缓存people中
     * @param person
     * @return
     */
    @Cacheable(value = "people",key="#person.id")
    @Override
    public Person findOne(Person person) {
        Person p = personRepository.findOne(person.getId());
        System.out.println("为id、key为："+p.getId()+" 数据做了缓存");
        return p;
    }
}
