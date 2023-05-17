import java.util.Scanner;

public class Bili_Java_Day_13 {
    public static void main(String[] args){

        //数组使用1
            /* 例题 1：
                     循环输入5个成绩，保存到double数组，并输出
               思路：1. 创建一个 double数组，大小5
                    2. 循环输入
                    3. scores.length 表示数组的长度/大小
                    4. 创建Scanner对象，接收用户输入   */
        double [ ] scores = new double [5];
        Scanner myScanner = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){
            System.out.println("请输出第" + (i+1) + "个元素的值");
            scores[i] = myScanner.nextDouble();
        }
        //输出，遍历数组
        for(int i = 0; i < scores.length; i++){
            System.out.println("请输出第" + (i+1) + "个元素的值" + scores[i]);
        }

        /* 创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。
           使用 for 循环访问所有元素并打印出来。
           提示：char 类型数据运算 'A'+2 -> 'C' */

        char[] chars = new char[26];
        for(int i = 0; i < chars.length;i++){
            chars[i] = (char)('A' + i);
        }
        for(int i = 0; i < chars.length;i++){
            System.out.print(chars[i] + " ");
        }

        System.out.println( );

        // 请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
        int[] arr = {4,-1,9,10,23};
        int max = arr[0];                        //假定第一个元素就是最大值
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++) {  //从下标 1 开始遍历 arr
            if(max < arr[i]) {                //如果 max < 当前元素
                max = arr[i];                //把 max 设置成 当前元素
                maxIndex = i;
            }
        }
        //当我们遍历这个数组 arr 后 , max 就是真正的最大值，maxIndex 最大值下标
        System.out.println("max=" + max + " maxIndex=" + maxIndex);

    }
}
