package chapter15.generic;

import java.util.*;

public class GenericExercise {

    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack", 18));
        students.add(new Student("tom", 28));
        students.add(new Student("mary", 19));

        for (Student student : students) {
            System.out.println(student);
        }

        HashMap<String, Student> hm = new HashMap<String, Student>();

        hm.put("milan", new Student("milan", 38));
        hm.put("smith", new Student("smith", 48));
        hm.put("hsp", new Student("hsp", 28));

//        public Set<Map.Entry<K,V>> entrySet() {
//            Set<Map.Entry<K,V>> es;
//            return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
//        }

        Set<Map.Entry<String, Student>> entries = hm.entrySet();

//            public final Iterator<Map.Entry<K,V>> iterator() {
//                return new EntryIterator();
//            }

        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        System.out.println("==============================");
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
            
        }
    }
}


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }
}
