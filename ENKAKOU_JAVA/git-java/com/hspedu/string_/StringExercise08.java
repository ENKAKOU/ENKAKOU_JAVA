package com.hspedu.string_;

public class StringExercise08 {

    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";

        String c = a + b;
        String d = "hello abc";
        System.out.println(c == d);
        String e = "hello" + "abc";
        System.out.println(d == e);

    }
}
