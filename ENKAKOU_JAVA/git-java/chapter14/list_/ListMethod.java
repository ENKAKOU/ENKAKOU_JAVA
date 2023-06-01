package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Zhang SanFeng");
        list.add("Jia BaoYu");

//        public void add(int index, Object ele);
        list.add(1, "hsp");
        System.out.println("list=" + list);

//        boolean addAll(int index, Collection eles);
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list=" + list);

//        Object get(int index);
        System.out.println(list.indexOf("tom"));

//        int lastIndexOf(Object obj);
        list.add("hsp");
        System.out.println("list=" + list);
        System.out.println(list.lastIndexOf("hsp"));

//        Object remove(int index);
        list.remove(0);
        System.out.println("list=" + list);

//        Object set(int index, Object ele);
        list.set(1, "marry");
        System.out.println("list=" + list);

//        List subList(int fromIndex, int toIndex);
        List returnlist = list.subList(0, 2);
        System.out.println("returnlist=" + returnlist);

    }
}
