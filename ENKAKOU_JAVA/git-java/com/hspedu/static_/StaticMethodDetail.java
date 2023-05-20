package com.hspedu.static_;

public class StaticMethodDetail {

    public static void main(String[] args) {
        D.hi();
        new D().say();
    }

}

class D {
    private int n1 = 100;
    private static  int n2 = 200;

    public void say() {
    }

    public static  void hi() {
        //System.out.println(this.n1);
    }

    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
        //System.out.println(this.n2);
        hi();
    }

    public void ok() {
        System.out.println(n1);
        say();
        System.out.println(n2);
        hello();

    }
}
