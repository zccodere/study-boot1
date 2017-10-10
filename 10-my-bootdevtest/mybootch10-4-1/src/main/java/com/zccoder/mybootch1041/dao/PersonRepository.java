package com.zccoder.mybootch1041.dao;

import com.zccoder.mybootch1041.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @title 数据访问接口
 * @describe 个人信息资源接口
 * @author zc
 * @version 1.0 2017-10-10
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
