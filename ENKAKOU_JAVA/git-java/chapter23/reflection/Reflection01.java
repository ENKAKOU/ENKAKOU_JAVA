package chapter23.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();//"com.hspedu.Cat"
        String methodName = properties.get("method").toString();//"hi"

        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        System.out.println("o的运行类型=" + o.getClass());

        Method method1 = cls.getMethod(methodName);

        System.out.println("=============================");
        method1.invoke(o); //传统方法 对象.方法()

        //得到name字段
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));

        //java.lang.reflect.Constructor: 代表类的构造方法, Constructor对象表示构造器
        Constructor constructor = cls.getConstructor(); //返回无参构造器
        System.out.println(constructor);

        Constructor constructor2 = cls.getConstructor(String.class);
        System.out.println(constructor2);//Cat(String name)

    }
}
