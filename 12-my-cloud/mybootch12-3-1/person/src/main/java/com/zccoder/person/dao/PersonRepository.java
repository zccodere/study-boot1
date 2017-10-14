package com.zccoder.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zccoder.person.domain.Person;

/**
 * @title DAO类
 * @describe PersonDao
 * @author zc
 * @version 1.0 2017-10-14
 */
public interface PersonRepository extends JpaRepository<Person, Long>{

}
