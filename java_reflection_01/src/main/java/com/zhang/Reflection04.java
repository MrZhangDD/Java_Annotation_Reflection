package com.zhang;

/**
 * 测试类的初始化
 */
public class Reflection04 {

    static {
        System.out.println("main加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //Son son = new Son(); //先加载main,加载父类，然后子类
        //Class c2 = Class.forName("com.zhang.Son");//先加载main,加载父类，然后子类

        /*
        当访问一个静态域时，只有真正声明这个域的类才会被初始化。如：当子类访问父类的静态变量
        不会导致子类的初始化
         */
        //int m = Son.m;

        //通过数组的定义类的引用，不会触发此类的初始化
        //Son[] son = new Son[10];

        //引用常量不会触发加载
        System.out.println(Son.a);

    }
}

class Father{
    static int m = 10;
    static final int n = 100;
    static {
        System.out.println("父类被加载");
    }
}
class Son extends Father{
    static {
        System.out.println("子类被加载");
    }
    static final int a = 1000;
    static int b = 10;
}