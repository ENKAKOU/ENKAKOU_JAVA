package com.hspedu.enum_;

public class EnumDetail {

        public static void main(String[] args) {
            Mu.CLASSICMU.playing();
        }
    }


class A {

}

interface IPlaying {
    public void playing();
}

enum Mu implements IPlaying {
    CLASSICMU;

    public void playing() {
        System.out.println("播放好听的MU...");

    }
}
