package chapter10.abstract_;

public class AA extends Template {

    public void job() {
        long num = 0;
        for(long i = 1; i <= 800000; i++) {
            num += 1;
        }
    }
//    public void job2() {
//       long start = System.currentTimeMillis();
//       long num = 0;
//       for (long i = 1; i <= 200000; i++) {
//          num += i;
//       }

//       long end = System.currentTimeMillis();
//       System.out.println("AA 执行时间 " + (end - start));
//    }
}