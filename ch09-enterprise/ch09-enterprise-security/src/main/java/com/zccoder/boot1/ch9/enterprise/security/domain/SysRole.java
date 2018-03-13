package com.zccoder.boot1.ch9.enterprise.security.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @title 角色实体类
 * @describe 系统角色信息
 * @author zc
 * @version 1.0 2017-09-22
 */
@Entity
public class SysRole {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
