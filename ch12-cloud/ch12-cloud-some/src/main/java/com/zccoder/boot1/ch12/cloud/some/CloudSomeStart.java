package com.zccoder.boot1.ch12.cloud.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 启动类
 * @describe 服务模块 Some服务
 * @author zc
 * @version 1.0 2017-10-14
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CloudSomeStart {

	/**
	 * // 通过@Value注入来自ConfigServer的值
	 */
	@Value("${my.message}")
	private String message;

	@RequestMapping(value = "/getsome")
	public String getsome() {
		return message;
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudSomeStart.class, args);
	}

}
