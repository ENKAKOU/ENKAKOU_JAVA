package com.hspedu.annotation_;

public class Override_ {

    public static void main(String[] args) {

    }
}


class Father {
    public void fly() {
        int i = 0;
        System.out.println("Father fly...");
    }

    public void say() {

    }
}


class son extends Father {
    public void fly() {
        System.out.println("Son fly....");
    }

    public void say() {

    }
}
