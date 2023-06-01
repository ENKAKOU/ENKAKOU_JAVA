package java.code.chapter04;

public class ArithmeticOperator {

	public static void main(String[] args) {
	
		System.out.println(10 / 4); 
		System.out.println(10.0 / 4); 
		double d = 10 / 4;
		System.out.println(d);

		// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
		// 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
		// -10 % -3 =  (-10) - (-10) / (-3) * (-3) = -10 + 9 = -1
		System.out.println(10 % 3); 

		System.out.println(-10 % 3);
		System.out.println(10 % -3); 
		System.out.println(-10 % -3);

		
		int i = 10;
		i++;  //自增 等价于 i = i + 1; => i = 11
		++i;  //自增 等价于 i = i + 1; => i = 12
		System.out.println("i=" + i);
		
		int j = 8;
		//int k = ++j;
		int k = j++; 
		System.out.println("k=" + k + "j=" + j);//8 9
	}
}
