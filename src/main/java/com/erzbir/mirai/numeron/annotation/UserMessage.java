package com.erzbir.mirai.numeron.annotation;

import com.erzbir.mirai.numeron.enums.FilterRule;
import com.erzbir.mirai.numeron.enums.MessageRule;
import com.erzbir.mirai.numeron.enums.PermissionType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Erzbir
 * @Date: 2022/11/18 14:34
 */
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.METHOD)
public @interface UserMessage {
    FilterRule filterRule() default FilterRule.NONE;

    MessageRule messageRule() default MessageRule.EQUAL;

    PermissionType permission() default PermissionType.WHITE;

    String text() default "";
}
