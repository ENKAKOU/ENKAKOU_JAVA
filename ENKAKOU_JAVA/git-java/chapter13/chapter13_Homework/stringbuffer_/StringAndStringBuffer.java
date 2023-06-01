package chapter13.chapter13_Homework.stringbuffer_;

public class StringAndStringBuffer {

    public static void main(String[] args) {
        String str = "hello tom";

        //方式1 使用构造器
        StringBuffer stringBuffer = new StringBuffer(str);

        //方式2 使用的是append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        StringBuffer stringBuffer3 = new StringBuffer("韩顺平教育");

        //方式1 使用StringBuffer提供的 toString方法
        String s = stringBuffer3.toString();

        //方式2: 使用构造器来搞定
        String s1 = new String(stringBuffer3);

    }
}
