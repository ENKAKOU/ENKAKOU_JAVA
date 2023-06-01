package chapter14.map_;

import java.util.HashMap;

public class HashMapSource2 {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for(int i = 1; i <= 12; i++) {
            hashMap.put(i, "hello");
        }

        hashMap.put("aaa", "bbb");
        System.out.println("hashMap=" + hashMap);
    }
}

class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

//    public int hashCode() {
//        return 100;
//    }

    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';

    }
}