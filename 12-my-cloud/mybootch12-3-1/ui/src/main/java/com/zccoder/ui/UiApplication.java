package com.zccoder.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @title 启动类
 * @describe 界面模块：UI
 * @author zc
 * @version 1.0 2017-10-14
 */
@SpringBootApplication
@EnableEurekaClient
// 通过@EnableFeignClients开启feign客户端支持
@EnableFeignClients
// 通过@EnableCircuitBreaker开启CircuitBreaker的支持
@EnableCircuitBreaker
// 通过@EnableZuulProxy开启网关代理的支持
@EnableZuulProxy
public class UiApplication {
	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}

	// 启动的时候要注意，由于我们在controller中注入了RestTemplate，所以启动的时候需要实例化该类的一个实例
	@Autowired
	private RestTemplateBuilder builder;

	// 使用RestTemplateBuilder来实例化RestTemplate对象，spring默认已经注入了RestTemplateBuilder实例
	@Bean
	public RestTemplate restTemplate() {
		return builder.build();
	}
}
