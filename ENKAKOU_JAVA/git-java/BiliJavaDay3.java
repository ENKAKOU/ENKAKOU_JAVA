public class BiliJavaDay3 {
	
    public static void main(String[] args){

        System.out.println(100 + 3);
        System.out.println("100" + 98);
        System.out.println(100 + 3 +"hello");
        System.out.println("hello" + 100 + 3);

        byte n1 = 10;
        short n2 = 10;
        int n3 = 10;
        long n4 = 10;

            int n5 = 1;
        // int n1 = 1L
            long n6 = 1L;

        float num1 = 1.1F;
        double num2 = 1.1;
        double num3 = 1.1F;

        double num5 = .125;
        System.out.println(num5);

        System.out.println(5.12e2);
        System.out.println(5.12E-2);

        double num9 = 2.1234567851;
        System.out.println(num9);
        float num10 = 2.1234567851F;
        System.out.println(num10);


        double num11 = 2.7;
        double num12 = 8.1 /3;
        System.out.println(num11);
        System.out.println(num12);
        if ( num11 == num12);{
            System.out.println("num值");
        }

        if ( Math.abs(num11 - num12) < 0.000001){
            System.out.println("最终取值");
        }

        System.out.println( Math.abs(num11 - num12));

        char c1 = 'a';
        char c2 = '\t';
        char c3 = 'B';
        char c4 = 92;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        char c5 = 'a';
        System.out.println((int)c5);
        char c6 = 'B';
        System.out.println((int)c6);  //38889
        char c7 = 38889;
        System.out.println((int) c7);


        System.out.println('a' + 10);  //107


        char c8 = 'b' + 1;   //98+1 ==> 99
        System.out.println((int) c8);   //99
        System.out.println((c8));  //99



    }
}
