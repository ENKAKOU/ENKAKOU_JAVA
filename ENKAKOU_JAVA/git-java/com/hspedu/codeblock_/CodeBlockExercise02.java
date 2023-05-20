package com.hspedu.codeblock_;

public class CodeBlockExercise02 {
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample默认构造函数被调用");
    }
}

class Test {
    Sample sam1 = new Sample("sam1 成员初始化");
    static Sample sam = new Sample("静态成员sam初始化");

    static {
        System.out.println("static 执行快");
        if(sam==null)
            System.out.println("sam is null");
    }

    Test() {
        System.out.println("Test默认构造函数被调用");
    }

    public static void main(String[] str[]) {
        Test a=new Test();

    }
}