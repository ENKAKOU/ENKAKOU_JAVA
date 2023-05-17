import java.util.Scanner;

public class Bili_Java_Day10 {
	

    public static void main(String[] args){

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
                System.out.println("你的性别有误，不能参加决赛~");
            }
        }else {
            System.out.println("sorry ,你被淘汰了~");
        }


        char c = 'a';
        switch (c){
            case 'a':
                System.out.println("ok 1");
                break;
            case 20:
                // case 'b':
                // case '2':
                // case 'a' + 1:
                System.out.println("ok 2");
                break;
            default:
                System.out.println("ok 3");
        }

        Scanner myScanner02 = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g)");
        char c1 = myScanner02.next().charAt(0);

        switch (c1){
            case 'a':
                System.out.println(("今天星期一,猴子穿新衣"));
                break;
            case 'b':
                System.out.println("今天星期二,猴子当小二");
                break;
            case 'c':
                System.out.println("今天星期三,猴子爬雪山..");
                break;
            case 'd':
                System.out.println("今天星期四,猴子吃桃子..");
                break;
            case 'e':
                System.out.println("今天星期五,猴子吃香蕉..");
                break;
            case 'f':
                System.out.println("今天星期六,猴子不吃饭..");
                break;
            case 'g':
                System.out.println("今天星期日,猴子要睡觉..");
                break;
            default:
                System.out.println("你输入的字符不正确，没有匹配的");
                break;
        }
        System.out.println("退出了 switch ,继续执行程序");


        Scanner myScanner03 = new Scanner(System.in);
        System.out.println("����һ����Ҫת���ɴ�д��ĸ��Сд��ĸ��a-e��֮��");
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
                System.out.println("你的输入有误~");
                break;
        }
        System.out.println("返switch，重新开始");


        double score02 = 88.5;

        if( score02 >=0 && score02 <= 100){
            switch ((int)(score02 / 60)){
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }else {
            System.out.println("输入的成绩在 0-100");
        }


        Scanner myScanner04 = new Scanner(System.in);
        System.out.println("输入月份");
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
            case 1:
            case 2:
            case 12:
                System.out.println("这是冬季");
                break;
            default :
                System.out.println("你输入的月份不对(1-12)");
        }
    }
}