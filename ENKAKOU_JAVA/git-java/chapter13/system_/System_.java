package chapter13.system_;

import java.util.Arrays;

public class System_ {

    public static void main(String[] args) {

//        System.out.println("ok1");
//
//        exit(0) 表示程序退出
//        0 表示一个状态 , 正常的状态
//
//        System.exit(0);
//        System.out.println("ok2");
        int[] src={1,2,3};
        int[] dest = new int[3];

        System.arraycopy(src, 0, dest, 0, src.length);
        // int[] src={1,2,3};
        System.out.println("dest=" + Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());

    }
}
