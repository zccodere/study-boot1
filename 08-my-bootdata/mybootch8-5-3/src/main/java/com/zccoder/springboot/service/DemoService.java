package com.zccoder.springboot.service;

import com.zccoder.springboot.domain.Person;

/**
 * 业务服务Service
 * Created by ZC on 2017/8/9.
 */
public interface DemoService {

   Person save(Person person);

   void remove(Long id);

   Person findOne(Person person);

}
