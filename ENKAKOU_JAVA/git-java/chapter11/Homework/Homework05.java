package com.hspedu.homework;

public class Homework05 {
    
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String NAME = "hello";
    public void f1() {

        class B { 
            private final String NAME = "韩顺平教育";
            public void show() {
            
                System.out.println("NAME=" + NAME + " 外部类的name=" + A.this.NAME);
            }
        }
        
        B b = new B();
        b.show();
        
    }
}
