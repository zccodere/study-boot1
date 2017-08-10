package com.zccoder.springboot.dao;

import com.zccoder.springboot.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 定义数据访问接口
 * Created by ZC on 2017/8/9.
 */

public interface PersonRepository extends JpaRepository<Person,Long> {

}
