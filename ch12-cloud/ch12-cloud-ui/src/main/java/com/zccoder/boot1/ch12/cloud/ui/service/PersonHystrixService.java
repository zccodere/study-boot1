package com.zccoder.boot1.ch12.cloud.ui.service;

import java.util.ArrayList;
import java.util.List;

import com.zccoder.boot1.ch12.cloud.ui.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @title 调用PersonService的断路器
 * @describe 使用feign调用PersonService
 * @author zc
 * @version 1.0 2017-10-14
 */
@Service
public class PersonHystrixService {

	@Autowired
	PersonService personService;

	/**
	 * // 使用@HystrixCommand的fallbackMethod参数指定，当本方法调用失败时，调用后备方法fallbackSave
	 * @param name
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "fallbackSave")
	public List<Person> save(String name) {
		return personService.save(name);
	}
	
	public List<Person> fallbackSave(String name){ 
		List<Person> list = new ArrayList<>();
		Person p = new Person(name+"没有保存成功，Person Service 故障");
		list.add(p);
		return list;
	}
}
