package chapter23.reflection.class_;

import chapter23.Car;

public class GetClass_ {

    public static void main(String[] args) throws ClassNotFoundException {

        String classAllPath = "com.hspedu.Car";         //1. Class.forName
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        Class cls2 = Car.class;
        System.out.println(cls2);

        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        ClassLoader classLoader = car.getClass().getClassLoader();    //(1)先得到类加载器 car

        Class cls4 = classLoader.loadClass(classAllPath);    //(2)通过类加载器得到Class对象
        System.out.println(cls4);

        System.out.println(cls1.hashCode());     //cls1 , cls2 , cls3 , cls4 其实是同一个对象
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);//int

        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE; //其它包装类BOOLEAN, DOUBLE, LONG,BYTE等待
        System.out.println(type1);

        System.out.println(integerClass.hashCode());
        System.out.println(type1.hashCode());

    }
}
