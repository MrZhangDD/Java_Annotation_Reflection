package com.zhang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射获取属性及方法
 */
public class Reflection06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class c1 = Class.forName("com.zhang.User");
//        User user = new User();
//        c1 = user.getClass();
        System.out.println(c1.getName()); //获取类名

        System.out.println("1=======================");
        Field[] fields = c1.getFields();//只能找到public属性
        for (Field field : fields) {
            System.out.println("getFields" +field);
        }
        Field[] declaredFields = c1.getDeclaredFields(); //获取所有属性
        for (Field field : declaredFields) {
            System.out.println("declaredFields" +field);
        }
        System.out.println("2=======================");
        //获取本类及父类方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("getMethods"+method);
        }
        System.out.println("3=======================");
        //获取本类方法
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("getDeclaredMethods"+method);
        }

        System.out.println("4=======================");
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);
        System.out.println("5=======================");
        //获取构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructors"+constructor);
        }
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("getDeclaredConstructors"+declaredConstructor);
        }
        System.out.println("6=======================");
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class);
        System.out.println("指定构造器："+declaredConstructor);
    }
}
