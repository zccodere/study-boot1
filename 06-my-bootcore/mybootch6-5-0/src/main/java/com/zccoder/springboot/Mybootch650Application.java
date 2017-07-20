package com.zccoder.springboot;

import com.zccoder.sprintboothello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Mybootch650Application {

	@Autowired
	HelloService helloService;

	@RequestMapping("/")
	public String index(){
		return helloService.sayHello();
	}

	public static void main(String[] args) {
		SpringApplication.run(Mybootch650Application.class, args);
	}
}
