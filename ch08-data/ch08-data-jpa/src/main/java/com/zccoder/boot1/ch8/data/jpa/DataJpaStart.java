package com.zccoder.boot1.ch8.data.jpa;

import com.zccoder.boot1.ch8.data.jpa.support.CustomRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @title 启动类
 * @describe Spring Data JPA
 * @author zc
 * @date 2017/04/07
 **/
@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
public class DataJpaStart {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaStart.class, args);
	}
}
