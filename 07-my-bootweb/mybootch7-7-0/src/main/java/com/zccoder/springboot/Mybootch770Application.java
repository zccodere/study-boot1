package com.zccoder.springboot;

import com.zccoder.springboot.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 */
@RestController
@SpringBootApplication
public class Mybootch770Application {

	@RequestMapping(value = "/search",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName){
		return new Person(personName,21,"chongqing");
	}

	public static void main(String[] args) {
		SpringApplication.run(Mybootch770Application.class, args);
	}
}
