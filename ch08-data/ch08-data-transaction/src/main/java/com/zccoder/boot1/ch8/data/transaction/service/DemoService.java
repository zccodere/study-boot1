package com.zccoder.boot1.ch8.data.transaction.service;

import com.zccoder.boot1.ch8.data.transaction.domain.Person;

/**
 * @title 服务定义
 * @describe 业务服务Service
 * @author zc
 * @date 2017/08/09
 **/
public interface DemoService {

    /**
     * 保存信息，当名称重复时保存失败并回滚
     * @param person
     * @return
     */
    Person savePersonWithRollBack(Person person);

    /**
     * 保存信息，当名称重复时保存成功并不回滚
     * @param person
     * @return
     */
    Person savePersonWithoutRollBack(Person person);

}
