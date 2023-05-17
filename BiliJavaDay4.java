public class BiliJavaDay4 {
	
    //编译一个main方法
    public static void main(String[] args){
        //定义一个布尔类型
        //判断成绩是否通过的案例
        boolean isPass = true;

        if(isPass == true){
            System.out.println("通过");
        }else {
            System.out.println("不通过");
        }

        /////////////////////////////////////////////////////////////////////////

        // 演示自动转换
        int num = 'a';   // 正确  char -> int
        double d1 = 80;  // 正确   int -> double
        System.out.println(num);  // 97
        System.out.println(d1);  // 80.0

        //自动类型转换 - 注意和细节
           //当多种类型的数据混合运算时，
           //系统首先自动将所有数据转换成容量大的那种数据类型，然后再进行计算
        int n1 = 10;  //正确   int类型
        /* float d2 = n1 + 1.1;   // 结果：错误
                 n1 + 1.1 => 结果类型是 double */
        double d2 = n1 + 1.1;   // 解决办法 2 ：float d2 = n1 + 1.1F;

        //byte,short 和 char 不会自动类型转换
        byte v1 = 10;    // byte 值：-128 ~ 127
           // 当把具体数赋给byte时，先判断该数是否在byte范围内，如果是，就可以
           //int m1 = 1;     //m1 是int （4字节）
        /*   byte v2 = m1;   错误，如果是变量赋值，判断类型
                                 (从int转换到byte可能会有损失) */

        // byte,short,char 三者可以计算，在计算时首先转为int类型
        byte x1 = 1;
        byte x2 = 2;
        short s4 = 1;
        //short s2 = x1 + x2 => int
         /*    byte x4 = x1 + x2;       错，只要有byte,short,char
                                            三者可以计算，在计算时首先转为int类型*/

        /////////////////////////////////////////////////////////////////////////

        // boolean 不参与转换
        boolean pass = true;
        // int num100 = pass     错误， boolean不参与类型的自动转换

        // 自动提升 - 表达式结果的类型自动提升为：操作数中最大的类型
        byte b44 = 1;
        short s33 = 100;
        int num200 = 1;
        double num300 = 1.1;
        double num500 = b44 + s33 + num200 + num300;

        /////////////////////////////////////////////////////////////////////////

        //强制类型转换
        int n111 =(int) 1.9;
        System.out.println("n111=" + n111);

        int n222 = 2000;
        byte b111 = (byte) n222;
        System.out.println("b111=" + b111);

        //强制类型转换 —————— 细节
          //强壮符号只针对最近的操作数，往往会使用小括号（）提升优先级
                    //  int x = (int) 10*3.5+6*1.5;   错误，double -》int
        int x = (int)(10*3.5+6*1.5);   //(int) 44.0 -> 44
        System.out.println(x);  //44

          //char类型，可以保存int的常量值，不能保存int的变量值，需要强制转换
        char c1 = 100;
        int m = 100;
            //char c2 = mmm;    错误,  从int转换到char可能会有损失
        char c3 = (char)m;
        System.out.println(c3);

        //数据类型转换 —————— 练习题
        /*   short s = 12;      正确
             s = s-9;           错误，  int -> short

             byte b = 10;       正确
             b = b + 11;        错误，  int -> byte
             b = (byte)(b+11);  正确，  使用（）强制转换

             char c = 'a';      正确
             int i = 16;        正确
             float d = .314F;   正确
             double result = c + i + d;   正确，float -> double

             byte b = 16;       正确
             short s = 14;      正确
             short t = s + b;   错误，  int -> short      */





    }
}
