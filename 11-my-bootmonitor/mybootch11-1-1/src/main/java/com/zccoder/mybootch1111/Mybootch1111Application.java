package com.zccoder.mybootch1111;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title 启动类
 * @describe SpringBoot应用监控
 * @author zc
 * @version 1.0 2017-10-12
 */
@SpringBootApplication
@RestController
public class Mybootch1111Application {

	@Autowired
	StatusService statusService;

	public static void main(String[] args) {
		SpringApplication.run(Mybootch1111Application.class, args);
	}

	// 注册端点的Bean
	@Bean
	public Endpoint<String> status(){
		Endpoint<String> status = new StatusEndPoint();
		return status;
	}

	// 定义控制器方法来改变status
	@RequestMapping("/change")
	public String changeStatus(String status){
		statusService.setStatus(status);
		return "OK";
	}

}
