package com.zccoder.boot1.ch11.monitor.shell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @title 启动类
 * @describe SpringBoot应用监控通过SSH
 * @author zc
 * @version 1.0 2017-10-12
 */
@SpringBootApplication
public class MonitorShellStart {

	public static void main(String[] args) {
		SpringApplication.run(MonitorShellStart.class, args);
	}
}
