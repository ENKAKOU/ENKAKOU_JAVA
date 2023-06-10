package chapter19.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {

    public static void main(String[] args) throws Exception {
        String filePath = "e:\\a.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line; //按行读取, 效率高
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

//            public void close() throws IOException {
//                synchronized (lock) {
//                    if (in == null)
//                        return;
//                    try {
//                        in.close();//in 就是我们传入的 new FileReader(filePath), 关闭了.
//                    } finally {
//                        in = null;
//                        cb = null;
//                    }
//                }
//            }
        bufferedReader.close();

    }
}
