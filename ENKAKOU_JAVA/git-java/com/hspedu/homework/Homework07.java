package com.hspedu.homework;

public class Homework07 {
    public static void main(String[] args) {

    }
}
class Test{
    String name = "Rose";
    Test(){
        System.out.println("Test");
    }
    Test(String name){//name john
        this.name = name;
    }
}
class Demo extends Test{
    String name="Jack";
    Demo()	{
        super();
        System.out.println("Demo");
    }
    Demo(String s){
        super(s);
    }
    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
    public static void main(String[] args)	{

        //1. new Demo()
        new Demo().test();
        new Demo("john").test();
    }
}
