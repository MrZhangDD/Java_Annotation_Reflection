package com.zhang;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 动态创建对象，通过反射
 */
public class Reflection07 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("com.zhang.User");
        //1.需要无参构造
        /*User user1 = (User)c1.newInstance();
        System.out.println(user1);
*/
        //2.获取构造器设置对象
        /*Constructor constructor = c1.getDeclaredConstructor(String.class, int.class);
        User user2 = (User)constructor.newInstance("张", 10);
        System.out.println(user2);
        */
        //3.通过反射获取普通方法
        /*User user3 = (User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user3,"张");
        System.out.println(user3);
*/
        //4.通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field id = c1.getDeclaredField("id");
        //不能直接操作私有属性，需要关闭程序的安全检测
        id.setAccessible(true);
        id.set(user4,18);
        System.out.println(user4);

    }
}
