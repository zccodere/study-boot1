package com.zccoder.boot1.ch12.cloud.person.dao;

import com.zccoder.boot1.ch12.cloud.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @title DAO类
 * @describe PersonDao
 * @author zc
 * @version 1.0 2017-10-14
 */
public interface PersonRepository extends JpaRepository<Person, Long>{

}
