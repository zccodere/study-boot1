package com.zccoder.boot1.ch6.core.properties;

import com.zccoder.boot1.ch6.core.properties.config.ReaderSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类型安全的配置（基于properties）
 * @author zc on 2017/4/4.
 */
@SpringBootApplication
@RestController
public class CorePropertiesStart {

	@Autowired
	private ReaderSettings readerSettings;

	@RequestMapping("/")
	public String index(){
		return "reader name is " + readerSettings.getName() + " and reader age is " + readerSettings.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(CorePropertiesStart.class, args);
	}
}
