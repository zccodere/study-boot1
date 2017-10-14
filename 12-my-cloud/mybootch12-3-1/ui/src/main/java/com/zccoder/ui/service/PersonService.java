package com.zccoder.ui.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zccoder.ui.domain.Person;

/**
 * @title 调用Person服务的REST服务类
 * @describe 使用feign调用PersonService
 * @author zc
 * @version 1.0 2017-10-14
 */
@FeignClient("person")
public interface PersonService {
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	List<Person> save(@RequestBody String name);
}
