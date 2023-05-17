public class BiliJavaDay3 {
	
    public static void main(String[] args){
        //JAVA 程序中 + 号的使用

        // 当左右两边都是数值型，则做加法运算
        System.out.println(100 + 3);              // 103
        //当左右两边有一方为字符串，则做拼接运算
        System.out.println("100" + 98);           //10098  " "是字符串
        System.out.println(100 + 3 +"hello");     //103hello
        System.out.println("hello" + 100 + 3);    //hello1003

        //数据类型 - 整数类型
        byte n1 = 10;    //数值是10 ，1字节(占用）
        short n2 = 10;   //数值是10 ，2字节(占用）
        int n3 = 10;     //数值是10 ，4字节(占用）
        long n4 = 10;    //数值是10 ，8字节(占用）

        //java整形常量（具体值）默认为：int型。声明long型常量，须后加'l' 或 'L'
            int n5 = 1;    // int 4字节
        // int n1 = 1L   (报错 ； 1L 是long型 8字节，无法进int 4字节）
            long n6 = 1L;  // 正确

        //数据类型 - 浮点类型
        float num1 = 1.1F;   //正确
        double num2 = 1.1;   //正确
        double num3 = 1.1F;  //正确
        /*  举例： float num1 = 1.1; （运行错误）
                  默认浮点类型 double;   double 8字节，float 4字节；
                                       double转float 会损失数据 */

        //十进制数形式：如 5.12    512.0f   .512(必须有小数点）
        double num5 = .125; //等价 0.125
        System.out.println(num5);
        //科学计数法形式：如 5.12e2 [ 5.12*10的2次方 ]    5.12E-2[ ]
        System.out.println(5.12e2);  // 512.0
        System.out.println(5.12E-2); //0.0512

        //举例说明 double型 比 float型更精确
        double num9 = 2.1234567851;
        System.out.println(num9);   //2.1234567851
        float num10 = 2.1234567851F;
        System.out.println(num10);  //2.1234567

        //浮点数使用陷阱  2.7 和 8.1 / 3 比较
        double num11 = 2.7;
        double num12 = 8.1 /3;   //2.7
        System.out.println(num11);   // 2.7
        System.out.println(num12);   // 2.6999999999999997  接近2.7 小数，不是2.7
        //得到一个重要的使用点：当对运算结果是小数的进行相等判断，要小心
        //应当是以两个数的差值的绝对值，在某个精度范围类判断
        if ( num11 == num12);{
            System.out.println("相等");
        }
        //正确写法   ctrl+/ = 注释快捷键，再输入即取消
        if ( Math.abs(num11 - num12) < 0.000001){
            System.out.println("差值非常小，到我的规定精度，认为相等...");
        }
        // 可以通过java api
        System.out.println( Math.abs(num11 - num12));
        // 细节：如果是字何解查询得的小数或直接赋值，是可以判断相等

        //字符类型 char
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '韩';
        char c4 = 92; // 说明：字符类型可以直接存放一个数字
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);  //当输出c4，会输出92表示的字符

        char c5 = 'a';  //输出'a' 对应的数字
        System.out.println((int)c5);
        char c6 = '韩';
        System.out.println((int)c6);  //38889
        char c7 = 38889;
        System.out.println((int) c7);  //韩
        //char 类型是可以进行运算的，相当于一个整数，因为他都对应有Unicode码

        System.out.println('a' + 10);  //107

        //随堂测试
        char c8 = 'b' + 1;   //98+1 ==> 99
        System.out.println((int) c8);   //99
        System.out.println((c8));  //99 -> 对应的字符 ->编码表ASCII（规定好的）=> c



    }
}
