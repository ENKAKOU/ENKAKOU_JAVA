package chapter14.set_;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetExercise {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("milan", 18));
        hashSet.add(new Employee("smith", 28));
        hashSet.add(new Employee("milan", 18));

        System.out.println("hashSet=" + hashSet);
    }
}


class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    public int hashCode() {
        return Objects.hash(name, age);

    }
}

