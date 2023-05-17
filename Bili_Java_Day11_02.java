import java.util.Scanner;

public class Bili_Java_Day11_02 {
	
    // 这是一个main方法
    public static void main(String[] args){
        // while 循环
        int i = 1;
        while (i <= 10){
            System.out.println("你好" + i);
            i++;
        }
        System.out.println("退出while，继续...");

        //作业 1 ：打印1-100之间所有能被3整除的数（使用while)
            // 1. 化繁为简
        int n1 = 1;
        while (n1 <=100){
            if(n1 % 3 == 0) {
            System.out.println("n1=" + n1);
        }
            n1++;  //变量自增
        }

            // 2. 先死后活
        int n2 = 1;
        int end = 100;
        int t = 3;
        while (n2 <= end){
            if (n2 % t == 0){
                System.out.println("n2=" + n2);
            }
            n2++;
        }

        //作业2 ：打印40-200之间所有的偶数（使用while）
            // 1. 化繁为简
        int  j = 40;   //变量初始化
        while (j <= 200){
            if(j % 2 == 0){
            System.out.println("j=" + j);
        }
            j++;    //循环变量迭代
        }
            // 2. 先死后活
        int  j2 = 40;   //变量初始化
        int end2 = 200;
        int t2 = 2;
        while (j2 <= end2){
            if(j2 % t2 == 0){
                System.out.println("j2=" + j2);
            }
            j2++;    //循环变量迭代
        }

        // do...while 循环
        int l1 = 1;
        do{
            // 循环执行语句
            System.out.println("hello");
            // 循环变量迭代
            l1++;
        }while (l1 <= 10);  // 循环条件
        System.out.println("退出do while执行");

            //案例题1：统计1-200之间能被5整除，但不能被3整除的个数
            /* 思路分析（化繁为简）：
               1. 使用do while输出1-200
               2. 过滤能被5整除，但不能被3整除的数 %
               3. 统计满足条件的个数  int count = 0 */
        int l2 = 1;
        int count5 = 0;
        do{
            if(l2 % 5 == 0 && l2 % 3 != 0){
            System.out.println("l2=" + l2);
            count5++;
        }
            l2++;
        }while (l2 <= 200);
        System.out.println("count5=" + count5);

            //案例题2：
        Scanner myScanner2 = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.println("雷无杰使出雷弹子");
            System.out.println("萧瑟：雷无杰你到底还不还钱？y/n");
            answer = myScanner2.next().charAt(0);
            System.out.println("他的回答" + answer);
        }while (answer != 'y');
        System.out.println("雷无杰终于还钱了");

    }
}
