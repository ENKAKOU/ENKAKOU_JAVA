package com.hspedu.tankgame3;

public class Shot implements Runnable {
    int x;    //x坐标
    int y;    //y坐标
    int direct = 0;    //方向
    int speed = 2;     //速度
    boolean isLive = true;    //是否还存活

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (direct) {
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }

            System.out.println("子弹 x=" + x + " y=" + y);
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }

        }
    }
}
