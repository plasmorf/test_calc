package ru.suhorukov.calculator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Администратор on 01.10.2015.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

@interface PreCondition {
    int minArgSize() default 1;
    int minStackSize() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface In{
    ArgType type();
}
