package chapter13.chapter13_Homework.stringbuffer_;

public class StringBufferMethod {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("hello");

        //增
        s.append(',');
        s.append("萧瑟、");
        s.append("雷无杰、").append(100).append(true).append(10.5);
        System.out.println(s);

        //删
        s.delete(11, 14);
        System.out.println(s);

        //改
        s.replace(9, 11, "唐莲、");
        System.out.println(s);
        int indexOf = s.indexOf("萧瑟、");
        System.out.println(indexOf);

        //插
        s.insert(9, "雷无杰、");
        System.out.println(s);

        //长度
        System.out.println(s.length());
        System.out.println(s);

    }
}
