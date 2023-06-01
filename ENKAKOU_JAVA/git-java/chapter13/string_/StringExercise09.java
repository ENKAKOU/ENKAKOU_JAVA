package chapter13.chapter13_Homework.string_;

public class StringExercise09 {

    public static void main(String[] args) {
        String s1 = "hsp ";                 //s1 指向池中的 “hsp”
        String s2 = "java";                 // s2 指向池中的 “java”
        String s5 = "hsp java";             //s5 指向池中的 “hsp java”
        String s6 = (s1 + s2).intern();     //s6 指向池中的   “hsp java”
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));

    }
}
