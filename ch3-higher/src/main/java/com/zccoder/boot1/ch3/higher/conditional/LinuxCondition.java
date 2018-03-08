package com.zccoder.boot1.ch3.higher.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判定Linux的条件
 * 
 * @author zhangcheng
 * @version V1.0 2017.01.27
 *
 */
public class LinuxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context,
            AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name")
                .contains("Linux");
    }

}
