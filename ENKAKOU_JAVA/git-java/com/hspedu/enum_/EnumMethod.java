package com.hspedu.enum_;

public class EnumMethod {

    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());

        Season2[] values = Season2.values();
        System.out.println("===遍历取出枚举对象(增强for）===");
        for (Season2 season: values) {
            System.out.println(season);
        }

        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1= " + autumn1);
        System.out.println(autumn == autumn1);

        /*
        public final int compareTo(E o) {
            return self.ordinal - other.ordinal;
        }
        Season2.AUTUMN - Season2.SUMMER
         */
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));

//        int[] nums = {1, 2, 9};
//
//        System.out.println("=====普通的for=====");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("=====增强的for=====");
//
//        for(int i : nums) {
//            System.out.println("i=" + i);
//        }

    }
}

