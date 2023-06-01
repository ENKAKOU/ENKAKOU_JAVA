package chapter09.houserent;

import chapter09.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        byte b1 = 123;
        b1 += 100000;
        System.out.println(b1);

        byte b2 = 123;
        b2 = (byte)(b2 + 100000);
        System.out.println(b2);

        new HouseView().mainMenu();
        System.out.println("===你推出房屋出租系统===");
        
    }
}
