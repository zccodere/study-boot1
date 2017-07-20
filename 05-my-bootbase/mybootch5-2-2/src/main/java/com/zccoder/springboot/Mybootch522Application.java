package com.zccoder.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Mybootch522Application {

	@Value("${book.reader}")
	private String bookReader;

	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	String index(){
		return "Hello Spring Boot " + "book name is:"+bookName+" and reader is:"+bookReader;
	}

	public static void main(String[] args) {

		SpringApplication.run(Mybootch522Application.class, args);
	}
}
