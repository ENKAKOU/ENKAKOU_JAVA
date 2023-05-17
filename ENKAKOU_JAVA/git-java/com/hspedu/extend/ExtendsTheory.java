package com.hspedu.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);//返回就是大头儿子
//      System.out.println(son.age);//返回的就是 39
//      System.out.println(son.getAge());//返回的就是 39
        System.out.println(son.hobby);//返回的就是旅游
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "大头儿子";
}

