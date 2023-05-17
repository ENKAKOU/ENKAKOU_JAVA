import java.util.Scanner;

public class BiliJavaDay9 {
	
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        if(age > 18){
            System.out.println("你的年龄大于 18，要对自己的行为负责，否则送入监狱");
        }
        System.out.println("程序继续....");

        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age2 = myScanner2.nextInt();
        if(age2 > 18){
            System.out.println("你的年龄大于 18，要对自己的行为负责，否则送入监狱");
        } else{ //双分支
            System.out.println("你的年龄不大这次就放过你");
        }
        System.out.println("程序继续....");

        double d1 =30.5;
        double d2 = 2.6;
        if(d1 > 10.0 && d2 < 20.0){
            System.out.println("两个数和=" + (d1 + d2));
        }

        double d3 =3.5;
        double d4 = 2.6;
        if(d3 > 10.0 && d4 < 20.0){
            System.out.println("两个数和=" + (d3 + d4));
        } else {
            System.out.println("无法执行");
        }

        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        if(sum % 3 == 0 && sum % 5 == 0){
            System.out.println("和 可以被3又5整除");
        } else {
            System.out.println("和 不能被3又5整除");
        }

        int year = 2023;
        if((year % 4 == 0 && year % 100!= 0) || year % 400 == 0 ){
            System.out.println(year + "是闰年");
        }


        Scanner myScanner3 = new Scanner(System.in);
        //先对输入的信用分，进行一个范围的有效判断 1-100 ，否则提示输入错误
        System.out.println("请输入信用分(1-100)"); //接收用户信息
        int grade = myScanner3.nextInt();
        if(grade >= 1 && grade <= 100){
            // 因为有4种情况，这里使用多分支
        if(grade == 100){
            System.out.println("信用极好");
        } else if(grade > 80 && grade <= 99){   //信用分为(80，90]时，输出 信用优秀
            System.out.println("信用优秀");
        } else if(grade > 60 && grade <= 80){
            System.out.println("信用一般");
        } else {  //其他情况，输出 信用不及格
            System.out.println("信用不及格");
        }
        } else {
            System.out.println("信用分需要在1-100，请重新输入：");
        }

        boolean b = true;
        if(b = false){   // 一个 = 是赋值
            System.out.println("a");
        } else if(b){
            System.out.println("b");
        } else if(!b){  //取反，F 变 T
            System.out.println("c");
        } else {
            System.out.println("d");
        }

        boolean b2 = true;
        if(b2 == false){   // 两个 == 是等于
            System.out.println("a2");
        } else if(b2){
            System.out.println("b2");
        } else if(!b2){  //取反，F 变 T
            System.out.println("c2");
        } else {
            System.out.println("d2");
        }


    }
}
