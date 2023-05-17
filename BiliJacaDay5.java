public class BiliJacaDay5 {
	
    public static void main(String[] args){
        // 基本数据类型 和 String类型的转换
        /* 基本数据类型 转 String类型
                 语法：基本数据类型值 + ""   */
        int n1 = 100;
        float n2 = 1.1f;
        double n3 = 3.4;
        boolean b1 = true;
        String str1 = n1 + "";
        String str2 = n2 + "";
        String str3 = n3 + "";
        String str4 = b1 + "";
        System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " ");

         /* String类型 转 基本数据类型
                 语法：通过基本类型的包装类调用 parseXX方法   */
        String s5 = "123";
        //解读 使用 基本数据类型对应的包装类 的对应方法，得到基本数据类型
        int num1 = Integer.parseInt(s5);
        double num3 = Double.parseDouble(s5);
        float num2 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");

       System.out.println(num1);   //123
       System.out.println(num2);   //123.0
       System.out.println(num3);   //123.0
       System.out.println(num4);   //123
       System.out.println(num5);   //123
       System.out.println(b);      //true
        //字符串 转成字符char -> 含义：把字符串的第一个字符得到
        //解读 (s5.charAt(0)) 得到 s5字符串的第一个字符 1 （非数字1）
        System.out.println(s5.charAt(0));

        // 章节作业
           // 1. 保存两本书名，用+拼接
        String book1 = "天龙八部";
        String book2 = "古剑奇谭";
        System.out.println("天龙八部" + "古剑奇谭");

           // 2. 保存两个性别
        char c1 = '男';
        char c2 = '女';
        System.out.println(c1 + c2);  //char字符 得到一个整数。结果得到‘男’字符码值+‘女’字符码值

           // 3. 保存两本书价格
                 //这里考虑用float ，精度保留2位小数，够用。 double精度高
        double pricel1 = 13.56;
        double pricel2 = 12.5;
        System.out.println(pricel1 + pricel2);   //由于精度过高，小数位过多。 这里推荐float类。

           /* 4. 用变量将姓名，年龄，成绩，性别，爱好存储
                 使用 +
                 适当注释
                 添加转义符，使用一条语句输出  */
        String name = "jack";     //姓名 ，用字符串 String
        int age = 20;             //年龄 ，（byte也可以，int更保险）
        double score = 80.9;      //成绩
        char gender = '男';       //性别
        String hobby = "打篮球";   //爱好 ，最好用String字符串
        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name + "\t" +
                age + "\t" + score + "\t" + gender + "\t" + hobby);   // 出现的问题：制表位无法对齐


        // java - 算术运算符
           // 演示  /除法使用
        System.out.println(10 / 4);    //从数学来看是2.5，java中 2
        System.out.println(10.0 / 4);   // java中 2.5
        double d = 10 / 4;             //2.0
        System.out.println(d);

           // 演示  % 取余（取模）
               // 在java中，%的本质，看一个公式 a % b = a - a/b * b
              // A % B : A 是正数，% 就是正； A 是负数，% 就是负
        System.out.println(10 % 3);     // 1
        System.out.println(-10 % 3);    // -1  (-10 % 3 => -10 -(-10) / 3 * 3 = -10 +9 = 1
        System.out.println(10 % -3);    // 1
        System.out.println(-10 % -3);   // -1

           // 演示  ++ 使用
               //自增 ++ 做独立语句使用 前++，后++ 都等价于 i=i+1;
        int i = 10;
        i++;                   // 自增，等价于 i=i+1 =>  i=11
        System.out.println("i=" + i);  // 11
                                // 由于上一条语句执行后，此时 i= 11;
        ++i;                   // 自增，等价于 i=i+1 =>  i=12
        System.out.println("i=" + i);  // 12
              // 面试题 1
        int ii = 1;
        ii = ii++;    //规则使用临时变量：① temp = ii     ② ii = ii + 1      ③ ii = temp
        System.out.println(ii);   // 1

              // 面试题 2
        int oo = 1;
        oo = ++oo;  //规则使用临时变量：① oo = oo + 1     ② temp = oo       ③ oo = temp
        System.out.println(oo);    //2

             // 面试题 3
        int i1 = 10;
        int i2 = 20;
        int m = i1++;
        System.out.println("m=" + i1);
        System.out.println("i2=" + i2);

           //面试题 4
        // 需求：假如还有59天放假，问：合xx个星期 零xx天
        /* 思路：1.使用int变量 - days 保存天数
                2.一周7天， 星期数（weeks）：days/7 ; 零xx天（leftDays）：days % 7; */
        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "天  合" + weeks + "星期  零" + leftDays + "天" );

           //面试题 5
         /* 需求；定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式：5 / 9*(华氏温度 - 100)，
                 请求出华氏温度对应的摄氏温度 （234.6） */
         /* 思路：1.定义一个变量 double  huaShi 变量保存 华氏温度
                              （因为数据可能是小数，也可能是整数，这里推荐用double）
                 2.根据给出的公式，进行计算，即 5 / 9*(华氏温度 - 100)
                 3.将得到的结果，保存到一个变量 ————> double huaShi*/
        double huaShi = 234.6;
        double sheShi = 5.0 / 9 *(huaShi - 100); // 5.0 会保留高精度。  5/9得到0.5555小数，javah直接返回0
        System.out.println("华氏温度" + huaShi + "对应的摄氏温度 =" + sheShi);

        // 关系运算符
//        int a = 9;
//        int b = 8;
//        System.out.println(a>b);
//        System.out.println(a>=b);
//        System.out.println(a<=b);
//        System.out.println(a<b);
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        boolean flag = a>b;
//        System.out.println("flag=" + flag);


    }
}
