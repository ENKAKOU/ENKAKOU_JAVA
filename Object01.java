
public class Object01 {

	public static void main(String[] args) {
		
		 /*
	      张老太养了两只猫猫:一只名字叫小白,今年 3 岁,白色。
	      还有一只叫小花,今年 100 岁,花色。请编写一个程序，当用户输入小猫的名字时，
	      就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，
	      则显示 张老太没有这只猫  */

	    /*  单独变量 --- 不利于数据管理

	        String cat1Name = "小白";   //第一只猫
	        int cat1Age = 3;
	        String cat1Color = "白色";

	        String cat2Name = "小花";   //第二只猫
	        int cat2Age = 100;
	        String cat2Color = "花色";  */

	     /* 数组 --- 数据类型，体现不出来: (1) 数据类型体现不出来
	                                  (2) 只能通过[下标]获取信息，造成变量名字和内容的对应关系不明确
	                                  (3) 不能体现猫的行为

	        String[] cat1 = {"小白", "3", "白色"};    //第一只猫
	        String[] cat2 = {"小花", "100", "花色"};  //第二只猫    */


	     /* 使用 OOP 面向对象解决
	        new Cat() 创建一只猫(猫对象)
	        Cat cat1 = new Cat(); 把创建的猫赋给 cat1
	        cat1 就是一个对象    cat2 也是一个对象      */

	        Cat cat1 = new Cat();
	        cat1.name = "小白";
	        cat1.age = 3;
	        cat1.color = "白色";


	        Cat cat2 = new Cat();     //创建了第二只猫，并赋给 cat2
	        cat2.name = "小花";       //cat2 也是一个对象(猫对象)
	        cat2.age = 100;
	        cat2.color = "花色";


	        System.out.println("第 1 只猫信息" + cat1.name
	                + " " + cat1.age + " " + cat1.color + " ");
	        System.out.println("第 2 只猫信息" + cat2.name
	                + " " + cat2.age + " " + cat2.color + " ");

	    }

	}

	//定义一个猫类 Cat -> 自定义的数据类型
	class Cat {      //属性/成员变量

	    String name; //名字
	    int age; //年龄
	    String color; //颜色

	//行为
	

}
