public class MethodParameter02{
	
	public static void main(String[] args) {
		
		WB b = new WB();
		int[] arr = {1, 2, 3};
		b.test100(arr);//调用方法
		
		System.out.println(" main 的 arr 数组 ");
		
		 for(int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + "\t");
		 }
	    System.out.println();
		
		
		//Person p = new Person();
		//p.name = "jack";
		//p.age = 10;
		//b.test200(p);
		
		//如果 test200 执行的是 p = null ,下面的结果是 10
		//如果 test200 执行的是 p = new Person();..., 下面输出的是 10 System.out.println("main 的 p.age=" + p.age);//10000
		
		//System.out.println("main 的 p.age=" + p.age);      //10000);
		
		} 
	}

class person{
	 String name;
	int age; 
}


class WB {
	
	public void test100(int[] arr) {
		
		arr[0] = 200;
		
		System.out.println("this is test100 arr ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			
		}
		
		System.out.println();
		
	}
	
    
}