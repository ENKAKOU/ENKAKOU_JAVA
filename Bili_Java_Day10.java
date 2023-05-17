import java.util.Scanner;

public class Bili_Java_Day10 {
	
    //这是一个 main方法
    public static void main(String[] args){
        /*思路：
             1. 创建Scanner对象，接收用户输入
             2. 接收成绩保存到 double score
             3. 使用if-else判断，如果成绩大于8.0则进入决赛，否则提示被淘汰
             4. 如果进入决赛，再接收char gender，使用if-else输出信息  */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩");
        double score = myScanner.nextDouble();
        if(score > 8.0){
            System.out.println("请输入性别");
            char gender = myScanner.next().charAt(0);
            if(gender == '男'){
                System.out.println("进入男子组");
            }else if(gender == '女'){
                System.out.println("进入女子组");
            }else{
                System.out.println("性别输入错误，请重新输入");
            }
        }else {
            System.out.println("抱歉，你被淘汰了");
        }

        // switch 分支
        char c = 'a';
        switch (c){
            case 'a':
                System.out.println("ok 1");
                break;
            case 20:
                // case 'b':
                // case '2':
                // case 'a' + 1:   常量表达式
                System.out.println("ok 2");
                break;
            default:
                System.out.println("ok 3");
        }
        /* 编写一个程序，该程序可以接收一个字符，如：a,b,c,d,e,f,g
           a表示星期一，b表示星期二...
           根据用户的输入显示相应的信息，要求使用switch语句完成
           思路：
             1. 接收一个字符，创建Scanner对象
             2. 使用switch来完成匹配，并输出对应信息   */
        Scanner myScanner02 = new Scanner(System.in);
        System.out.println("请输入一个字符（a-g）");
        char c1 = myScanner02.next().charAt(0); // 把接收到的字符换，转成字符
        // java中，只要是有值返回，就是一个表达式
        switch (c1){
            case 'a':
                System.out.println("今天是星期一");
                break;
            case 'b':
                System.out.println("今天是星期二");
                break;
            case 'c':
                System.out.println("今天是星期三");
                break;
            case 'd':
                System.out.println("今天是星期四");
                break;
            case 'e':
                System.out.println("今天是星期五");
                break;
            case 'f':
                System.out.println("今天是星期六");
                break;
            case 'g':
                System.out.println("今天是星期日");
                break;
            default:
                System.out.println("你输入的字符不正确，请重新输入");
                break;
        }
        System.out.println("退出switch，继续执行程序");

        //switch 把小写类型的char型转为大写（键盘输入），只转换a,b,c,d,e,其他输入other。
        Scanner myScanner03 = new Scanner(System.in);
        System.out.println("输入一个需要转换成大写字母的小写字母（a-e）之间");
        char c2 = myScanner02.next().charAt(0);
        switch (c2){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("其他为other，请重新输入");
                break;
        }
        System.out.println("退出switch，继续执行程序");

        //如果成绩[60,100]，(int)(成绩/60)=1;  如果成绩[0,60),(int)(成绩/60)=0;
        double score02 = 88.5;
         //使用if-else，保证输入成绩有效 0-100
        if( score02 >=0 && score02 <= 100){
            switch ((int)(score02 / 60)){
                case 0:
                    System.out.println("成绩不合格");
                    break;
                case 1:
                    System.out.println("成绩合格");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }else {
            System.out.println("输入有错误，输入的成绩要在0-100之间");
        }

        //指定月份，打印该月份所属季节，3-5月春季，6-8月夏季，9-11月秋季，12-2月冬季（使用穿透法）
        /* 思路：
               1. 创建指定输入月份，Scanner对象，接收用户输入
               2. 使用int month 接收月份
               3. 使用switch来匹配，使用穿透来完成，比较简洁 */
        Scanner myScanner04 = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner04.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入的月份有误，请重新输入");
                break;
        }


    }
}
