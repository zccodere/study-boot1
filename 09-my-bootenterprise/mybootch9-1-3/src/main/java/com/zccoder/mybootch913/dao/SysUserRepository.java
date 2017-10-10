package com.zccoder.mybootch913.dao;

import com.zccoder.mybootch913.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @title 用户资源类
 * @describe 系统用户表数据访问类
 * @author zc
 * @version 1.0 2017-09-22
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{

    SysUser findByUsername(String username);

}
