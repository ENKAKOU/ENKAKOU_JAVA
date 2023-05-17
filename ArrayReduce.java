import java.util.Scanner;

public class ArrayReduce{
	
    public static void main(String[] args){
        //有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。
        //当只剩下最后一个元素，提示，不能再缩减。

        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        boolean reduce = false;
        do{
            int[] arrNew = new int[arr.length - 1];
            for(int i = 0;i < arr.length - 1;i++){
                arrNew[i] = arr[i];
            }
            System.out.println("缩减完成，本次缩减元素为" + arr[arr.length-1]);
            arr = arrNew;
            System.out.print("arr数组 缩减后的值：");
            for(int i = 0;i < arr.length;i++){
                System.out.print(arr[i] + "  ");
            }
            if(arr.length == 1){
                System.out.println("\n arr数组现在只剩下最后一个元素，不能再缩减啦！");
                break;
            }
            System.out.print("\n 是否继续缩减(Y/N):");
            while(true){
                char kay = input.next().charAt(0);
                if(kay == 'n' || kay == 'N'){
                    System.out.println("好的");
                    break;
                }else if(kay == 'y' || kay == 'Y'){
                    reduce = true;
                    break;
                }else{
                    System.out.print("输入有误,请重新输入(Y/N)！");
                }
            }
        }while(reduce);
    }
}




