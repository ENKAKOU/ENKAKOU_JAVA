package chapter07;

public class ThisHomeWork04{
	
	public static void main(String[] args){
		int[] oldArr = {10, 30, 50};
		A03 a03 = new A03();
		int[] newArr = a03.copyArr(oldArr);
		
		for(int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i] + "\t");
			
		}
		
	}
}

class A03 {
	
	public int[] copyArr(int[] oldArr){
		
		int[] newArr = new int[oldArr.length];
		for(int i = 0; i < oldArr.length; i++){
			newArr[i] = oldArr[i];
		
		}
		return newArr;
		
	}
}