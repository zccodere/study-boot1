package com.zccoder.boot1.ch12.cloud.ui.domain;

/**
 * @title POJO类
 * @describe 个人信息实体类
 * @author zc
 * @version 1.0 2017-10-14
 */
public class Person {
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
