package chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {

    public static void main(String[] args) {
        Integer[] integers = {1, 20, 90};
//        for(int i = 0; i < integers.length; i++) {
//            System.out.println(integers[i]);
//       }
//            System.out.println(Arrays.toString(integers));
        Integer arr[] = {1, -1, 7, 0, 89};

//     while (left < right) {
//            int mid = (left + right) >>> 1;
//            if (c.compare(pivot, a[mid]) < 0) {
//              right = mid;
//            } else {
//            left = mid + 1;
//       }

//     new Comparator() {
//            public int compare(Object o1, Object o2) {
//              Integer i1 = (Integer) o1;
//              Integer i2 = (Integer) o2;
//               return i2 - i1;
//            }
//       }

        Arrays.sort(arr, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });

        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr));

    }
}
