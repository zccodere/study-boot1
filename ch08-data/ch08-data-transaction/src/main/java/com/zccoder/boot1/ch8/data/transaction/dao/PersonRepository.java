package com.zccoder.boot1.ch8.data.transaction.dao;

import com.zccoder.boot1.ch8.data.transaction.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @title 定义数据访问接口
 * @describe 定义数据访问接口
 * @author zc
 * @date 2017/08/09
 **/
public interface PersonRepository extends JpaRepository<Person,Long> {

}
