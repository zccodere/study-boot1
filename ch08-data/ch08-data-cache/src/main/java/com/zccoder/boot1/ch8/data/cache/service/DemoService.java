package com.zccoder.boot1.ch8.data.cache.service;

import com.zccoder.boot1.ch8.data.cache.domain.Person;

/**
 * @title 业务服务Service
 * @describe 业务服务Service
 * @author zc
 * @date 2017/08/09
 **/
public interface DemoService {

   /**
    * 新增
    * @param person
    * @return
    */
   Person save(Person person);

   /**
    * 移除
    * @param id
    */
   void remove(Long id);

   /**
    * 查询
    * @param person
    * @return
    */
   Person findOne(Person person);

}
