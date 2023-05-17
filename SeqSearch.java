import java.util.Scanner;

public class SeqSearch {
	
	
    public static void main(String[] args){
        /*   有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
             从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
             要求: 如果找到了，就提示找到，并给出下标值
        思路:
             1. 定义一个字符串数组
             2. 创建Scanner对象，接收用户输入, 遍历数组，逐一比较，如果有，则提示信息，并退出   */

             //定义一个字符串数组
        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入名字");
        String findName = myScanner.next();

             //遍历数组，逐一比较，如果有，则提示信息，并退出
        int index = -1;
        for(int i = 0; i < names.length; i++) {
             //比较 字符串比较 equals, 如果要找到名字就是当前元素
            if(findName.equals(names[i])) {
                System.out.println("恭喜你找到 " + findName);
                System.out.println("下标为= " + i);
             //把 i 保存到 index
                index = i;
                break;//退出
            }
        }
        if(index == -1) { //没有找到
            System.out.println("sorry ,没有找到 " + findName);
        }


        /*  请对一个有序数组进行二分查找 {1,8, 10, 89, 1000, 1234} ，输入一个数看看该数组是否存在此数，
            并且求出下标，如果没有就提示"没有这个数"。

            思路：
                1. 首先确定该数组的中间的下标mid = (left + right) / 2；*/

    }
}


