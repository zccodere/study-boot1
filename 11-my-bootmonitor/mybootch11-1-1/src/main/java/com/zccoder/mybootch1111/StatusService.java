package com.zccoder.mybootch1111;

import org.springframework.stereotype.Service;

/**
 * @title 状态业务类
 * @describe 仅改变status的值
 * @author zc
 * @version 1.0 2017-10-12
 */
@Service
public class StatusService {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
