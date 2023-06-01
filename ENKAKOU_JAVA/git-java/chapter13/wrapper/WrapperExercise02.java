package chapter13.wrapper;

public class WrapperExercise02 {

    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

//    public static Integer valueOf(int i) {
//            if (i >= IntegerCache.low && i <= IntegerCache.high)
//                return IntegerCache.cache[i + (-IntegerCache.low)];
//            return new Integer(i);
//        }

        Integer m = 1;      //底层 Integer.valueOf(1);
        Integer n = 1;      //底层 Integer.valueOf(1);
        System.out.println(m == n);

        Integer x = 128;      //底层Integer.valueOf(1);
        Integer y = 128;      //底层Integer.valueOf(1);
        System.out.println(x == y);

    }
}

