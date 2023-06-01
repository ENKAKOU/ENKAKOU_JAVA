package chapter11.annotation_;

public class Deprecated_ {

    public static void main(String[] args) {
        A a =new A();
        a.h1();
        System.out.println(a.n1);
    }
}


class A {
    public int n1 = 10;

    public void h1() {

    }
}
