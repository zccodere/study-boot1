package com.zccoder.springboot.domain;

/**
 * 示例JavaBean
 * 此类用来在模版页面展示数据用，包含name属性和age属性
 * Created by ZC on 2017/4/4.
 */
public class Person {

    private String name;

    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
