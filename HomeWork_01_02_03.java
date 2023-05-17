import java.util.Scanner;

public class HomeWork_01_02_03 {
	
    public static void main(String[] args){
        // 例题1
            /* 某人有100，000元，每经过一个路口，需要缴费，退则如下：
               当现金 > 50000,每次叫5%
               当现金 < 50000,每次1000
               计算该人可以经过多少次路口（while + break） */
        /* 思路：
               1. 定义 double money 保存 100，000
               2. 三种情况：① money > 50000;  ② money >= 1000 && money <= 50000; ③ money < 1000;
               3. 变量 count 保存通过的路口    */
        double money = 100000;
         int count = 0;
        while (true){
            if(money > 50000){
                money *= 0.95;
                count++;
            } else if(money >= 1000){
                money -= 1000;
                count++;
            }else {
                break;
            }
            System.out.println(money + "可以走" + count + "路口");
        }


        // 例题2
            /* 判断一个整数，输入哪个范围；大于0，小于0，等于0;
               思路：
                  1. 创建Sanner对象，接收用户输入的数据
                  2. 定义变量 int n ，保存整数；
                  3. 使用if —— else if —— else  */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数 数字");
        int n = myScanner.nextInt();      // 这里总错！！！
        if(n > 0 ){
            System.out.println(n + "大于0");
        } else if( n < 0){
            System.out.println(n + "小于0");
        } else {
            System.out.println(n + "等于0");
        }


        // 例题3
            /* 判断一个输入的年份是否是闰年;
               思路：
                  1. 创建Scanner对象，接收用户输入的数据
                  2. 定义变量 long year 保存年份
                  3. 年份要能被4整除，但是不能被100整除。能被400 整除。  */
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("请输入一个年份（仅限4位数字）");
        long year = myScanner2.nextLong();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }


    }
}
