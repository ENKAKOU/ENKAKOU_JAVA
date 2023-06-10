package chapter15.generic;

import java.util.List;

public class Generic03 {

    public static void main(String[] args) {
        Person<String> person = new Person<String>("韩顺平教育");
        person.show();

//            class Person {
//                String s ;
//
//                public Person(String s) {
//                    this.s = s;
//                }
//
//                public String f() {
//                    return s;
//                }
//            }

        Person<Integer> person2 = new Person<Integer>(100);
        person2.show();

//            class Person {
//                Integer s ;
//
//                public Person(Integer s) {
//                    this.s = s;
//                }
//
//                public Integer f() {
//                    return s;
//                }
//            }

    }
}


class Person<E> {
    E s ;

    public Person(E s) {
        this.s = s;
    }

    public E f() {
        return s;
    }

    public void show() {
        System.out.println(s.getClass());

    }
}
