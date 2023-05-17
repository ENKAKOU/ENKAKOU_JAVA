public class BubbleSort {
	
    public static void main(String[] args) {
    	
        //我们将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有序数列。

        //方法一：基础分布式（繁琐）
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        /*   数组 [24,69,80,57,13]
             第 1 轮排序: 目标把最大数放在最后
               第 1 次比较[24,69,80,57,13]
               第 2 次比较[24,69,80,57,13]
               第 3 次比较[24,69,57,80,13]
               第 4 次比较[24,69,57,13,80]    */
        for (int j = 0; j < 4; j++) {   //4 次比较
            //如果前面的数>后面的数，就交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("==第 1 轮==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        /*   第 2 轮排序: 目标把第二大数放在倒数第二位置
               第 1 次比较[24,69,57,13,80]
               第 2 次比较[24,57,69,13,80]
               第 3 次比较[24,57,13,69,80]   */
        for (int j = 0; j < 3; j++) {   //3 次比较
            //如果前面的数>后面的数，就交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n==第 2 轮==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }


        for (int j = 0; j < 2; j++) {   //2 次比较
            //如果前面的数>后面的数，就交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n==第 3 轮==");


        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        for (int j = 0; j < 1; j++) {   //1 次比较
            //如果前面的数>后面的数，就交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n==第 4 轮==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println();



    }
}
