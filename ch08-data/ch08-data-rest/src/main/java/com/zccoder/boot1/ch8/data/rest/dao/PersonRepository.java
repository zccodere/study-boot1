package com.zccoder.boot1.ch8.data.rest.dao;

import com.zccoder.boot1.ch8.data.rest.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @title 定义数据访问接口
 * @describe 定义数据访问接口
 * // 使用@RepositoryRestResource指定资源路径地址为 people
 * @author zc
 * @date 2017/08/07
 **/
@RepositoryRestResource(path="people")
public interface PersonRepository extends JpaRepository<Person,Long> {

    /**
     * 根据名称查询
     * @param name
     * @return
     */
    @RestResource(path="nameStartsWith",rel="nameStartsWith")
    Person findByNameStartsWith(@Param("name")String name);
}
