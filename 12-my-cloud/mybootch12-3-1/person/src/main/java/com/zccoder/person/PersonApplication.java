package com.zccoder.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title 启动类
 * @describe 服务模块-Person服务
 * @author zc
 * @version 1.0 2017-10-14
 */
@SpringBootApplication
@EnableEurekaClient
public class PersonApplication {
	
	   public static void main(String[] args) {
	        SpringApplication.run(PersonApplication.class, args);
	    }

}
