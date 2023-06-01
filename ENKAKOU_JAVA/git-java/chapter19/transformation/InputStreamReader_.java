package chapter19.transformation;

import java.io.*;

public class InputStreamReader_ {

    public static void main(String[] args) throws IOException {

        String filePath = "e:\\a.txt";
        //BufferedReader br = new BufferedReader(isr);

        //将2 和 3 合在一起
        BufferedReader br = new BufferedReader(new InputStreamReader(
                                                    new FileInputStream(filePath), "gbk"));

        //4. 读取
        String s = br.readLine();
        System.out.println("读取内容=" + s);
        //5. 关闭外层流
        br.close();

    }
}
