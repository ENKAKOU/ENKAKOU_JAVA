package com.hspedu.interface_;

public class InterfaceDetail02 {

    public static void main(String[] args) {
        System.out.println(IB.n1);

    }
}

interface IB {
    int n1 = 10;
    void hi();
}

interface IC {
    void say();
}


interface ID extends IB,IC {
}

interface IE{

}

class Pig implements IB,IC {

    public void hi() {
    }

    public void say() {

    }
}
