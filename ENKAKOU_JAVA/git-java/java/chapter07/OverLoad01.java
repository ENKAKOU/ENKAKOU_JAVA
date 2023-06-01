package java.code.chapter07;

public class OverLoad01 {
	
	public static void main(String[] args) {
		
		// System.out.println(100);
		// System.out.println("hello,world");
		// System.out.println('h');
		// System.out.println(1.1);
		// System.out.println(true);
				
		
	MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1.1, 2));
		System.out.println(mc.calculate(1, 2.1));
	}
}

class MyCalculator {
	
	public int calculate(int n1, int n2) {
		System.out.println("calculate(int n1, int n2) ");
		return n1 + n2;
		
	}
	
	public double calculate(int n1, double n2) {
		return n1 + n2;
		
	}
	
	public double calculate(double n1, int n2) {
		System.out.println("calculate(double n1, int n2) ");
		return n1 + n2;
	}
	public int calculate(int n1, int n2, int n3) {
		return n1 + n2 + n2;
		
	}
	
}
