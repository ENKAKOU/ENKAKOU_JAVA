package java.code.chapter07;

public class VarParameterDetail {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		TT t1 = new TT();
		t1.f1(arr);
		
	}
}

class TT {
	
	public void f1(int... nums) {
		System.out.println("长度=" + nums.length);
	}

	public void f2(String str, double... nums) {

	}

	// public void f3(int... nums1, double... nums2) {

	// }
	
}