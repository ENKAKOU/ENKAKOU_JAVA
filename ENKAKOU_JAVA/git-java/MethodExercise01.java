public class MethodExercise01{
	public static void main(String[] args) {

    AAB a = new AAB();
    
    
    // boolean b = a.isOdd(1);
    /*
     if(a.isOdd(1)){  // true
     
    	System.out.print("是奇数");
    }else {
    	System.out.print("是偶数");
    }
    */
    
    a.print(10, 4, '*');
    
    
	}
}

class AAB{
	//类型；boolean；名字：isOdd；形参：int num；方法体：判断；
	
	public boolean isOdd(int num) {
		/* if(num % 2 != 0) {
		
			return true;
		}else {
			return false;
					
		}
		 */
		
		return num % 2 != 0; 
		
	}
	
	//类型；void；名字：print；形参：int row, int col; ；方法体：循环
	
	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			
			System.out.println();
			
		}
	}
}