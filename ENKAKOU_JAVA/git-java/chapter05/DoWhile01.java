package chapter05;

public class DoWhile01 {

	public static void main(String[] args) {

		int i = 1; 
		do {
			System.out.println("你好，韩顺平教育" + i);
			i++;

		}while(i <= 10);

		System.out.println("退出 do..while 继续执行.." + i);//11
	}
}
