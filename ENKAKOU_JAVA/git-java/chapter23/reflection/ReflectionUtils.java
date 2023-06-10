package chapter23.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static void main(String[] args) {

    }

    public void api_02() throws ClassNotFoundException, NoSuchMethodException {
        //得到Class对象
        Class<?> personCls = Class.forName("com.hspedu.reflection.Person");

        //getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName()
                    + " 该属性的修饰符值=" + declaredField.getModifiers()
                    + " 该属性的类型=" + declaredField.getType());
        }

        //getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName()
                    + " 该方法的访问修饰符值=" + declaredMethod.getModifiers()
                    + " 该方法返回类型" + declaredMethod.getReturnType());

            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型=" + parameterType);
            }
        }

        //getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("====================");
            System.out.println("本类中所有构造器=" + declaredConstructor.getName());//这里老师只是输出名

            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型=" + parameterType);
            }
        }

    }

    //第一组方法API
    public void api_01() throws ClassNotFoundException, NoSuchMethodException {

        Class<?> personCls = Class.forName("com.hspedu.reflection.Person");  //得到Class对象
        System.out.println(personCls.getName());  //getName:获取全类名
        System.out.println(personCls.getSimpleName());  //getSimpleName:获取简单类名
        Field[] fields = personCls.getFields();  //getFields:获取所有public修饰的属性
        for (Field field : fields) {
            System.out.println("本类以及父类的属性=" + field.getName());
        }

        Field[] declaredFields = personCls.getDeclaredFields();  //getDeclaredFields:获取本类中所有属性
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName());
        }

        Method[] methods = personCls.getMethods();  //getMethods:获取所有public修饰的方法，包含本类以及父类的
        for (Method method : methods) {
            System.out.println("本类以及父类的方法=" + method.getName());
        }

        Method[] declaredMethods = personCls.getDeclaredMethods();  //getDeclaredMethods:获取本类中所有方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName());
        }

        Constructor<?>[] constructors = personCls.getConstructors();  //getConstructors: 获取所有public修饰的构造器，包含本类
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类的构造器=" + constructor.getName());
        }

        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();  //getDeclaredConstructors:获取本类中所有构造器
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有构造器=" + declaredConstructor.getName());
        }

        System.out.println(personCls.getPackage());  //getPackage:以Package形式返回
        Class<?> superclass = personCls.getSuperclass();  //getSuperClass:以Class形式返回父类信息
        System.out.println("父类的class对象=" + superclass);  //getInterfaces:以Class[]形式返回接口信息

        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息=" + anInterface);
        }

        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息=" + annotation);   //注解
        }

    }
}


class A {

    public String hobby;
    public void hi() {

    }

    public A() {
    }

    public A(String name) {
    }
}

interface IA {
}

interface IB {

}


class Person extends A implements IA, IB {

    public String name;
    protected static int age;
    String job;
    private double sal;

    public Person() {

    }

    public Person(String name) {

    }

    private Person(String name, int age) {  //私有的

    }

    public void m1(String name, int age, double sal) {  //方法

    }

    protected String m2() {
        return null;
    }

    void m3() {

    }

    private void m4() {

    }
}
