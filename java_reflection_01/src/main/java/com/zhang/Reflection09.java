package com.zhang;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * 通过反射获取泛型
 */
public class Reflection09 {
    public static void main(String[] args) throws NoSuchMethodException {
        Method test1 = Reflection09.class.getMethod("test1", Map.class, List.class);
        Type[] parameterTypes = test1.getGenericParameterTypes();
        for (Type parameterType : parameterTypes) {
            System.out.println("++"+parameterType);
            //ParameterizedType  参数化类型
            if(parameterType instanceof ParameterizedType){
                //获取实际类型参数
                Type[] arguments = ((ParameterizedType) parameterType).getActualTypeArguments();
                for (Type argument : arguments) {
                    System.out.println("实际参数化类型"+argument);
                }
            }
        }

        System.out.println("============");
        test1 = Reflection09.class.getMethod("test2");
        Type genericReturnType = test1.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType){
            //获取实际类型参数
            Type[] arguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type argument : arguments) {
                System.out.println("实际参数化类型"+argument);
            }
        }


    }
    public void test1(Map<String,User> map, List<User> list){
        System.out.println("test1");
    }
    public Map<String, User> test2(){
        System.out.println("test2");
        return null;
    }
}
