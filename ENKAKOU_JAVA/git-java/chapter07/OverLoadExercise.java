package chapter07;

public class OverLoadExercise {
	
	public static void main(String[] args) {
		
		//在主类的 main ()方法中分别用参数区别调用三个方法
		
		Methods method = new Methods();
		method.m(10);  
		method.m(10,20); 
		method.m("韩顺平 hello");
		
		System.out.println(method.max(10,24));
		System.out.println(method.max(10.0,21.4));
		System.out.println(method.max(10.0,1.4,30.0));
	}
}


class Methods {
	
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2, double n3) {
		System.out.println("max(double n1, double n2, double n3)");

		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}

	public double max(double n1, double n2, int n3) {
		System.out.println("max(double n1, double n2, int n3)");

		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
		
	}
		
		
	
	public void m(int n) {
		System.out.println("平方=" + (n * n ));
		
	}
	
	
	public void m(int n1, int n2) {
		System.out.println("相乘=" + (n1 * n2 ));
			
	}
	

	public void m(String str) {
		System.out.println("传入的str=" + str);
		
	}

}
