public class Array01 { 

	public static void main(String[] args) {
	
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;

		// double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		
		// double avgWeight = totalWeight / 6;
		// System.out.println("总体重=" + totalWeight 
		// 	+ "平均体重=" + avgWeight);
		double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 88.8,1.1,5.6,100};

		System.out.println("===使用数组解决===");
	
		//System.out.println("数组的长度=" + hens.length);
		double totalWeight = 0;
		for( int i = 0; i < hens.length; i++) {
			//System.out.println("第" + (i+1) + "个元素的值=" + hens[i]);
			totalWeight += hens[i];
		}

		System.out.println("总体重=" + totalWeight 
		 	+ "平均体重=" + (totalWeight / hens.length) );


		
	}
}
