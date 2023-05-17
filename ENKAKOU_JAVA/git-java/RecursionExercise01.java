public class RecursionExercise01 {
	public static void main(String[] args) {
		
		BB t1 = new BB();
		// int n = 7;
		// int res = t1.fibonacci(n);
		// if(res != -1) {
		// System.out.println("当 n="+ n +" 对应的斐波那契数=" + res);
		// }
		
		//桃子问题
		int day = 0;
		int peachNum = t1.peach(day);
		if(peachNum != -1) {
		System.out.println("第 " + day + "天有" + peachNum + "个桃子");
		}

		
		
	}
}

class BB {

	 public int fibonacci(int n) {
		if( n >= 1) {
		   if( n == 1 || n == 2) {
		   return 1;
		} else {
		 
			return fibonacci(n-1) + fibonacci(n-2);
		   
		  }
		} else {
		   System.out.println("要求输入的 n>=1 的整数");
		    return -1;
		
		  }
	} 
	

	
	
	public int peach(int day) {
		if(day == 10) {          //第 10 天，只有 1 个桃
		  return 1;
		  
		} else if ( day >= 1 && day <=9 ) {
			
		  return (peach(day + 1) + 1) * 2;    
		  
		} else {
		   System.out.println("day 在 1-10");
		  return -1;
		
		}
		
	}
		

}
