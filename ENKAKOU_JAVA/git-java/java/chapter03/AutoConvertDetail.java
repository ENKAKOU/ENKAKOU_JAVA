package java.code.chapter03;

public class AutoConvertDetail {

	public static void main(String[] args) {
		
		int n1 = 10; //ok
		//float d1 = n1 + 1.1;
		//double d1 = n1 + 1.1;
		float d1 = n1 + 1.1F;
		//int n2 = 1.1;
		
		byte b1 = 10; 
		// int n2 = 1; 
		// byte b2 = n2; 
		// char c1 = b1; 
	
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;
		int s2 = b2 + s1;
		//byte b4 = b2 + b3; 
	
		boolean pass = true;
		//int num100 = pass;

		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		float num300 = 1.1F;

		double num500 = b4 + s3 + num200 + num300; 
	}
}
