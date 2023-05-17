package com.hspedu.extend_;

import java.util.Arrays;

public class Sub extends Base { //子类

    public Sub(String name, int age) {
        //super();
        //super("hsp");
        super("king", 20);

        System.out.println("子类Sub(String name, int age)构造器被调用....");

    }

    public Sub() {//无参构造器
        //super();
        super("smith", 10);
        System.out.println("子类Sub()构造器被调用....");
    }
    public Sub(String name) {
        super("tom", 30);
        //do nothing...
        System.out.println("子类Sub(String name)构造器被调用....");
    }

    public void sayOk() {

        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();

        System.out.println("n4=" + getN4());
        callTest400();//
    }

}
