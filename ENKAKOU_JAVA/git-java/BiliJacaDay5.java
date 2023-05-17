public class BiliJacaDay5 {
	
    public static void main(String[] args){

        int n1 = 100;
        float n2 = 1.1f;
        double n3 = 3.4;
        boolean b1 = true;
        String str1 = n1 + "";
        String str2 = n2 + "";
        String str3 = n3 + "";
        String str4 = b1 + "";
        System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " ");


        String s5 = "123";

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

        System.out.println(s5.charAt(0));


        String book1 = "天龙八部";
        String book2 = "古剑奇谭";
        System.out.println("天龙八部" + "古剑奇谭");


        char c1 = '0';
        char c2 = '0';
        System.out.println(c1 + c2);

        double pricel1 = 13.56;
        double pricel2 = 12.5;
        System.out.println(pricel1 + pricel2);


        String name = "jack";
        int age = 20;
        double score = 80.9;
        char gender = '3';
        String hobby = "小白";
        System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n" + name + "\t" +
                age + "\t" + score + "\t" + gender + "\t" + hobby);



        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        double d = 10 / 4;
        System.out.println(d);


        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);

        int i = 10;
        i++;
        System.out.println("i=" + i);  // 11

        System.out.println("i=" + i);  // 12

        int ii = 1;
        ii = ii++;
        System.out.println(ii);   // 1


        int oo = 1;
        oo = ++oo;
        System.out.println(oo);    //2


        int i1 = 10;
        int i2 = 20;
        int m = i1++;
        System.out.println("m=" + i1);
        System.out.println("i2=" + i2);


        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "��  ��" + weeks + "����  ��" + leftDays + "��" );

        double huaShi = 234.6;
        double sheShi = 5.0 / 9 *(huaShi - 100);
        System.out.println("�����¶�" + huaShi + "��Ӧ�������¶� =" + sheShi);


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
