package com.zccoder.spring.ch1.javaconfig;

/**
 * 使用功能类的Bean
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.25
 */
// 此处没有使用@Service声明Bean。
public class UseFunctionService {

    // 此处没有使用@Autowired注解注入Bean。
    private FunctionService fuctionService;

    public void setFuctionService(FunctionService fuctionService) {
        this.fuctionService = fuctionService;
    }

    public String sayHello(String word) {
        return fuctionService.sayHello(word);
    }
}
