package com.zccoder.spring.ch3.conditional;

/**
 * Linux下所要创建的Bean的类。
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }

}
