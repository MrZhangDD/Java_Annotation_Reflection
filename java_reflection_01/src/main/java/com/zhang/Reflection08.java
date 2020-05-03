package com.zhang;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试性能
 */
public class Reflection08 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test1();
        test2();
        test3();
    }

    /**
     * 普通方法
     */
    public static void test1(){
        User user = new User();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long end = System.currentTimeMillis();
        System.out.println("普通方法时间："+(end-start)+"ms");
    }

    /**
     * 反射方法
     */
    public static void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Method getName = user.getClass().getDeclaredMethod("getName",null);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射方法时间："+(end-start)+"ms");
    }
    /**
     * 反射关闭安全检查方法
     */
    public static void test3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Method getName = user.getClass().getDeclaredMethod("getName",null);
        getName.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {

            getName.invoke(user,null);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射方法时间："+(end-start)+"ms");
    }
}
