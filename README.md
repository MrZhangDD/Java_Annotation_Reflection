# Java_Annotation_Reflection
java注解和反射
10-自定义注解+反射获取注解和注解上的属性
09-通过反射获取方法上的泛型
08-测试普通方法 > 关闭安全检测的方法 > 反射方法性能
07-动态创建对象，setAccessible(true); 1.需要无参构造2.获取构造器设置对象3.通过反射获取普通方法4.通过反射操作属性
06-getFields()-public属性；getDeclaredFields()-所有属性；getMethods()-获取本类及父类方法；getDeclaredMethods()-获取本类方法
getConstructors()-获取public构造器；getDeclaredConstructors()-所有构造器
05-获取所有类型的calss
04- ClassLoader classLoader = Class.forName("com.zhang.Reflection05").getClassLoader();
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
       System.getProperty("java.class.path")
03-各个类型的class；只要元素类型和维度一样，就是同一个class
02-获取类对象的几种方式：第一种方式：通过对象获取、二：通过forname获取，三：通过类名.class
01-通过反射获取Class的包名类名Class.forName("com.zhang.User");//一个类在内存中只有一个class对象//一个类被加载后。类的整个结构被封装在class对象中
