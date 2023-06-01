package chapter08.homework;

public class Homework15 {

    public static void main(String[] args) {
        AAA obj = new BBB();
        AAA b1 = obj;
        System.out.println("obj的运行类型=" + obj.getClass());
        obj = new CCC();//向上转型

        System.out.println("obj的运行类型=" + obj.getClass());
        obj = b1;

        System.out.println("obj的运行类型=" + obj.getClass());
    }
}


class AAA {

}


class BBB extends AAA {

}


class CCC extends BBB {

}