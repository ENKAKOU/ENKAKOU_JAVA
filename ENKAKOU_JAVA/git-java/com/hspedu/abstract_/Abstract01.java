package com.hspedu.abstract_;

public class Abstract01 {

    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

//    public void eat() {
//        System.out.println("这是一个动物，但是不知道吃什么..");
//    }

    public abstract void eat();
}
