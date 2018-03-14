package com.zccoder.boot1.ch12.cloud.person.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @title 实体类
 * @describe 保存个人信息
 * @author zc
 * @version 1.0 2017-10-14
 */
@Entity
public class Person {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
