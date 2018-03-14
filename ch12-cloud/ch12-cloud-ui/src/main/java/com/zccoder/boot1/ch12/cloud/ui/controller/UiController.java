package com.zccoder.boot1.ch12.cloud.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zccoder.boot1.ch12.cloud.ui.domain.Person;
import com.zccoder.boot1.ch12.cloud.ui.service.PersonHystrixService;
import com.zccoder.boot1.ch12.cloud.ui.service.SomeHystrixService;

/**
 * @title Rest接口类
 * @describe 暴露为Rest接口给前端使用
 * @author zc
 * @version 1.0 2017-10-14
 */
@RestController
public class UiController {
	@Autowired
	private SomeHystrixService someHystrixService;
	
	@Autowired
	private PersonHystrixService personHystrixService;

	@RequestMapping("/dispatch")
	public List<Person> sendMessage(@RequestBody String personName) {
		return personHystrixService.save(personName);
	}
	
	@RequestMapping(value = "/getsome",produces={MediaType.TEXT_PLAIN_VALUE})
	public String getSome(){
		return someHystrixService.getSome();
	}
}
