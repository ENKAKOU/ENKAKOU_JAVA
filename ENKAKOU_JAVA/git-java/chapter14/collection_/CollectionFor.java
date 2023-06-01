package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {

    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new CollectionIterator.Book("少年歌行", "李宏毅", 10.1));
        col.add(new CollectionIterator.Book("沉香如屑", "成毅", 5.1));
        col.add(new CollectionIterator.Book("苍兰决", "张凌赫", 34.6));

        for (Object book : col) {
            System.out.println("book=" + book);
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
