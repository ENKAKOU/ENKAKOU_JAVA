package neuedu.javase;

public class Operator9While {

    public static void main(String[] args) {
//        while (表达式为真){
//          循环体
//        }
        int  max = 20;
        int  firstmax = 10;
        int step = 1;
        while(step <=firstmax){
            System.out.println("走路: 第"+step+"步");
            step++;
        };

        do{
            System.out.println("第二次走路: 第"+step+"步");
            step++;
        } while(step <=max);


        java.util.Random random = new  java.util.Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("随机的整数"+random.nextInt());

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("随机10以内的整数"+random.nextInt(10));
        }

    }
}

