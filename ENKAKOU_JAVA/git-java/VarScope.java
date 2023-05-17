public class VarScope {
	
	public static void main(String[] args) {
		
	}
}

class cat {

    int age = 10;  //指定的值是 10
    double weight;   //默认值 0.0
    
    public void hi() {
    	int num = 1;
		String address = "北京的猫";
		System.out.println("num=" + num);
		System.out.println("address=" + address);
		System.out.println("weight=" + weight);
	}
    
    
    public void cry() {

    	//1. 局部变量一般是指在成员方法中定义的变量
    	//2. n 和 name 就是局部变量
    	//3. n 和 name 的作用域在 cry 方法
    	
		int n = 10;
		String name = "jack";
		System.out.println("在 cry 中使用属性 age=" + age);
	}

    public void eat() {

		System.out.println("在 eat 中使用属性 age=" + age);

		//System.out.println("在 eat 中使用 cry 的变量 name=" + name);//错误
	}
}