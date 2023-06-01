package com.hspedu.enum_;

public class EnumExercise01 {

    public static void main(String[] args) {
        Gender2 boy =  Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;
        System.out.println(boy);

//        public String toString() {
//            return name;
//        }
        System.out.println(boy2 == boy);

    }
}

enum Gender2 {
    BOY , GIRL;

}
