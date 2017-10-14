package com.zccoder.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @title 调用SomeService的断路器
 * @describe 使用ribbon调用SomeService
 * @author zc
 * @version 1.0 2017-10-14
 */
@Service
public class SomeHystrixService {
	
	// 在SpringBoot下使用Ribbon，只需直接注入RestTemplate即可
	@Autowired
	RestTemplate restTemplate;
	
	// 使用@HystrixCommand的fallbackMethod参数指定，当本方法调用失败时，调用后备方法fallbackSome
	@HystrixCommand(fallbackMethod = "fallbackSome")
	public String getSome() {
		return restTemplate.getForObject("http://localhost:8083/getsome", String.class);
	}
	
	public String fallbackSome(){ 
		return "some service模块故障";
	}
}
