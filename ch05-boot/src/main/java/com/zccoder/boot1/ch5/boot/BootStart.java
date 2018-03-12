package com.zccoder.boot1.ch5.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 启动类
 * @describe 启动类及控制器
 * @author zc
 * @date 2017/04/04
 **/
@SpringBootApplication
@RestController
public class BootStart {

	@Value("${book.reader}")
	private String bookReader;

	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	String index(){
		return "Hello Spring Boot " + "book name is:"+bookName+" and reader is:"+bookReader;
	}

	public static void main(String[] args) {

		SpringApplication.run(BootStart.class, args);
	}
}
