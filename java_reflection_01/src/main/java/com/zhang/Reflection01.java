package com.zhang;

public class Reflection01 {

    //通过反射获取Class的包名类名
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.zhang.User");
        System.out.println(c1);
        Class c2 = Class.forName("com.zhang.User");
        Class c3 = Class.forName("com.zhang.User");
        Class c4 = Class.forName("com.zhang.User");

        //一个类在内存中只有一个class对象
        //一个类被加载后。类的整个结构被封装在class对象中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }

}

class User{
    private String name;
    private int id;
    public String ss;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", ss='" + ss + '\'' +
                '}';
    }
}
