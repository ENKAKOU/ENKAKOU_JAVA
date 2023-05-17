
public class TwoDimensionalArray01 {
	
    public static void main(String[] args){

    /*    请用二维数组输出如下图形
          0 0 0 0 0 0
          0 0 1 0 0 0
          0 2 0 3 0 0
          0 0 0 0 0 0     */

          //什么是二维数组：
          //1. 从定义形式上看 int[][]
          //2. 可以这样理解，原来的一维数组的每个元素是一维数组, 就构成二维数组
          int[][] arr = { {0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0,2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0} };
          System.out.println("二维数组的元素个数=" + arr.length);
          System.out.println("第3个一维数组的第 4 个值=" + arr[2][3]);
          for(int i = 0; i < arr.length; i++) {       //遍历二维数组的每个元素

            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");    //输出了一维数组
            }
            System.out.println();
        }
          

    }
}


