package com.zccoder.boot1.ch9.enterprise.security.security;

import com.zccoder.boot1.ch9.enterprise.security.dao.SysUserRepository;
import com.zccoder.boot1.ch9.enterprise.security.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @title 用户服务类
 * @describe 自定义系统用户
 * // 自定义需要实现UserDetailsService接口
 * @author zc
 * @version 1.0 2017-09-22
 */
public class CustomUserServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserRepository userRepository;

    /**
     * // 重写loadUserByUsername方法获得用户
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        // 我们当前的用户实现了UserDetails接口，可直接返回给SpringSecurity使用
        return user;
    }
}
