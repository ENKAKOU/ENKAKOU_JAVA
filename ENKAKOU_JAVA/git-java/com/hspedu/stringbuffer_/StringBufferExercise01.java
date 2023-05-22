package com.hspedu.stringbuffer_;

public class StringBufferExercise01 {

    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());

        System.out.println(sb);//null

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);

    }
}
