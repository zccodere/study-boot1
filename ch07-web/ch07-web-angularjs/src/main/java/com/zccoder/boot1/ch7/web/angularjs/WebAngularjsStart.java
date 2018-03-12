package com.zccoder.boot1.ch7.web.angularjs;

import com.zccoder.boot1.ch7.web.angularjs.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 启动类
 * @describe 基于 Bootstrap 和 AngularJS 的现代 Web 应用
 * @author zc
 * @date 2017/04/05
 **/
@RestController
@SpringBootApplication
public class WebAngularjsStart {

	@RequestMapping(value = "/search",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName){
		return new Person(personName,21,"chongqing");
	}

	public static void main(String[] args) {
		SpringApplication.run(WebAngularjsStart.class, args);
	}
}
