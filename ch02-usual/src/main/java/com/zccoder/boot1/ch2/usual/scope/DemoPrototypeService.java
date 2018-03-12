package com.zccoder.boot1.ch2.usual.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Prototype的Bean。
 * // 声明Scope为Prototype
 * @author ChangComputer
 * @version V1.0 2017.01.25
 */

@Service
@Scope("prototype")
public class DemoPrototypeService {

}
