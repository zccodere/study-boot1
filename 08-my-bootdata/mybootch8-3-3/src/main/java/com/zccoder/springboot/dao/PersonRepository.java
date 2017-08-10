package com.zccoder.springboot.dao;

import com.zccoder.springboot.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * 定义数据访问接口
 * Created by ZC on 2017/8/7.
 */
@RepositoryRestResource(path="people")
public interface PersonRepository extends JpaRepository<Person,Long> {

    @RestResource(path="nameStartsWith",rel="nameStartsWith")
    Person findByNameStartsWith(@Param("name")String name);
}
