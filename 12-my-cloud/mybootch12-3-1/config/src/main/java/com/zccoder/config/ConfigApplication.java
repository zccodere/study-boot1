package com.zccoder.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title 启动类
 * @describe 参数配置
 * @author zc
 * @version 1.0 2017-10-14
 */
@SpringBootApplication
// 使用@EnableConfigServer注解开启配置服务器的支持
@EnableConfigServer
// 使用@EnableEurekaClient注解开启作为EurekaServer的客户端的支持
@EnableEurekaClient
public class ConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
