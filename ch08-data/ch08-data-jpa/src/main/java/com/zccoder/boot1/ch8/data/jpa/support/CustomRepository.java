package com.zccoder.boot1.ch8.data.jpa.support;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @title 定义接口
 * @describe 定义接口
 * @author zc
 * @date 2017/08/07
 **/
@NoRepositoryBean
public interface CustomRepository<T,ID extends Serializable> extends JpaRepository<T,ID>,JpaSpecificationExecutor<T> {

    /**
     * 根据字段类型自动查询
     * @param example
     * @param pageable
     * @return
     */
    Page<T> findByAuto(T example, Pageable pageable);

}
