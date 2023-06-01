package chapter19.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//
//            Properties 父类是 Hashtable ， 底层就是Hashtable 核心方法
//            public synchronized V put(K key, V value) {
//                // Make sure the value is not null
//                if (value == null) {
//                    throw new NullPointerException();
//                }
//
//                // Makes sure the key is not already in the hashtable.
//                Entry<?,?> tab[] = table;
//                int hash = key.hashCode();
//                int index = (hash & 0x7FFFFFFF) % tab.length;
//
//                Entry<K,V> entry = (Entry<K,V>)tab[index];
//                for(; entry != null ; entry = entry.next) {
//                    if ((entry.hash == hash) && entry.key.equals(key)) {
//                        V old = entry.value;
//                        entry.value = value;//如果key 存在，就替换
//                        return old;
//                    }
//                }
//
//                addEntry(hash, key, value, index);//如果是新k, 就addEntry
//                return null;
//            }

        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "汤姆");
        properties.setProperty("pwd", "888888");

        //将k-v 存储文件中即可
        properties.store(new FileOutputStream("src\\mysql2.properties"), null);
        System.out.println("保存配置文件成功~");

    }
}
