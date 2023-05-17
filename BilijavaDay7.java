import java.util.Scanner;

public class BilijavaDay7 {
    public static void main(String[] args){
        // 三元运算符
        int a = 10;
        int b = 99;
            //a>b为false;   返回b--，先返回b值，然后b-1 ;
        int result = a > b ? a++ :b--;     // 返回结果：99
        System.out.println("resule = " + result);

        int a2 = 10;
        int b2 = 99;
        int result2 = a < b ? a++ :b--;
        System.out.println("resule2 = " + result2);  //10
        System.out.println("a2 = " + a2);   //11
        System.out.println("b2 = " + b2);   //99

        //三元运算符 —— 使用细节
            //1. 表达式1 和 表达式2 ，要为可以赋给接收变量的类型（或 可以自动转换）
        int a3 = 3;
        int b3 = 8;
        int c = a3 > b3 ? a3 : b3;     //可以

        int a4 = 3;
        int b4 = 8;
        int c2 = a4 > b3 ?(int)1.1 :(int)3.4;   //可以

        int a5 = 3;
        int b5 = 8;
        double d = a > b? a : b + 3;    //可以，满足自动转换 int -> double

            //2. 三元运算符可以转成 if - else 语句
        int res = a > b ? a++ : --b;
        if (a > b)res = a++;
        else res = --b;

        //三元运算符 —— 练习题
            //问；实现三个数的最大值
        int n1 = 55;
        int n2 = 33;
        int n3 = 123;
            /* 思路：  1. 先得到n1 和 n2 中最大的数，保存到 max1 ;
                      2. 然后再求出 max1 和 n3 中最大的数，保存到max2 ; */
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("最大数 = " + max2);
            /* 使用一条语句   （推荐分步， 更清晰直观）
               后面可以使用更好的方法，如：排序

            int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2? n1 : n2) : n3;
            System.out.println("最大数 = " + max) ;      */

        //标识符规则
            //JAVA中 严格区分大小写，长度无限制;
        int totalNum = 10 ;
        int nn = 20;
        int N = 10;
        System.out.println("nn=" + nn);   //20
        System.out.println("N=" + N);     //10
            // abc 和 aBc 是两个不同的变量
        int abc = 1;
        int aBc = 2;
            // 标识符不能包含空格。  如： int a b = 25 ;  （报错）

        //标识符规范
            //变量名，方法名： 驼峰法（小驼峰法） 如： xxxYyyZzz
            //类名，接口名： 大驼峰法  如：XxxYyyZzz

        //java 键盘输入语句

          //inpunt java.util.scanner  (表示把java.util下的 Scanner类导入）
          //Scanner类 表示 简单文本扫描器，在java.util包
            //步骤1: 引入/导入该类（Scanner类）的所在包  java.util
            //步骤2: 创建该类（Scanner类）对象（声明变量)     new 创建一个
        Scanner myScanner = new Scanner(System.in);
            //步骤3：调用里面的功能 （接收用户的输入），使用相关的方法
        System.out.println("请输入姓名：");
                  //当程序执行到 next方法是时，会等待用户输入。
        String name = myScanner.next();   // 接收用户输入“字符串”
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();    // 接收用户输入int
        System.out.println("请输入成绩：");
        double score = myScanner.nextDouble();   // 接收用户输入 double
        System.out.println("信息如下：");
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("score=" + score);


        //进制
           /* 对于整数，有4种表示方式：
             1.二进制 ：0，1  满2进1，以0b或0B开头。
             2.十进制 ：0-9， 满10进1。
             3.八进制 ：0-7， 满8进1，以数字0开头表示
             4.十六进制 ： 0-9 及A（10）-F（15），满16进1，以 0x 或 0X 开头表示。（此处 A-F不区分大小写） */
        int d1 = 0b1010;   //二进制
        int d2 = 1010;     //十进制
        int d3 = 01010;    //八进制
        int d4 = 0x10101;  //十六进制

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);


    }
}
