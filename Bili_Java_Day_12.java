import java.util.Scanner;

public class Bili_Java_Day_12 {
    public static void main(String[] args){

        // 多重循环作业 2  九九乘法表
            // 使用外层for循环，用于控制打印行数
        for(int a = 1; a <=9; a++){
            // 使用内层for循环，用于控制打印列数
            for(int b = 1; b <= a; b++){
                System.out.println(b + "*" + a + "=" + a*b + "");
            }
            System.out.println( );
        }

        // 循环控制语句 - break
        for(int i = 0; i < 10; i++){
            if(i == 3){
                break;
            }
            System.out.println("i=" + i);
        }
        System.out.println("退出for循环");

        // 标签的基本使用
        lable1:
        for (int c = 0; c < 4; c++){  // 外层for
            lable2:
            for(int d = 0; d <= 10; d++){  // 内层for
                if( d == 2){
                    break lable1;  // 等价 break lable2
                }
                System.out.println("d=" + d);
            }
        }

        // 循环1-100，求和sum。 当sum > 20 时，记录下当前数，然后break
        // 在for循环外部，定义变量 n
        int sum = 0;   // 累计
        // 注意 n 的作用范围在for{}
        int n = 0;
        for(int e = 1; e <= 100; e++){
            sum += e;
            if( sum > 20){
                System.out.println("和 > 20时 当前数 e=" + e);
                n = e;
                break;
            }
        }
        System.out.println("当前数=" + n);

        /* 实现登录验证，有3次机会，如果用户名为“丁真”，密码“666”提示登录成功。
           否则提示还有几次机会，请使用for + break完成  */
            /*思路分析：
              1. 创建Scanner对象接收用户输入
              2. 定义String name; String passwd; 保存用户名和密码
              3. 最多循环3次【登录3次】，如果 满足条件就提前退出
              4. 定义一般变量 int chance 记录还有几次登录机会*/
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        for(int g = 1; g <= 3; g++){  //3 次登录机会
            System.out.println("请输入名字");
            name = myScanner.next();
            System.out.println("请输入密码");
            passwd = myScanner.next();
                //比较输入的名字和密码是否正确
                // 补充说明字符串 的内容 比较 使用的 方法 equals
            if("丁真".equals(name) && "666".equals(passwd)) {
                System.out.println("恭喜你，登录成功~");
                break;
            }
                //登录的机会就减少一次
            chance--;
            System.out.println("你还有" + chance + "次登录机会");
        }

        // 跳转控制语句-continue
        label1:
        for(int h = 0; h < 4; h++){
            label2:
            for(int k = 0; k < 10; k++){
                if(k == 2){
                //看看分别输出什么值，并分析
                //continue ;
                //continue label2;
                    continue label1;
                }
                System.out.println("k = " + k);
            }
        }

        // 跳转控制语句-return
        for(int v = 1; v <= 5; v++){
            if(v == 3){
                System.out.println("韩顺平教育" + v);
                return;
            }
            System.out.println("hello");
        }
        System.out.println("go on...");





    }
}
