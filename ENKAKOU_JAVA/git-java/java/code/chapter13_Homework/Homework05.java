package java.code.chapter13_Homework;

public class Homework05 {

    public static void main(String[] args) {
        String s1 = "hsp";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.name == b.name);
        String s4 = new String("hsp");
        String s5 = "hsp";

        System.out.println(s1 == s4);
        System.out.println(s4 == s5);

        String t1 = "hello" + s1;
        String t2 = "hello hsp";
        System.out.println(t1.intern() == t2.intern());
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
