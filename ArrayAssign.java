
public class ArrayAssign {

	public static void main(String[] args){
        //数组赋值机制2

        //基本数据类型赋值，这个值就是具体的数据，而且相互不影响。
        int n1 = 2;
        int n2 = n1;
        n2 = 10;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);

        //数组在默认情况下是引用传递，赋的值是地址。
        int [] arr1 = {1,2,3};
        int [] arr2 = arr1;
        arr2[0] = 80;
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1 [i]);
        }

    }
}
