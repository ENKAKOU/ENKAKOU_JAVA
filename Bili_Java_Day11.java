public class Bili_Java_Day11 {
	
    //这里是一个main方法
    public static void main(String[] args){
        //for循环
        for (int i = 1; i <= 3; i++){
            System.out.println("你好，java" + i);
        }

        //for(;循环判断条件;)
        int i = 1;      //循环变量初始化
        for (; i <= 5 ;){       //循环条件
            System.out.println("你好" + i);
            i++;
        }
        System.out.println("i= " + i);

        //内存分析法
        int count = 3;
        for(int j = 0,g = 0; j < count; j++,g += 2){
            System.out.println("j=" +j+"g=" + g);
      }
        //for循环  题1
            /* 打印1-100之间所有是9 的倍数的整数，统计个数和总和（技巧：化繁为简，先死后活）
               化繁为简：将复杂的需求，拆解成简单的需求，逐步完成
               先死后活：先考虑固定的值，再转成可以灵活变化的值
               化繁为简 思路：
                  1. 完成输出1-100的值
                  2. 输出过程中进行过滤，只输出9的倍数。 i % 9 == 0
                  3. 统计个数，定义一个变量 int count = 0; 当条件满足时 count++;
                  4. 求总和，定义一个变量 int = sum = 0; 当条件满足时 sum += b */
        int count2 = 0;    //统计9的倍数个数 变量
        int sum = 0;      //总和
        for(int b = 1; b <= 100; b++){
            if( b % 9 == 0){
                System.out.println("b = " + b);
                count2++;
                sum += b;   //累计
            }
        }
        System.out.println("count2 = " + count2);
        System.out.println("sum = " + sum);

            /* 先死后活 思路：
                  1. 为了适应更好的需求，把范围的开始的值，和结束的值，做出变量
                  2. 还可以  倍数也做成变量，int t = 9  */
        int count3 = 0;    //统计9的倍数个数 变量
        int sum2 = 0;      //总和
        int start = 1;
        int end = 100;
        int t = 9;        //倍数
        for(int b2 = start; b2 <= end; b2++){
            if( b2 % t == 0){
            System.out.println("b2 = " + b2);
            count3++;
            sum2 += b2;   //累计
            }
        }
        System.out.println("count3 = " + count3);
        System.out.println("sum2 = " + sum2);

        //for循环  题2
            /* 化繁为简 思路：
                1. 先输出 0-5;
                2. 后面的+是 5-e  */
        for(int e = 0; e <= 5;e++){
            System.out.println(e + "+" + (5-e) + "=5");
        }
            /* 先死后活 思路：
                1. 5 替换成 变量 n  */
        int n = 10;
        for(int e2 = 0; e2 <= n;e2++){
            System.out.println(e2 + "+" + (n-e2) + "=" + n);
        }
        
    }
}
