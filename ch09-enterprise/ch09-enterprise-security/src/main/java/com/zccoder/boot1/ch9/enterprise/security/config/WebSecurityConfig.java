package com.zccoder.boot1.ch9.enterprise.security.config;

import com.zccoder.boot1.ch9.enterprise.security.security.CustomUserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @title 配置类
 * @describe SpringSecurity配置
 * // 扩展SpringSecurity配置需继承WebSecurityConfigurerAdapter
 * @author zc
 * @version 1.0 2017-09-22
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * // 注册CustomUserService的Bean
     * @return
     */
    @Bean
    public UserDetailsService customUserService(){
        return new CustomUserServiceImpl();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 添加自定义的userDetailsService认证
        auth.userDetailsService(customUserService());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            // 所有请求需要认证即登录后才能访问
            .anyRequest().authenticated()
            .and()
            // 定制登录行为，登录页面可任意访问
            .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error")
                .permitAll()
            .and()
            // 定制注销行为，登录请求可任意访问
            .logout().permitAll();
    }
}
