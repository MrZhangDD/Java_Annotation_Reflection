package com.zhang;

import java.lang.annotation.ElementType;

/**
 * 所有类型的class
 */
public class Reflection05 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器 -- 扩展加载器

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        ////获取扩展加载器的父类加载器 -- 根加载器 （c/c++）
        ClassLoader parentParent = parent.getParent();
        System.out.println(parentParent);

        //当前类是哪个加载器
        ClassLoader classLoader = Class.forName("com.zhang.Reflection05").getClassLoader();
        System.out.println(classLoader);

        //JDK内置类加载器
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        //获取系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /**
         * D:\SoftWare\jdk1.8.0_121\jre\lib\charsets.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\deploy.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\access-bridge-64.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\cldrdata.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\dnsns.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\jaccess.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\jfxrt.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\localedata.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\nashorn.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\sunec.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\sunjce_provider.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\sunmscapi.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\sunpkcs11.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\ext\zipfs.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\javaws.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\jce.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\jfr.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\jfxswt.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\jsse.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\management-agent.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\plugin.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\resources.jar;
         * D:\SoftWare\jdk1.8.0_121\jre\lib\rt.jar;
         * G:\IdeaWorkSpace\Java_Annotation_Reflection\java_reflection_01\target\classes;
         * D:\SoftWare\IntelliJ IDEA 2020.1\lib\idea_rt.jar
         */

    }
}
