package chapter07;

public class VarScope {
	
	public static void main(String[] args) {
		
	}
}

class cat {

    int age = 10; 
    double weight;  
    
    public void hi() {
    	int num = 1;
		String address = "北京的猫";
		System.out.println("num=" + num);
		System.out.println("address=" + address);
		System.out.println("weight=" + weight);
	}
    
    
    public void cry() {

		int n = 10;
		String name = "jack";
		System.out.println("在 cry 中使用属性 age=" + age);
	}

    public void eat() {

		System.out.println("在 eat 中使用属性 age=" + age);

		//System.out.println("在 eat 中使用 cry 的变量 name=" + name);//错误
	}
}
