package chapter14.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {

    public static void main(String[] args) {

        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);
        set.add(null);

        for(int i = 0; i <10;i ++) {
            System.out.println("set=" + set);
        }

        System.out.println("=====使用迭代器====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);

        }

        set.remove(null);
        System.out.println("=====增强for====");

        for (Object o : set) {
            System.out.println("o=" + o);
        }

    }
}
