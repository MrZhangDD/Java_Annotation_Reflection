package com.zhang;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * 反射操作注解
 */
public class Reflection10 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.zhang.Student2");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("annotation+"+annotation);
        }
        //获取注解的value的值
        Table annotation = (Table)c1.getAnnotation(Table.class);
        String value = annotation.value();
        System.out.println(value);

        //获取类指定注解
        Field field = c1.getDeclaredField("id");
        FieldZhang annotation1 = field.getAnnotation(FieldZhang.class);
        System.out.println(annotation1.columnName());
        System.out.println(annotation1.length());
        System.out.println(annotation1.type());
    }

}
@Table("db_student")
class Student2{
    @FieldZhang(columnName = "db_id",type = "int",length = 10)
    private int id;
    @FieldZhang(columnName = "db_age",type = "int",length = 10)
    private int age;
    @FieldZhang(columnName = "db_name",type = "varchar",length = 10)
    private String name;

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student2() {
    }
}

//类名注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table{
    String value();
}

//属性注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldZhang{
    String columnName();
    String type();
    int length();
}
