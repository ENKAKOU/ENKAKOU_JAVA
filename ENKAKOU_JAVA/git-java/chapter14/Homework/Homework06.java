package chapter14.Homework;

import java.util.HashSet;
import java.util.Objects;

public class Homework06 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);

        set.add(new Person(1001, "CC"));
        System.out.println(set);

        set.add(new Person(1002, "AA"));
        System.out.println(set);
    }
}


class Person {
    public String name;
    public int id;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
        }

    public int hashCode() {
        return Objects.hash(name, id);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';

    }
}
