package com.hspedu.tankgame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener,Runnable {
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        hero = new Hero(100, 100);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);

        if(hero.shot != null && hero.shot.isLive == true) {
            System.out.println("子弹被绘制...");
            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
        }

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
        }
    }


    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:   //敌人
                g.setColor(Color.cyan);
                break;
            case 1:   //我
                g.setColor(Color.yellow);
                break;
        }

        switch (direct) {
            case 0: //表示向上
                g.fill3DRect(x, y, 10, 60, false);  //画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);  //画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);  //画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);  //画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);  //画出炮筒
                break;

            case 1: //表示向右
                g.fill3DRect(x, y, 60, 10, false); //画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);  //画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);  //画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);  //画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);  //画出炮筒
                break;

            case 2: //表示向下
                g.fill3DRect(x, y, 10, 60, false); //画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);  //画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);  //画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);  //画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);  //画出炮筒
                break;

            case 3: //表示向左
                g.fill3DRect(x, y, 60, 10, false);  //画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);  //画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);  //画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);  //画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);  //画出炮筒
                break;

            default:
                System.out.println("暂时没有处理");

        }

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {    //按下W键
            hero.setDirect(0);
            hero.moveUp();

        } else if (e.getKeyCode() == KeyEvent.VK_D) {    //D键, 向右
            hero.setDirect(1);
            hero.moveRight();

        } else if (e.getKeyCode() == KeyEvent.VK_S) {    //S键
            hero.setDirect(2);
            hero.moveDown();

        } else if (e.getKeyCode() == KeyEvent.VK_A) {    //A键
            hero.setDirect(3);
            hero.moveLeft();
        }

        if(e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下了J, 开始射击.");
            hero.shotEnemyTank();
        }
        this.repaint();

    }

    public void keyReleased(KeyEvent e) {

    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }

    }
}
