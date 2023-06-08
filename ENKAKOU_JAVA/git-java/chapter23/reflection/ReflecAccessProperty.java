package chapter23.reflection;

import java.lang.reflect.Field;

public class ReflecAccessProperty {

    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchFieldException {

        Class<?> stuClass = Class.forName("com.hspedu.reflection.Student");
        Object o = stuClass.newInstance();//o 的运行类型就是Student
        System.out.println(o.getClass());
        Field age = stuClass.getField("age");

        age.set(o, 88);
        System.out.println(o);//
        System.out.println(age.get(o));//返回age属性的值

        Field name = stuClass.getDeclaredField("name");

        name.setAccessible(true);
        name.set(null, "老韩~");
        System.out.println(o);
        System.out.println(name.get(o));    //获取属性值
        System.out.println(name.get(null));   //获取属性值, 要求name是static

    }
}

class Student {   //类
    public int age;
    private static String name;

    public Student() {   //构造器
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

