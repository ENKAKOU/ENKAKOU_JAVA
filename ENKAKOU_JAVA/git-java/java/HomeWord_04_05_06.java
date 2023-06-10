package java;

import javax.swing.text.Style;

import java.util.Scanner;

public class HomeWord_04_05_06 {
	
	
    public static void main(String[] args){
      
        int n = 153;
        int n1 = n / 100;
        int n2 = n % 100 / 10;
        int n3 = n % 10;
        if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n){
            System.out.println(n + "是水仙花数字");
        } else {
            System.out.println(n + "不是水仙花数");
        }

      
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个数字，用来判断");
        int a = myScanner.nextInt();
        int a1 = a / 100;
        int a2 = a % 100 / 10;
        int a3 = a % 10;
        if(a1 * a1 * a1 + a2 * a2 * a2 + a3 * a3 * a3 == a){
            System.out.println(a + "是水仙花数字");
        } else {
            System.out.println(a + "不是水仙花数");
        }

        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 5 != 0){
                System.out.println(i + " ");
                count++;
                if(count % 5 == 0){
                    System.out.println();  
                }
            }
        }

        for(char c1 = 'a'; c1 <= 'z'; c1++){
            System.out.println(c1 + " ");
        }
        for (char c1 = 'Z'; c1 >= 'A';c1--){
            System.out.println(c1 + " ");
        }

    }
}
