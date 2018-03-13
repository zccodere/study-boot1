package com.zccoder.boot1.ch8.data.mongodb.dao;

import com.zccoder.boot1.ch8.data.mongodb.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @title 数据访问
 * @describe 数据访问
 * @author zc
 * @date 2017/08/10
 **/
public interface PersonRepository extends MongoRepository<Person,String> {

    /**
     * // 支持方法名查询。
     * @param name
     * @return
     */
    Person findByName(String name);

    /**
     * // 支持@Query查询，查询参数构造JSON字符串即可。
     * @param age
     * @return
     */
    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);

}
