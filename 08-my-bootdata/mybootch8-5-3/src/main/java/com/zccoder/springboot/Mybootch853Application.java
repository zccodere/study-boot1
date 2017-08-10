package com.zccoder.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
// 使用@EnableCaching开启缓存支持
@EnableCaching
public class Mybootch853Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybootch853Application.class, args);
	}
}
