package com.zccoder.boot1.ch12.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title 启动类
 * @describe 参数配置
 * // 使用@EnableConfigServer注解开启配置服务器的支持
 * // 使用@EnableEurekaClient注解开启作为EurekaServer的客户端的支持
 * @author zc
 * @version 1.0 2017-10-14
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class CloudConfigStart {
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigStart.class, args);
	}
}
