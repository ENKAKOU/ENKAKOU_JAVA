package chapter08.poly_;

public class PloyMethod {
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));

        //方法重写体现多态
        B b = new B();
        a.say();
        b.say();

    }
}
class B { //父类
    public void say() {
        System.out.println("B say() 方法被调用...");
    }
}
class A extends B {//子类
    public int sum(int n1, int n2){//和下面sum 构成重载
        return n1 + n2;
    }
    public int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("A say() 方法被调用...");
    }
}
