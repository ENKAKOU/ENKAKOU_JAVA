public class BiliJavaDay1 {
	
    //老师写的最简单的程序，完成1+1 体会
    public static void main(String[] args){
    int res = 1 + 1;
    //显示
    System.out.println("结果=" + res);

    //这里是java快速入门，演示java的开发步骤
        System.out.println("Hello World");

        // 对代码的相关说明
        // public class hello 表示 hello是一个类，是一个public公有的类
        // hello{} 表示一个类的开始和结束
        // public static void main(String[] args) 表示一个主方法（即：程序入口）
        // main（）{}表示方法的开始和结束
        // System.out.println("hello world"); 表示输出"hello world"到屏幕上
        // ; 表示语句结束

        // 转义符 演示使用
        // \t :一个制表位，实现对齐功能
        System.out.println("北京\t天津\t广州");
        // \n ：换行
        System.out.println("北京\n上海\n天津");
        // \\： 一个\
        System.out.println("北京\\上海\\天津");
        System.out.println("北京\\\\上海\\\\天津"); //输出 两个\
        // \“： 一个”
        System.out.println("\"老师说要好好学java\"");
        // \'： 一个'
        System.out.println("\'学好java去日本赚钱买房子\'");
        // \r： 一个回车
        System.out.println("韩顺平教育\r北京");

        //课堂练习
        System.out.println("书名\t  作者\t  价格\t  销量\n三国\t  罗贯中\t  120\t  1000");

        // java注释
        /* 多行注释 */            //** 文档注释 **//             //单行注释

        /*代码完成 两个数相加
        定义变量 */

        int n1 = 10;
        int n2 = 20;
        //求和
        int sum = n1 + n2;
        //输出结果
        System.out.println("结果是" + sum);


    }


}
