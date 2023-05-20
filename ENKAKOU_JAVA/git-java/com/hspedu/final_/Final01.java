package com.hspedu.final_;

public class Final01 {

    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE = 0.09;
    }
}

final class A { }

//class B extends A {}

class C {

    public final void hi() {}
}
class D extends C {

//    public void hi() {
//        System.out.println("重写了C类的hi方法..");
//    }
}

class E {
    public final double TAX_RATE = 0.08;
}

class F {
    public void cry() {
        final double NUM = 0.01;
        //NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}
