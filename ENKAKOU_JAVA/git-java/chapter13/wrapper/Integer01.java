package chapter13.chapter13_Homework.wrapper;

public class Integer01 {

    public static void main(String[] args) {
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();
        int n2 = 200;

        //自动装箱 int->Integer
        Integer integer2 = n2;
        //自动拆箱 Integer->int
        int n3 = integer2;

    }
}
