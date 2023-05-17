public class VarParameter01 {
	
	public static void main(String[] args) {
		
		HspMethod m = new HspMethod();
	
		System.out.println(m.sum(1, 5, 100));   //106
		System.out.println(m.sum(1,19));        //20
	}
}

class  HspMethod {
	public int sum(int n1, int n2) {   // 2个数的和
		return n1 + n2;
		
	}
	public int sum(int n1, int n2, int n3) {  // 3个数的和
		return n1 + n2 + n3;
		
	}
	
	public int sum(int n1, int n2, int n3, int n4) {  // 4个数的和
		return n1 + n2 + n3 + n4;
		
	}

	//public int sum(int...nums) {
		
	//}
	
	//遍历 nums 求和
	
	public int sum(int... nums) {
	    //System.out.println("接收的参数个数=" + nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
	
}