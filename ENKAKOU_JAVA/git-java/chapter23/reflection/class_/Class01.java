package chapter23.reflection.class_;

import chapter23.Cat;
import java.util.ArrayList;

public class Class01 {

    public static void main(String[] args) throws ClassNotFoundException {

//            public Class<?> loadClass(String name) throws ClassNotFoundException {
//                return loadClass(name, false);
//            }
//       Cat cat = new Cat();

//            public Class<?> loadClass(String name) throws ClassNotFoundException {
//                return loadClass(name, false);
//            }

        Class cls1 = Class.forName("com.hspedu.Cat");

        Class cls2 = Class.forName("com.hspedu.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class cls3 = Class.forName("com.hspedu.Dog");
        System.out.println(cls3.hashCode());

    }
}
