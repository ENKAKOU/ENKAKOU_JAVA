package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序~");
    }

    public DrawCircle() {
        mp = new MyPanel();

        this.add(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}


class MyPanel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint 方法被调用了~");

//        g.setColor(Color.blue);
//        g.fillRect(10, 10, 100, 100);
//        g.setColor(Color.red);
//        g.fillOval(10, 10, 100, 100);

//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
//        g.drawImage(image, 10, 10, 175, 221, this);

        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        g.drawString("北京你好", 100, 100);

    }
}
