package com.hspedu.list_;

import java.util.Arrays;
import java.util.Vector;
@SuppressWarnings({"all"})

public class Vector_ {

    public static void main(String[] args) {
        Vector vector = new Vector(8);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector=" + vector);

//        public Vector() {
//            this(10);
//            }
//
//        public Vector(int initialCapacity) {
//            this(initialCapacity, 0);
//            }
//
//        public synchronized boolean add(E e) {
//            modCount++;
//            ensureCapacityHelper(elementCount + 1);
//            elementData[elementCount++] = e;
//            return true;
//            }
//
//        private void ensureCapacityHelper(int minCapacity) {
//            if (minCapacity - elementData.length > 0)
//               grow(minCapacity);
//            }
//
//            newCapacity = oldCapacity + ((capacityIncrement > 0) ? capacityIncrement : oldCapacity);
//
//        private void grow(int minCapacity) {
//            int oldCapacity = elementData.length;
//            int newCapacity = oldCapacity + ((capacityIncrement > 0) ? capacityIncrement : oldCapacity);
//
//            if (newCapacity - minCapacity < 0)
//                newCapacity = minCapacity;
//
//            if (newCapacity - MAX_ARRAY_SIZE > 0)
//                newCapacity = hugeCapacity(minCapacity);
//                elementData = Arrays.copyOf(elementData, newCapacity);
//            }
//

    }
}
