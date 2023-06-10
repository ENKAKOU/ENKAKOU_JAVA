package chapter19.standard;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class InputAndOutput {

    public static void main(String[] args) {
        System.out.println(System.in.getClass());
        System.out.println(System.out.getClass());
        System.out.println("hello, 韩顺平教育~");

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String next = scanner.next();
        System.out.println("next=" + next);

        
    }
}
