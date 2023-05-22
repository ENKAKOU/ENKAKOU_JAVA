package com.hspedu.wrapper;

public class WrapperVSString {

    public static void main(String[] args) {

    Integer i = 100;

    //方式1
    String str1 = i + "";

    //方式2
    String str2 = i.toString();

    //方式3
    String str3 = String.valueOf(i);

    String str4 = "12345";
    Integer i2 = Integer.parseInt(str4);   //使用到自动装箱
    Integer i3 = new Integer(str4);        //构造器

    System.out.println("ok~~");

    }
}
