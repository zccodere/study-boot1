package com.zccoder.spring.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Spring Aware演示Bean
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
@Service
// 实现BeanNameAware、ResourceLoaderAware接口，获得Bean名称和资源加载的服务。
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader loader;

    // 实现ResourceLoaderAware需重写setResourceLoader。
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    // 实现BeanNameAware需重写setBeanName。
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void outputResult() {
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource(
                "classpath:com/study/highlight/ch3/aware/test.txt");

        try {
            System.out.println("ResourceLoader加载的文件内容为："
                    + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
