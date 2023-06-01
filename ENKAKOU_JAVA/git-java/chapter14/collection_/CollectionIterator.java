package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("少年歌行", "李宏毅", 10.1));
        col.add(new Book("沉香如屑", "成毅", 5.1));
        col.add(new Book("苍兰决", "张凌赫", 34.6));

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        iterator = col.iterator(); // 重新获取迭代器
        System.out.println("===第二次迭代===");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
    }

    
    static class Book {
        private String name;
        private String author;
        private double price;

        public Book(String name, String author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';

        }
    }
}
