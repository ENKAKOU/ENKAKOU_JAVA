package chapter05;

public class SwitchDetail {

	public static void main(String[] args) {
		
		char c = 'b';
		char c2 = 'c';
		switch(c) {
			case 'a' :
				System.out.println("ok1");
				break;
			case 'b'  :
				System.out.println("ok2");
				break;
			default :
				System.out.println("ok3");
		}

		System.out.println("退出了switch,继续执行..");
	}
}
