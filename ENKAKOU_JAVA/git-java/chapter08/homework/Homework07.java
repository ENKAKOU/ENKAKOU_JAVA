package chapter08.homework;

public class Homework07 {

    public static void main(String[] args) {

    }
}


class Test{ //父类
    String name = "Rose";
    Test(){
        System.out.println("Test");//(1)
    }
    Test(String name){//name john
        this.name = name;
    }
}


class Demo extends Test{
    String name="Jack";
    Demo()	{
        super();
        System.out.println("Demo");//(2)
    }
    Demo(String s){
        super(s);
    }

    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args)	{

        new Demo().test(); //匿名对象
        new Demo("john").test();//匿名

    }
}
