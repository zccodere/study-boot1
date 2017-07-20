package com.zccoder.springboot;

import com.zccoder.springboot.config.ReaderSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Mybootch623Application {

	@Autowired
	private ReaderSettings readerSettings;

	@RequestMapping("/")
	public String index(){
		return "reader name is " + readerSettings.getName() + " and reader age is " + readerSettings.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(Mybootch623Application.class, args);
	}
}
