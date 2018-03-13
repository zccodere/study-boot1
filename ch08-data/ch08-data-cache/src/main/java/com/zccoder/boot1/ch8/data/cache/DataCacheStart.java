package com.zccoder.boot1.ch8.data.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @title 启动类
 * @describe 数据缓存 Cache
 * // 使用@EnableCaching开启缓存支持
 * @author zc
 * @date 2017/08/09
 **/
@SpringBootApplication
@EnableCaching
public class DataCacheStart {

	public static void main(String[] args) {
		SpringApplication.run(DataCacheStart.class, args);
	}
}
