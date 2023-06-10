package chapter05;

public class ForDetail {

	public static void main(String[] args) {

		// int i = 1
		// for( ; i <= 10 ; ) {
		// 	System.out.println("hello，韩顺平教育" + i);
		// 	i++;
		// }

		// System.out.println("i=" + i);//11 ok
		
		// int j = 1;
		// 	System.out.println("ok~" + (j++));
		// }
		int count = 3;
		for (int i = 0,j = 0;  i < count; i++, j += 2) {
			System.out.println("i=" + i + " j=" + j);
		}

	}
}
