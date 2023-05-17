public class ArrayReverse {
    public static void main(String[] args){

        //把数组的元素内容反转。
        //arr {11,22,33,44,55,66} {66, 55,44,33,22,11

        /* 方法一
        定义数组
        1. 把 arr[0] 和 arr[5] 进行交换 {66,22,33,44,55,11}
        2. 把 arr[1] 和 arr[4] 进行交换 {66,55,33,44,22,11}
        3. 把 arr[2] 和 arr[3] 进行交换 {66,55,44,33,22,11}
        4. 一共要交换 3 次 = arr.length / 2
        5. 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length - 1 -i  */

        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        int len = arr.length;               //计算数组的长度
        for( int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];//保存
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("===翻转后数组===");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");//66,55,44,33,22,11
        }

        System.out.println();


        /* 方法二
        定义数组 （使用逆序赋值方式）
        1. 先创建一个新的数组 arr2 ,大小 arr.length
        2. 逆序遍历 arr ,将 每个元素拷贝到 arr2 的元素中(顺序拷贝)
        3. 建议增加一个循环变量 j -> 0 -> 5
        4. 当 for 循环结束，arr2 就是一个逆序的数组 {66, 55, 44,33, 22, 11}
        5. 让 arr 指向 arr2 数据空间, 此时 arr 原来的数据空间就没有变量引用   */

        int[] arr2= {11, 22, 33, 44, 55, 66};
        int[] arr3 = new int[arr.length];
         //逆序遍历 arr
        for(int i = arr2.length - 1, j = 0; i >= 0; i--, j++) {
            arr3[j] = arr2[i];
        }
        // 会被当做垃圾，销毁
        arr2 = arr3;

        //输出 arr2
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

    }
}
