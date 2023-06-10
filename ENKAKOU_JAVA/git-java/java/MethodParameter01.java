package java;

public class MethodParameter01 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		AAA obj = new AAA();
	obj.swap(a, b);

		System.out.println("\na=" + a + "b= " + b);   // a = 10   b= 20;
	}
}

class AAA {
	
	public void swap(int a, int b) {
		
		System.out.print("\na=" + a + "\tb= " + b);    //a = 10  b = 20 
		int tmp = a;
		a = b;
		b = tmp;
		System.out.print("\na=" + a + "\tb= " + b);    // a = 20   b = 10 
		
		
	}
} 
