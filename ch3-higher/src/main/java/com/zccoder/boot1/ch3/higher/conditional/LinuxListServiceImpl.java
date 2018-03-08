package com.zccoder.boot1.ch3.higher.conditional;

/**
 * Linux下所要创建的Bean的类。
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class LinuxListServiceImpl implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }

}
