package com.zccoder.boot1.ch3.higher.conditional;

/**
 * Windows下所要创建的Bean的类。
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 */
public class WindowsListServiceImpl implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }

}
