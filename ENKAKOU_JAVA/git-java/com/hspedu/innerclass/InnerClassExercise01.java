package com.hspedu.innerclass;

import com.hspedu.abstract_.AA;

public class InnerClassExercise01 {

    public static void main(String[] args) {
        f1(new IL() {
            
            public void show() {
                System.out.println("这是一副名画~~...");
            }
        });

        f1(new Picture());

    }

    public static void f1(IL il) {
        il.show();
    }
}

interface IL {
    void show();
}

class Picture implements IL {

    public void show() {
        System.out.println("这是一副名画XX...");
    }
}

