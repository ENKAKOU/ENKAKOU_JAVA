package chapter19.outputstream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

    public static void main(String[] args) {

    }

    public void writeFile() {
        //创建 FileOutputStream对象
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath, true);
            String str = "hsp,world!";
            fileOutputStream.write(str.getBytes(), 0, 3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

