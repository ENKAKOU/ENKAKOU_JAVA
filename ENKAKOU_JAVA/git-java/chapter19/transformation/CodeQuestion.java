package chapter19.transformation;

import java.io.*;

public class CodeQuestion {

    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println("读取到的内容: " + s);
        br.close();

        //InputStreamReader
        //OutputStreamWriter
    }
}
