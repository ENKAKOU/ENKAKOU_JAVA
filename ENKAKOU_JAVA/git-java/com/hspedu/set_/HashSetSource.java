package com.hspedu.set_;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetSource {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set=" + hashSet);

//        1. 执行 HashSet()
//            public HashSet() {
//                map = new HashMap<>();
//            }

//        2. 执行 add()
//           public boolean add(E e) {
//                return map.put(e, PRESENT)==null;//(static) PRESENT = new Object();
//           }

//         3.执行 put()
//             public V put(K key, V value) {
//                return putVal(hash(key), key, value, false, true);
//            }

//         4.执行 putVal
//                if ((tab = table) == null || (n = tab.length) == 0) }
//                    n = (tab = resize()).length;
//
//                if ((p = tab[i = (n - 1) & hash]) == null) }
//                    tab[i] = newNode(hash, key, value, null);
//                } else {
//                    Node<K,V> e; K k;
//
//                    if (p.hash == hash &&((k = p.key) == key || (key != null && key.equals(k)))) }
//                        e = p;
//
//                    else if } (p instanceof TreeNode)
//                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
//                } else {
//
//                        for (int binCount = 0; ; ++binCount) {
//                            if ((e = p.next) == null) {
//                                p.next = newNode(hash, key, value, null);
//                                if (binCount >= TREEIFY_THRESHOLD(8) - 1) // -1 for 1st
//                                    treeifyBin(tab, hash);
//                                break;
//                            }
//                            if (e.hash == hash &&((k = e.key) == key || (key != null && key.equals(k)))) {
//                                break;
//                            p = e;
//                        }
//                    }
//
//                    if (e != null) {
//                        V oldValue = e.value;
//                        if (!onlyIfAbsent || oldValue == null)
//                            e.value = value;
//                        afterNodeAccess(e);
//                        return oldValue;
//                    }
//                }
//                ++modCount;
//
//                if (++size > threshold) }
//                    resize();
//                afterNodeInsertion(evict);
//                return null;
//            }

    }
}
