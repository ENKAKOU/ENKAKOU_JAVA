package com.hspedu.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {

    public static void main(String[] args) {
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {

            public int compare(Object o1, Object o2) {
                //return ((String) o2).compareTo((String) o1);
                return ((String) o2).length() - ((String) o1).length();
            }
        });

        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");
        treeMap.put("hsp", "韩顺平");

        System.out.println("treemap=" + treeMap);

//            Entry<K,V> t = root;
//            if (t == null) {
//                compare(key, key);
//
//                root = new Entry<>(key, value, null);
//                size = 1;
//                modCount++;
//                return null;
//            }
//
//            Comparator<? super K> cpr = comparator;
//            if (cpr != null) {
//                do {
//                    parent = t;
//                    cmp = cpr.compare(key, t.key);
//                    if (cmp < 0)  {
//                        t = t.left;
//                    } else if { (cmp > 0)
//                        t = t.right;
//                    } else  {
//                        return t.setValue(value);
//                } while (t != null);
//            }

    }
}
