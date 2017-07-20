package com.zccoder.spring.ch3.conditional;

/**
 * Windows下所要创建的Bean的类。
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }

}
