package com.zccoder.springboot;

import com.zccoder.springboot.support.CustomRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
public class Mybootch820Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybootch820Application.class, args);
	}
}
