public class ArrayReverse {
    public static void main(String[] args){
  
        //arr {11,22,33,44,55,66} {66, 55,44,33,22,11

        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        int len = arr.length;              
        for( int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];//保存
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("===翻转后数组===");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

        int[] arr2= {11, 22, 33, 44, 55, 66};
        int[] arr3 = new int[arr.length];

        for(int i = arr2.length - 1, j = 0; i >= 0; i--, j++) {
            arr3[j] = arr2[i];
        }
        arr2 = arr3;
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

    }
}
