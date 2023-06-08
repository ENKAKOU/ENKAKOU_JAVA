package chapter23.reflection.classload_;

public class ClassLoad03 {

    public static void main(String[] args) throws ClassNotFoundException {
//                clinit() {
//                    System.out.println("B 静态代码块被执行");
//                    //num = 300;
//                    num = 100;
//                }
//                合并: num = 100

//        //new B();
//        //System.out.println(B.num);
//
//        //看看加载类的时候，是有同步机制控制
//
//        protected Class<?> loadClass(String name, boolean resolve)
//        throws ClassNotFoundException
//        {
//            //正因为有这个机制，才能保证某个类在内存中, 只有一份Class对象
//            synchronized (getClassLoadingLock(name)) {
//            //....
//            }
//            }
//
        B b = new B();
    }
}


class B {
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B() {   //构造器
        System.out.println("B() 构造器被执行");

    }
}
