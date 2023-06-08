package chapter23.reflection;

public class ReflecCreateInstance {

    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> userClass = Class.forName("com.hspedu.reflection.User");

        Object o = userClass.newInstance();
        System.out.println(o);

//            constructor 对象就是
//            public User(String name) {//public的有参构造器
//                this.name = name;
//            }

        Constructor<?> constructor = userClass.getConstructor(String.class);

        Object hsp = constructor.newInstance("hsp");
        System.out.println("hsp=" + hsp);

        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);

        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "张三丰");
        System.out.println("user2=" + user2);
    }
}


class User {
    private int age = 10;
    private String name = "韩顺平教育";

    public User() {   //无参
    }

    public User(String name) {     //有参构造器
        this.name = name;
    }

    private User(int age, String name) {    //有参构造器
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}
