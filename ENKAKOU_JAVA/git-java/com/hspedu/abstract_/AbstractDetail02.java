package com.hspedu.abstract_;

public class AbstractDetail02 {

    public static void main(String[] args) {
        System.out.println("hello");
    }
}


abstract class H {
    public abstract void h1();
}


abstract class E {
    public abstract void h1();
}


abstract class F extends E {
}


class G extends E {
    public void h1() {

    }
}


abstract class D {
    public int n1 = 10;
    public static String name = "HSP教育";
    public void h1() {
        System.out.println("h1");
    }
    
    public abstract void hello();
    public static void ok() {
        System.out.println("ok");
        
    }
}
