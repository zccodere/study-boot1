package com.zccoder.boot1.ch9.enterprise.security.dao;

import com.zccoder.boot1.ch9.enterprise.security.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @title 用户资源类
 * @describe 系统用户表数据访问类
 * @author zc
 * @version 1.0 2017-09-22
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{

    /**
     * 根据名称查询用户
     * @param username
     * @return
     */
    SysUser findByUsername(String username);

}
