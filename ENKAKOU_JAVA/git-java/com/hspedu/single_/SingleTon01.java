package com.hspedu.single_;

public class SingleTon01 {

    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");

        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);//T
        //System.out.println(GirlFriend.n1);

        //...

    }
}

class GirlFriend {

    private String name;
    private static GirlFriend gf = new GirlFriend("小红");

    private GirlFriend(String name) {
        System.out.println("構造器被調用.");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;

    }

    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
