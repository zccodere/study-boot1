package com.zccoder.boot1.ch5.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
