package com.hspedu.customgeneric;

public class CustomInterfaceGeneric {

    public static void main(String[] args) {

    }
}

interface IA extends IUsb<String, Double> {

}


class AA implements IA {

    public Double get(String s) {
        return null;
    }
    public void hi(Double aDouble) {

    }

    public void run(Double r1, Double r2, String u1, String u2) {

    }
}


class BB implements IUsb<Integer, Float> {

    public Float get(Integer integer) {
        return null;
    }

    public void hi(Float aFloat) {

    }

    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

class CC implements IUsb {

    public Object get(Object o) {
        return null;
    }

    public void hi(Object o) {
    }

    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}

interface IUsb<U, R> {

    int n = 10;
    R get(U u);
    void hi(R r);
    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;

    }
}


