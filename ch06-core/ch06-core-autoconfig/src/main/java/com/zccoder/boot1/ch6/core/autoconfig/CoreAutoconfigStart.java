package com.zccoder.boot1.ch6.core.autoconfig;

import com.zccoder.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 启动类
 * @describe 自定义starter pom
 * @author zc
 * @date 2017/04/04
 **/
@RestController
@SpringBootApplication
@ComponentScan("com.zccoder")
public class CoreAutoconfigStart {

	@Autowired
	HelloService helloService;

	@RequestMapping("/")
	public String index(){
		return helloService.sayHello();
	}

	public static void main(String[] args) {
		SpringApplication.run(CoreAutoconfigStart.class, args);
	}
}
