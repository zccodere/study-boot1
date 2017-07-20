package com.zccoder.springmvc.ch4.domain;

/**
 * 演示实体类
 * Created by ZC on 2017/4/3.
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
public class DemoObj {
    /** ID */
    private Integer id;
    /** 名称 */
    private String name;

    public DemoObj() {
    }

    public DemoObj(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
