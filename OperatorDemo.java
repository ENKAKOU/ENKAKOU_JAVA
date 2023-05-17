//import javax.xml.ws.soap.MTOM;

public class OperatorDemo {
	
    /* 字符 + 操作  */
    public static void main(String[] args){
        //定义两个变量
        int i = 10;
        char c = 'A'; //'A'的值是65
        c = 'a'; //'a'的值是97
        c = '0'; //'c'的值是48
        System.out.println(i + c);

       // char ch = i + c;
        //char类型会被自动提升为int类型
        int j = i + c;
        System.out.println(j);

       // int k = 10 + 10.14; //不兼容类型，10.14是double类型的。从double转换到int可能会损失
        double d = 10 + 10.14;

        /*字符串 + 操作

         */
        System.out.println("it" + "java");
        System.out.println("it"+666); //出现字符串时，这个 + 是字符串连接符，不是算术运算
        System.out.println(666 + "it");
        System.out.println("it" + 666 + "java");
        System.out.println(1+ 99 + "java"); //算术运算，从左到右执行



    }
}
