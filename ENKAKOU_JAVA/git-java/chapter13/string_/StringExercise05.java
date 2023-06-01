package chapter13.chapter13_Homework.string_;

public class StringExercise05 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "hsp";
        Person p2 = new Person();
        p2.name = "hsp";


        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        System.out.println(p1.name == "hsp");

        String s1 = new String("bc");
        String s2 = new String("de");
        System.out.println(s1 == s2);

    }
}

class Person {
    public String name;
}
