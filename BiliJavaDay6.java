public class BiliJavaDay6 {
	
    public static void main(String[] args){
       // && 和 & 基本规则 和使用
        int age = 50;
        if(age > 20 && age < 90){
            System.out.println("ok 100");         // ok 100
        }
        int age2 = 50;
        if(age2 > 20 & age2 < 90){
            System.out.println("ok 100");         // ok 100
        }

        // && 和 & 使用区别
        int a = 4;
        int b = 9;
        if(a < 1 && ++b < 50 ){
            System.out.println("ok 300");
        }
       System.out.println("a=" + a + "b=" + b);

        int a2 = 4;
        int b2 = 9;
        if(a2 < 1 & ++b2 < 50 ){
            System.out.println("ok 300");
        }
        System.out.println("a2=" + a2 + "b2=" + b2);

        // || 和 | 基本规则和使用
        int age3 = 50;
        if(age3 > 20 || age3 < 90){
            System.out.println("ok 100");         // ok 100
        }
        int age4 = 50;
        if(age4 > 20 | age4 < 90){
            System.out.println("ok 100");         // ok 100
        }

        // || 和 | 使用区别
        int a3 = 4;
        int b3 = 9;
        if(a3 > 1 || ++b3 > 4 ){     // || 第一个条件为真，第二个条件 不判定
            System.out.println("ok 300");   // ok 300
        }
        System.out.println("a3=" + a3 + "b3=" + b3);   // a=4   b = 9

        int a4 = 4;
        int b4 = 9;
        if(a4 < 1 || ++b4 > 4 ){     // || 第一个条件为假，第二个条件 判定
            System.out.println("ok 400");   // ok 400
        }
        System.out.println("a4=" + a4 + "b4=" + b4);   // a=4   b = 10

        int a5 = 4;
        int b5 = 9;
        if(a5 > 1 | ++b5 > 4 ){     // | 第一个条件是否为真，第二个条件 都判定
            System.out.println("ok 500");   // ok 500
        }
        System.out.println("a5=" + a5 + "b5=" + b5);   // a=4   b = 10

        // ！取反 基本规则
        System.out.println(60 > 20);           // true
        System.out.println(!(60 > 20));        // false
               // ! 非操作：取反   真 变 假， 假 变 真

        //  逻辑异或
        boolean b11 = (10 > 3)^(3 < 5);
        System.out.println("b11= " + b11);

        // 逻辑关系运算 - 练习题
           // 练习题 1
        int x = 5;
        int y = 5;
        if(x++==6 & ++y==6){
            x = 11;
        }
        System.out.println("x=" + x + "y=" + y);    //x = 6 , y = 6

           // 练习题 2
        int x1 = 5 , y1 = 5;
        if(x1++==6 && ++y1==6){
            x1 = 11;
        }
        System.out.println("x1=" + x1 + ",y1=" + y1);    //x = 6 , y = 5

           // 练习题 3
        int x2 = 5, y2 = 5;
        if(x2++==5 | ++y2==5){
            x2 = 11;
        }
        System.out.println("x2=" + x2 + ",y2=" + y2);    //x = 11 , y = 6

           // 练习题 4
        int x3 = 5, y3 = 5;
        if(x3++==5 || ++y3==5){
            x3 = 11;
        }
        System.out.println("x3=" + x3 + ",y3=" + y3);   //x = 11 , y = 5

           // 练习题 5
        boolean x5 = true;
        boolean y5 = false;
        short z = 46;
        if((z++==46) && (y5=true)) z++;
        if((x5=false) || (++z==49)) z++;
        System.out.println("z =" + z);    // z = 50

        // 赋值运算符
        int n11 = 10;
        n11 += 4;     // n11 = n11 + 4
        System.out.println(n11);          //14
        n11 /= 3;     // n11 = n11 / 3
        System.out.println(n11);          //4

        

    }
}
