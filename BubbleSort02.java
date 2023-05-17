public class BubbleSort02 {
	
    public static void main(String[] args){
        //我们将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有序数列

          //方法二：化繁为简（先死后活）
        int [] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        for( int i = 0; i < arr.length - 1; i++) {              //外层循环是 4 次
            for( int j = 0; j < arr.length - 1 - i; j++) {     //4 次比较-3 次-2
            if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }
            System.out.println("\n == 第" + (i + 1) + "轮 ==");
            for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + "\t");
                }

        }

    }
}
