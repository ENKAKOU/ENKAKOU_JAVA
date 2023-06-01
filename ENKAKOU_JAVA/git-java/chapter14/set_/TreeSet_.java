package com.hspedu.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {

    public static void main(String[] args) {

//         public TreeMap(Comparator<? super K> comparator) {
//                this.comparator = comparator;
//            }
//             if (cpr != null) {
//                do {
//                    parent = t;
//                    cmp = cpr.compare(key, t.key);
//                    if (cmp < 0) {
//                        t = t.left;
//                    } else if(cmp > 0) {
//                        t = t.right;
//                    } else {
//                        return t.setValue(value);
//                } while (t != null);
//            }

//        TreeSet treeSet = new TreeSet();

        TreeSet treeSet = new TreeSet(new Comparator() {

            public int compare(Object o1, Object o2) {
                //return ((String) o2).compareTo((String) o1);
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("abc");

        System.out.println("treeSet=" + treeSet);

    }
}
