package com.zccoder.spring.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Prototype的Bean。
 * 
 * @author ChangComputer
 * @version V1.0 2017.01.25
 */

@Service
// 声明Scope为Prototype
@Scope("prototype")
public class DemoPrototypeService {

}
