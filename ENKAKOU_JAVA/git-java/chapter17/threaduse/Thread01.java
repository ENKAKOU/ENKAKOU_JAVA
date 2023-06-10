package chapter17.threaduse;

public class Thread01 {

    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
//            public synchronized void start() {
//                start0();
//            }
//            private native void start0();
//            cat.start();

        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for(int i = 0; i < 60; i++) {
            System.out.println("主线程 i=" + i);
            Thread.sleep(1000);
        }

    }
}

//    public void run() {
//        if (target != null) {
//            target.run();
//        }
//    }


class Cat extends Thread {
    int times = 0;
    public void run() {
        while (true) {
            System.out.println("喵喵, 我是小猫咪" + (++times) + " 线程名=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80) {
                break;
            }
        }

    }
}
