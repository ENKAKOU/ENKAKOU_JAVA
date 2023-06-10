package chapter14.list_;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListCRUD {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);

        linkedList.remove();
        System.out.println("linkedList=" + linkedList);

        linkedList.set(1, 999);
        System.out.println("linkedList=" + linkedList);

        Object o = linkedList.get(1);
        System.out.println(o);
        System.out.println("===LinkeList遍历迭代器====");

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next);

        }

        System.out.println("===LinkeList遍历增强for====");
        for (Object o1 : linkedList) {
            System.out.println("o1=" + o1);
        }
        System.out.println("===LinkeList遍历普通for====");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
//
//             void linkLast(E e) {
//                final Node<E> l = last;
//                final Node<E> newNode = new Node<>(l, e, null);
//                last = newNode;
//                if (l == null)
//                    first = newNode;
//                else
//                    l.next = newNode;
//                size++;
//                modCount++;
//            }
//
//     // 1. 执行 removeFirst
//            public E remove() {
//                return removeFirst();
//            }
//
//     // 2. 执行
//            public E removeFirst() {
//                final Node<E> f = first;
//                if (f == null)
//                    throw new NoSuchElementException();
//                return unlinkFirst(f);
//            }
//
//     // 3. 执行 unlinkFirst
//            private E unlinkFirst(Node<E> f) {
//                // assert f == first && f != null;
//                final E element = f.item;
//                final Node<E> next = f.next;
//                f.item = null;
//                f.next = null; // help GC
//                first = next;
//                if (next == null)
//                    last = null;
//                else
//                    next.prev = null;
//                size--;
//                modCount++;
//                return element;
//            }

    }
}
