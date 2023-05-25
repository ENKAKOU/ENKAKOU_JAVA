package com.hspedu.collection_;

import java.util.ArrayList;
@SuppressWarnings({"all"})

public class ArrayListDetail {

    public static void main(String[] args) {
//        public boolean add(E e) {
//            ensureCapacityInternal(size + 1);  // Increments modCount!!
//            elementData[size++] = e;
//            return true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        arrayList.add("hsp");
        System.out.println(arrayList);

    }
}
