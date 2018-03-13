package com.zccoder.boot1.ch8.data.redis.dao;

import com.zccoder.boot1.ch8.data.redis.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @title 数据访问
 * @describe 数据访问
 * @author zc
 * @date 2017/08/10
 **/
@Repository
public class PersonDao {

    /**
     * // SpringBoot已为我们配置StringRedisTemplate，在此处可以直接注入
     */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * // 可以使用@Resource注解指定stringRedisTemplate，可注入基于字符串的简单属性操作方法
     */
    @Resource(name = "stringRedisTemplate")
    private ValueOperations<String,String> valOpsStr;

    /**
     * // SpringBoot已为我们配置RedisTemplate，在此处可以直接注入
     */
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    /**
     * // 可以使用@Resource注解指定redisTemplate，可注入基于对象的简单属性操作方法
     */
    @Resource(name = "redisTemplate")
    private ValueOperations<Object,Object> valOps;

    /**
     * // 通过set方法存储字符串类型
     */
    public void stringRedisTemplateDemo(){
        valOpsStr.set("xx","yy");
    }

    /**
     * // 通过set方法存储对象类型
     * @param person
     */
    public void save(Person person){
        valOps.set(person.getId(),person);
    }

    /**
     * // 通过get方法获取字符串类型
     * @return
     */
    public String getString(){
        return valOpsStr.get("xx");
    }

    /**
     * // 通过get方法获取对象类型
     * @return
     */
    public Person getPerson(){
        return (Person)valOps.get("1");
    }
}
