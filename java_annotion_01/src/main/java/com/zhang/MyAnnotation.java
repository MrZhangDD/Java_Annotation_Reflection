package com.zhang;

import java.lang.annotation.*;

public class MyAnnotation {
    @myAnnotation(value = {"张","李"},str = "自定义注解")
    public void test(){}
}

/**
 * @interface 自定义注解
 * @Target  标注定义的类型
 * @Retention -- 运行的时机
 * @Documented -- 注释
 * String str();
 *     int name() default 0;
 *     int id() default -1; // -1表示不存在
 *     String[] value();  自定义注解可以默认值。
 */


@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface myAnnotation{
    String str();
    int name() default 0;
    int id() default -1;
    String[] value();
}
