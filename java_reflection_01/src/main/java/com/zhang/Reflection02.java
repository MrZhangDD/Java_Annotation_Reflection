package com.zhang;

import javax.sound.midi.Soundbank;

/**
 * 获取类对象的几种方式
 */
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student();
        System.out.println("这个人是："+student.name);
        //第一种方式：通过对象获取、
        Class c1 = student.getClass();
        System.out.println(c1.hashCode());
        //二：通过forname获取
        Class c2 = Class.forName("com.zhang.Student");
        System.out.println(c2.hashCode());
        //三：通过类名.class
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //内置类型的包装类都有一个type
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //获取父类对象
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}

class Person{
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}
class Teacher extends Person{
    public Teacher() {
        this.name="老师";
    }
}
