package com.zccoder.boot1.ch1.base.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * // @Configuration声明当前类是一个配置类。
 * // 使用@ComponentScan，自动扫描包名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为Bean。
 * @author ChangComputer
 * @version V1.0 2017.01.25
 */
@Configuration
@ComponentScan("com.zccoder.boot1.ch1.base.di")
public class DiConfig {

}
