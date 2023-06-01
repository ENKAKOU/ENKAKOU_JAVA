package com.hspedu.map_;

import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class HashMapSource1 {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java", 10);
        map.put("php", 10);
        map.put("java", 20);

        System.out.println("map=" + map);

//        public V put(K key, V value) {
//            return putVal(hash(key), key, value, false, true);
//        }
//
//        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
//        boolean evict) {
//            Node<K,V>[] tab; Node<K,V> p; int n, i;
//            if ((tab = table) == null || (n = tab.length) == 0) {
//                n = (tab = resize()).length;
//            }
//
//            if ((p = tab[i = (n - 1) & hash]) == null){
//                tab[i] = newNode(hash, key, value, null);
//            } else {
//
//            if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k)))) {
//                    e = p;
//            } else if (p instanceof TreeNode) {
//                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
//            } else {
//
//            for (int binCount = 0; ; ++binCount) {
//                if ((e = p.next) == null) {
//                            p.next = newNode(hash, key, value, null);
//
//                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
//                            treeifyBin(tab, hash);
//                            break;
//                        }
//
//                if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k)))) {
//                            break;
//                            p = e;
//                    }
//                }
//
//                if (e != null) {
//                    V oldValue = e.value;
//                    if (!onlyIfAbsent || oldValue == null)
//                        e.value = value;
//                    afterNodeAccess(e);
//                    return oldValue;
//                }
//            }
//
//            ++modCount;
//            if (++size > threshold[12-24-48])
//                resize();
//            afterNodeInsertion(evict);
//            return null;
//        }
//
//        final void treeifyBin(Node<K,V>[] tab, int hash) {
//            int n, index; Node<K,V> e;
//            if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
//                resize();
//        }

    }
}