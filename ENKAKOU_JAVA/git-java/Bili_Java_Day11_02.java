import java.util.Scanner;

public class Bili_Java_Day11_02 {
	

    public static void main(String[] args){

        int i = 1;
        while (i <= 10){
            System.out.println("���" + i);
            i++;
        }
        System.out.println("�˳�while������...");


        int n1 = 1;
        while (n1 <=100){
            if(n1 % 3 == 0) {
            System.out.println("n1=" + n1);
        }
            n1++;
        }


        int n2 = 1;
        int end = 100;
        int t = 3;
        while (n2 <= end){
            if (n2 % t == 0){
                System.out.println("n2=" + n2);
            }
            n2++;
        }


        int  j = 40;
        while (j <= 200){
            if(j % 2 == 0){
            System.out.println("j=" + j);
        }
            j++;
        }

        int  j2 = 40;
        int end2 = 200;
        int t2 = 2;
        while (j2 <= end2){
            if(j2 % t2 == 0){
                System.out.println("j2=" + j2);
            }
            j2++;
        }


        int l1 = 1;
        do{

            System.out.println("hello");

            l1++;
        }while (l1 <= 10);
        System.out.println("do whilִe");

        int l2 = 1;
        int count5 = 0;
        do{
            if(l2 % 5 == 0 && l2 % 3 != 0){
            System.out.println("l2=" + l2);
            count5++;
        }
            l2++;
        }while (l2 <= 200);
        System.out.println("count5=" + count5);


        Scanner myScanner2 = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.println("���޽�ʹ���׵���");
            System.out.println("��ɪ�����޽��㵽�׻�����Ǯ��y/n");
            answer = myScanner2.next().charAt(0);
            System.out.println("���Ļش�" + answer);
        }while (answer != 'y');
        System.out.println("���޽����ڻ�Ǯ��");

    }
}
