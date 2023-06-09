package chapter10.innerclass;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}


class Outer04 {
    private int n1 = 10;

    public void method() {

        IA tiger = new IA() {
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };

        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

//        IA tiger = new Tiger();
//        tiger.cry();

        Father father = new Father("jack"){

            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        
        System.out.println("father对象的运行类型=" + father.getClass());
        father.test();
       
        Animal animal = new Animal(){
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        
        animal.eat();
    }
}

interface IA {
    public void cry();
}

//class Tiger implements IA {

//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}

//class Dog implements  IA{
//    public void cry() {
//        System.out.println("小狗汪汪...");
//    }
//}


class Father {
    public Father(String name) {
        System.out.println("接收到name=" + name);
    }
    public void test() {
    }
}

abstract class Animal {
    abstract void eat();
}

