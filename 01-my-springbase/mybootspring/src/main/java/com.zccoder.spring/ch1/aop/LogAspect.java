package com.zccoder.spring.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 切面
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.25
 *
 */
// 通过@Aspect注解声明一个切面。
@Aspect
// 通过@Component让此切面成为Spring容器管理的Bean。
@Component
public class LogAspect {

    // 通过@Pointcut注解声明切点。
    @Pointcut("@annotation(com.study.highlight.ch1.aop.Action)")
    public void annotationPointCut() {
    };

    // 通过@After注解声明一个建言，并使用@Pointcut定义的切点。
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        // 通过反射可获得声明注解上的属性，然后做日志记录相关的操作，下面的相同。
        System.out.println("注解式拦截 " + action.name());
    }

    // 通过@Before注解声明一个建言，此建言直接使用拦截规则作为参数。
    @Before("execution(* com.study.highlight.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截 " + method.getName());
    }
}
