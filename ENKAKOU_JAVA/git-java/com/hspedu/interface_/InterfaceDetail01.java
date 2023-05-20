package com.hspedu.interface_;

public class InterfaceDetail01 {

    public static void main(String[] args) {
        //new IA();
    }
}

interface IA {
    void say();
    void hi();
}
class Cat implements IA{

    public void say() {

    }

    public void hi() {

    }
}

abstract class Tiger implements  IA {

}
