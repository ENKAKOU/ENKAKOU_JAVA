import java.util.Scanner;

public class HomeWork_01_02_03 {
	
    public static void main(String[] args){
      
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


        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数 数字");
        int n = myScanner.nextInt();    
        if(n > 0 ){
            System.out.println(n + "大于0");
        } else if( n < 0){
            System.out.println(n + "小于0");
        } else {
            System.out.println(n + "等于0");
        }


      
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
