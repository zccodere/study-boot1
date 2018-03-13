package com.zccoder.boot1.ch8.data.transaction.service.impl;

import com.zccoder.boot1.ch8.data.transaction.dao.PersonRepository;
import com.zccoder.boot1.ch8.data.transaction.domain.Person;
import com.zccoder.boot1.ch8.data.transaction.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @title 服务实现
 * @describe 业务实现
 * @author zc
 * @date 2017/08/09
 **/
@Service
public class DemoServiceImpl implements DemoService {

    public static final String TEST_NAME = "汪云飞";
    /**
     * // 可以直接注入我们的PersonRepository的Bean。
     */
    @Autowired
    private PersonRepository personRepository;

    /**
     * // 使用@Transactional注解的rollbackFor属性，指定特定异常时，数据回滚。
     * @param person
     * @return
     */
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);

        if(TEST_NAME.equals(person.getName())){
            // 硬编码手动触发异常
            throw new IllegalArgumentException("汪云飞已存在，数据将回滚");
        }

        return p;
    }

    /**
     * // 使用@Transactional注解的noRollbackFor属性，指定特定异常时，数据不回滚。
     * @param person
     * @return
     */
    @Transactional(noRollbackFor = {IllegalArgumentException.class},rollbackFor = {Error.class})
    @Override
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);
        if(TEST_NAME.equals(person.getName())){
            throw new IllegalArgumentException("汪云飞已存在，数据将不会回滚");
        }
        return p;
    }
}
