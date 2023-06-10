package com.hspedu.codeblock_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class CodeBlock01 {

    public static void main(String[] args) {

        Movie movie = new Movie("你好，李焕英");
        System.out.println("===========");
        Movie movie2 = new Movie("唐人街3", 100, "陈锡城");
    }
}


class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正是开始...");
    }

    public Movie(String name) {
        System.out.println("Movie(String name) 被调用...");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director) 被调用...");
        this.name = name;
        this.price = price;
        this.director = director;

    }
}
