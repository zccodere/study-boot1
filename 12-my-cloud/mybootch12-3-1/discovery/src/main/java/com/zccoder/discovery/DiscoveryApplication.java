package com.zccoder.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @title 启动类
 * @describe 服务发现
 * @author zc
 * @version 1.0 2017-10-14
 */
@SpringBootApplication
// 使用@EnableEurekaServer开启对EurekaServer的支持
@EnableEurekaServer
public class DiscoveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}
}
