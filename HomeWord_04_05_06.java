import javax.swing.text.Style;

import java.util.Scanner;

public class HomeWord_04_05_06 {
	
	
    public static void main(String[] args){
        // 例题4
            /* 判断一个整数是否是 水仙花数（指1个3位数），其各个位上数字立方和等于其本身。
               如；153 = 1*1*1 + 2*2*2 + 5*5*5

               思路1：
                   1. 定义一个变量 int n 保存数据
                   2. 先得到n 的 各个位上的数，再用if — else判断
                      n1 (n 百位) = n / 100
                      n2 (n 十位) = n % 100 / n
                      n1 (n 个位) = n % 10      */
        int n = 153;
        int n1 = n / 100;
        int n2 = n % 100 / 10;
        int n3 = n % 10;
        if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n){
            System.out.println(n + "是水仙花数字");
        } else {
            System.out.println(n + "不是水仙花数");
        }

            /* 思路2：
                   1. 创建 Scanner 对象，接收用户输入的数据
                   2. 定义变量 int a ; 保存数据
                   3. 先得到n 的 各个位上的数，再用if — else判断
                      a1(a 百位) = a / 100
                      a2(a 十位) = a % 100 / n
                      a1(a 个位) = a % 10    */
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


        // 例题5
             /* 输出1-100之间，不能被5整除的数，每5个一行
                思路：
                   1. 输出1-100的所有数
                   2. 过滤输出，不能被5整除
                   3. 每5个一行，用int count 统计输出个数，当 count % 5 = 0,就输出一个换行控制
              */
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 5 != 0){
                System.out.println(i + " ");
                count++;
                if(count % 5 == 0){
                    System.out.println();  //容易输出错误
                }
            }
        }


        // 例题6
            /* 输出小写的 a——z，以及大写 Z——A，
               'b'='a'+1  'c'= 'a'+2  */
        for(char c1 = 'a'; c1 <= 'z'; c1++){
            System.out.println(c1 + " ");
        }
        for (char c1 = 'Z'; c1 >= 'A';c1--){
            System.out.println(c1 + " ");
        }

    }
}
