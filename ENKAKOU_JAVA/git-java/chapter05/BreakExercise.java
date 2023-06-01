package java.code.chapter05;

public class BreakExercise {

	public static void main(String[] args) {
		
		int sum = 0; 

		int n = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum > 20) {
				System.out.println("和>20时候 当前数i=" + i);
				n = i;
				break;
			} 
		}

		System.out.println("当前数=" + n);
	}
}
