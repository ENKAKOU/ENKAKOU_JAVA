package chapter13.string_;

public class StringMethod01 {

    public static void main(String[] args) {
        //1. equals
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));

        // 2.equalsIgnoreCase
        String username = "johN";
        if ("john".equalsIgnoreCase(username)) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }

        // 3.length
        System.out.println("韩顺平".length());

        // 4.indexOf
        String s1 = "wer@terwe@g";
        int index = s1.indexOf('@');
        System.out.println(index);
        System.out.println("weIndex=" + s1.indexOf("we"));

        // 5.lastIndexOf
        s1 = "wer@terwe@g@";
        index = s1.lastIndexOf('@');
        System.out.println(index);//11
        System.out.println("ter的位置=" + s1.lastIndexOf("ter"));

        // 6.substring 截取指定范围的子串
        String name = "hello,张三";
        System.out.println(name.substring(6));
        System.out.println(name.substring(2,5));

    }
}
